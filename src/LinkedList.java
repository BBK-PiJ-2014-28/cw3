/**
 *  A class implementing List interface using pointers.
 *  By Annabel Jump for Programming in Java Coursework 3
 *  @author Annabel Jump
 */

public class LinkedList implements List {
    /**
     * Two new classes are required to implement the LinkedList
     * (ObjectLinkedList and ObjectNode)
     * Together with their own constructor methods
     */

    public class ObjectLinkedList {

        private ObjectNode head;
        public ObjectLinkedList() {
            head = null;
        }

        public void add(Object item) {
            ObjectNode newObject = new ObjectNode(item);
            if (head == null) {
                head = newObject;
                return;
            }
            ObjectNode node = head;
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(newObject);
        }
    }

}