import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.util.XMLResourceDescriptor;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.svg.SVGDocument;
import org.w3c.dom.svg.SVGRect;

import java.io.File;
import java.io.IOException;



public class DiscoBall {
    private SVGDocument svgDocument;

    public DiscoBall(String svgFilePath) {
        this.svgDocument = loadSVGDocument(svgFilePath);
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
