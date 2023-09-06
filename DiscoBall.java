
import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.util.XMLResourceDescriptor;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.svg.SVGDocument;
import org.w3c.dom.svg.SVGRect;

import java.io.File;
import java.io.IOException;

import java.lang.reflect.Array;
import java.util.LinkedList;

import ListParser.java;
import disco-ball-app.ListParser;
import disco-ball-app.PathExtractor;


public class DiscoBall {
    private SVGDocument svgDocument;
    private LinkedList<Node>[] rings;

    // constructor for DiscoBall
    public DiscoBall(String svgFilePath) {
        this.svgDocument = loadSVGDocument(svgFilePath);
        ListParser listParser = new ListParser();
        listParser.readID();
        rings = listParser.getLinkedListArray();
    }

    public DiscoBall(String svgFilePath, int numRings) {
        this.svgDocument = loadSVGDocument(svgFilePath);
        ListParser listParser = new ListParser(numRings);
        listParser.readID();
        rings = listParser.getLinkedListArray();
    }


    public void changeRingColorSVG(int ringIndex, String colorHex) {
        LinkedList<Node> ring = rings[ringIndex];

        if (ring != null) {
            for (Node node : ring) {
                String squareId = node.getId();
                Element squareElement = findSquareElement(squareId);

                if (squareElement != null) {
                    squareElement.setAttribute("fill", colorHex); // Update the fill color
                }
            }
        }
    }

    private Element findSquareElement(String squareId) {
        NodeList rectElements = svgDocument.getElementsByTagName("rect");
        
        for (int i = 0; i < rectElements.getLength(); i++) {
            Element rectElement = (Element) rectElements.item(i);
            NamedNodeMap attributes = rectElement.getAttributes();
            
            for (int j = 0; j < attributes.getLength(); j++) {
                if (attributes.item(j).getNodeValue().equals(squareId)) {
                    return rectElement;
                }
            }
        }
        
        return null;
    }



    public void changeRingColor(int ringIndex, String colorHex) {
        LinkedList<Node> ring = rings[ringIndex];

        if (ring != null) {
            for (Node node : ring) {
                node.setId("path" + colorHex); // Update the ID with new color
            }
        }
    }

    public void saveSVG(String outputFilePath) {
        SVGUtils.writeSVGDocument(svgDocument, new File(outputFilePath));
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
