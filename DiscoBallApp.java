import java.lang.reflect.Array;
import java.util.LinkedList;

import org.w3c.dom.Node;

public class DiscoBallApp {
    public static void main(String[] args) {
        try {
            DiscoBall discoBall = new DiscoBall("disco_ball.svg");

            // create an array of Double Linked Lists to store each square
            // each entry in the array represents a row or ring in the disco ball

            LinkedList[] rings = new LinkedList[21];

            populateRings();


            
            for (int ringIndex = 0; ringIndex < 12; ringIndex++) {
                String randomColor = generateRandomColor();
                discoBall.changeRingColor(ringIndex, randomColor);
            }
            
            discoBall.saveSVG("discoball_modified.svg");
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    private static String generateRandomColor() {
        // Generate a random color in hexadecimal format (e.g., "#RRGGBB")
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
}
