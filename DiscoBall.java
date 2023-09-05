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


public class DiscoBall {
    private SVGDocument svgDocument;

    // constructor for DiscoBall
    public DiscoBall(String svgFilePath) {
        this.svgDocument = loadSVGDocument(svgFilePath);
        LinkedList[] rings = new LinkedList[21];
        populateRings();
    }

    // implement populateRings() method
    public populateRings() {
        // for each ring in the disco ball
        for (int i = 0; i < 21; i++) {
            // create a new linked list
            LinkedList<Node> ring = new LinkedList<Node>();
            // add the first node to the linked list
            ring.add(new Node("0"));
            // for each square in the ring
            for (int j = 1; j < 21; j++) {
                // add a new node to the linked list
                ring.add(new Node(Integer.toString(j)));
            }
            // add the linked list to the array
            rings[i] = ring;
        }
    }

    public void changeRingColor(int ringIndex, String colorHex) {
        NodeList ringElements = findRingElements();
        Element targetRing = (Element) ringElements.item(ringIndex);

        // Modify the fill attribute of the target ring element
        targetRing.setAttribute("fill", colorHex);
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

    private NodeList findRingElements() {
        // Implement logic to find and return the NodeList of ring elements
    }
}

class Node {
    private Node prev;
    private Node next;
    private String id;

    public Node(String id) {
        this.id = id;
        this.prev = null;
        this.next = null;
    }

    // Getters and setters for prev, next, and id
    public Node getPrev() {
        return this.prev;
    }
    public Node getNext() {
        return this.next;
    }
    public String getId() {
        return this.id;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public void setId(String id) {
        this.id = id;
    }
}
