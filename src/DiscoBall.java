import org.apache.batik.util.XMLResourceDescriptor;
import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.anim.dom.SVGOMPolygonElement;
import org.apache.batik.anim.dom.SVGOMDocument;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import java.util.LinkedList;
import java.util.HashMap;

 
public class DiscoBall {
    private static SVGOMDocument svgDocument;
    // Initialize the array to store 21 rows
    @SuppressWarnings("unchecked")
    private LinkedList<Node>[] rings = new LinkedList[21];
    public HashMap<String, String> colors;

    public DiscoBall() {
        svgDocument = loadSVGDocument("disco-ball-app/img/discoball.svg");
        populateColorsMap();
        populateRows();
    }

    public static void main(String[] args) {
        DiscoBall discoBall = new DiscoBall();
        discoBall.printRings();
        for (int i = 0; i < 26; i++) {
            discoBall.changePolygonColorSVG(10, i, "green"); 
            discoBall.saveSVG();
        }
        //discoBall.changePolygonColorSVG(10, 5, "green");
        discoBall.saveSVG();
    }

    // print out contents of the rings array
    public void printRings() {
        for (int i = 0; i < rings.length; i++) {
            LinkedList<Node> row = rings[i];
            if (row != null) {
                System.out.println("Row " + (i + 1) + ": " + row.size() + " polygons");
            }
        }
    }
    
    private void populateRows() {
        if (svgDocument != null) {
            for (int rowIndex = 0; rowIndex < 21; rowIndex++) {
                String rowId = "row" + (rowIndex + 1);
                Element rowElement = svgDocument.getElementById(rowId);
    
                if (rowElement != null) {
                    NodeList polygonNodes = rowElement.getElementsByTagName("polygon");
                    LinkedList<Node> row = new LinkedList<>();
    
                    for (int i = 0; i < polygonNodes.getLength(); i++) {
                        Node polygonNode = polygonNodes.item(i);
    
                        if (polygonNode instanceof SVGOMPolygonElement) {
                            SVGOMPolygonElement polygonElement = (SVGOMPolygonElement) polygonNode;
                            String cssClass = polygonElement.getAttribute("class");
                            row.add(polygonNode);
                        }
                    }
    
                    rings[rowIndex] = row;
                }
            }
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
            if (polygonNode instanceof Element) {
                Element polygonElement = (Element) polygonNode;

                // Get the list of CSS classes for the element
                String cssClasses = polygonElement.getAttribute("class");

                // Change the fill color for each CSS class
                if (!cssClasses.isEmpty()) {
                    String[] classes = cssClasses.split("\\s+");
                    for (String cssClass : classes) {
                        polygonElement.setAttribute("fill", colorHex);
                    }
                }
            }
    }
}

    public void saveSVG() {
        try {
            // Define the file path where you want to save the modified SVG
            String filePath = "disco-ball-app/img/discoball-mod.svg";
    
            // Create a new transformer factory and transformer
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
    
            // Create a source from the modified SVG document
            DOMSource source = new DOMSource(svgDocument);
    
            // Create a result for the output file
            File outputFile = new File(filePath);
            StreamResult result = new StreamResult(outputFile);
    
            // Transform and save the modified SVG document to the output file
            transformer.transform(source, result);
    
            //System.out.println("Modified SVG saved to " + filePath);
        } catch (Exception e) {
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
