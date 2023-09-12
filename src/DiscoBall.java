import org.apache.batik.util.XMLResourceDescriptor;
import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.anim.dom.SVGDOMImplementation;
import org.apache.batik.anim.dom.SVGOMPathElement;
import org.apache.batik.anim.dom.SVGOMRectElement;
import org.apache.batik.anim.dom.SVGOMSVGElement;
import org.apache.batik.anim.dom.SVGOMDocument;
import org.apache.batik.anim.dom.SVGDOMImplementation;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.HashMap;

 
public class DiscoBall {
    private static SVGDocument svgDocument;
    private LinkedList<Node>[] rings;
    public HashMap<String, String> colors;


    // constructor for DiscoBall
    public DiscoBall(String svgFilePath) {
        this.svgDocument = loadSVGDocument(svgFilePath);
        populateColorsMap();
        populateRows();
    }

    public static void main(String[] args) {
        DiscoBall discoBall = new DiscoBall("img/disco-ball.svg");
        discoBall.changeSquareColorSVG(10, 5, "red"); // Change the color of the 6th square in the 11th row to red
        discoBall.saveSVG(svgDocument, "img/disco-ball-red.svg");
    }
    
    public void populateRows() {
        rings = new LinkedList[21]; // Initialize the array to store 21 rows
    
        for (int i = 0; i < 21; i++) {
            String groupName = "row" + (i + 1); // row names are like row1, row2, etc
            NodeList pathNodes = svgDocument.getElementsByTagName("path");
            LinkedList<Node> rowList = new LinkedList<>();
    
            // Iterate through path elements and add them to the row's linked list
            for (int j = 0; j < pathNodes.getLength(); j++) {
                Node node = pathNodes.item(j);
                if (node.getParentNode().getNodeName().equals("g") &&
                    node.getParentNode().getAttributes().getNamedItem("id").getNodeValue().equals(groupName)) {
                    rowList.add(node);
                }
            }
    
            rings[i] = rowList; // Store the linked list in the corresponding row
        }
    }
    
    // usage example: colors.get("silver") returns "#bebebe";
    // String colorHex = colors.get("silver");
    private void populateColorsMap() {
        colors = new HashMap<>();
        colors.put("silver", "#bebebe");
        colors.put("green", "#b6d7a8");
        colors.put("blue", "#9cc9f3");
        colors.put("pink", "#f5c8de");
        colors.put("orange", "#f4bd84");
        colors.put("yellow", "#ffe599");
        colors.put("purple", "#b6a7de");
        // below colors not used
        colors.put("red", "#ff0000");
        colors.put("indigo", "#4b0082");
        colors.put("violet", "#ee82ee");
        colors.put("white", "#ffffff");
        colors.put("black", "#000000");
    }

    public void changePathColorSVG(int rowIndex, int pathIndex, String color) {
        LinkedList<Node> row = rings[rowIndex];
        String colorHex = colors.get(color);
    
        if (row != null && pathIndex >= 0 && pathIndex < row.size()) {
            Node pathNode = row.get(pathIndex);
            if (pathNode instanceof SVGOMPathElement) {
                SVGOMPathElement pathElement = (SVGOMPathElement) pathNode;
                pathElement.setAttribute("fill", colorHex); // Update the fill color
            }
        }
    }

    public static void saveSVG(SVGDocument svgDocument, String filePath) {
        try {
            // Assuming you have an OutputStream to write to the SVG file
            OutputStream outputStream = new FileOutputStream(filePath);
    
            // Use a Transformer to serialize the updated DOM to the file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(svgDocument);
            StreamResult result = new StreamResult(outputStream);
            transformer.transform(source, result);
    
            // Close the output stream
            outputStream.close();
        } catch (Exception e) {
            // Handle exceptions here
            e.printStackTrace();
        }
    }
    

    private SVGDocument loadSVGDocument(String svgFilePath) {
        try {
            String parser = XMLResourceDescriptor.getXMLParserClassName();
            SAXSVGDocumentFactory factory = new SAXSVGDocumentFactory(parser);
            return factory.createSVGDocument(new File(svgFilePath).toURI().toString());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
