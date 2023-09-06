
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ListParser {

    private LinkedList<Node>[] linkedListArray;

    public ListParser() {
        linkedListArray = new LinkedList[21];
    }

    public ListParser(int numRings) {
        linkedListArray = new LinkedList[numRings];
    }

    public getLinkedListArray() {
        return linkedListArray;
    }

    public readID() {
        try {
            //BufferedReader reader = new BufferedReader(new FileReader("../rowID.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("rowID.txt"));
            String line;
            LinkedList<Node>[] linkedListArray = new LinkedList[21]; // Specify the desired size
            int index = 0;

            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    index++; // Move to the next index
                    if (index >= linkedListArray.length) {
                        break; // Stop if all indices are filled
                    }
                } else {
                    LinkedList<Node> linkedList = createLinkedList(line);
                    linkedListArray[index] = linkedList;
                }
            }

            reader.close();

            // Print the array of linked lists
            printLinkedListArray(linkedListArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LinkedList<Node> createLinkedList(String line) {
        LinkedList<Node> linkedList = new LinkedList<>();
        String[] ids = line.split(" ");

        for (String id : ids) {
            linkedList.add(new Node("path" + id));
        }

        return linkedList;
    }

    public static void printLinkedListArray(LinkedList<Node>[] linkedListArray) {
        for (int i = 0; i < linkedListArray.length; i++) {
            System.out.println("Linked List at Index " + i + ":");
            if (linkedListArray[i] != null) {
                printLinkedList(linkedListArray[i]);
            } else {
                System.out.println("Empty");
            }
            System.out.println();
        }
    }

    public static void printLinkedList(LinkedList<Node> linkedList) {
        int index = 1;
        for (Node node : linkedList) {
            System.out.println("Node" + index + ": " + node.getId());
            index++;
        }
    }
}

class Node {
    private String id;

    public Node(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
