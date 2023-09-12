import org.apache.batik.util.XMLResourceDescriptor;
//import org.openrndr.svg.SVGDocument;
//import org.apache.batik.dom.svg.SVGDocument;
import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
//import org.apache.batik.anim.dom.SVGDOMImplementation;
//import org.apache.batik.anim.dom.SVGOMPathElement;
import org.apache.batik.anim.dom.SVGOMPolygonElement;
//import org.apache.batik.anim.dom.SVGOMRectElement;
//import org.apache.batik.anim.dom.SVGOMSVGElement;
import org.apache.batik.anim.dom.SVGOMDocument;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
//import org.w3c.dom.DOMImplementation;
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

//import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.HashMap;

 
public class DiscoBall {
    //private static SVGDocument svgDocument;
    private static SVGOMDocument svgDocument;
    // Initialize the array to store 21 rows
    @SuppressWarnings("unchecked")
    private LinkedList<Node>[] rings = new LinkedList[21];
    public HashMap<String, String> colors;


    // constructor for DiscoBall
    public DiscoBall(String svgFilePath) {
        svgDocument = loadSVGDocument(svgFilePath);
        System.out.println(svgDocument);

        populateColorsMap();
        populateRows();
    }

    public static void main(String[] args) {
        DiscoBall discoBall = new DiscoBall("img/discoball.svg");
        for (int i = 0; i < 26; i++) {
            discoBall.changePolygonColorSVG(10, i, "green"); 
        }
        discoBall.changePolygonColorSVG(10, 5, "green");
        discoBall.saveSVG();
    }
    
    public void populateRows() {    
        for (int i = 0; i < 21; i++) {
            String groupName = "row" + (i + 1); // row names are like row1, row2, etc
            NodeList pathNodes = svgDocument.getElementsByTagName("polygon");
            LinkedList<Node> rowList = new LinkedList<>();
    
            // Iterate through path elements and add them to the row's linked list
            for (int j = 0; j < pathNodes.getLength(); j++) {
                Node node = pathNodes.item(j);
                if (node.getParentNode().getNodeName().equals("g")) {
                    String groupId = node.getParentNode().getAttributes().getNamedItem("id").getNodeValue();
    
                    if (groupId.equals(groupName)) {
                        rowList.add(node);
                    }
                }
            }
    
            rings[i] = rowList; // Store the linked list in the corresponding row
    
            // Print out the contents of the row
            System.out.println("Row " + (i + 1) + ": " + rowList.size() + " elements");
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

    public void changePolygonColorSVG(int rowIndex, int polygonIndex, String color) {
        LinkedList<Node> row = rings[rowIndex];
        String colorHex = colors.get(color);

        if (row != null && polygonIndex >= 0 && polygonIndex < row.size()) {
            Node polygonNode = row.get(polygonIndex);
            if (polygonNode instanceof SVGOMPolygonElement) {
                SVGOMPolygonElement polygonElement = (SVGOMPolygonElement) polygonNode;
                polygonElement.setAttribute("fill", colorHex); // Update the fill color
            }
        }
    }


    public void saveSVG() {
        try {
            String filePath = "img/DiscoBall_Modified.svg"; // File path to save or open
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

    private SVGOMDocument loadSVGDocument(String svgFilePath) {
        try {
            String parser = XMLResourceDescriptor.getXMLParserClassName();
            SAXSVGDocumentFactory factory = new SAXSVGDocumentFactory(parser);
            Document document = factory.createSVGDocument(new File(svgFilePath).toURI().toString());
    
            if (document instanceof SVGOMDocument) {
                return (SVGOMDocument) document;
            } else {
                throw new IllegalArgumentException("The loaded document is not an SVG document.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
