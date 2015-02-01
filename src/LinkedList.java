/**
 *  A class implementing List interface using pointers.
 *  By Annabel Jump for Programming in Java Coursework 3
 *  @author Annabel Jump
 */

public class LinkedList implements List {
    /**
     * Previous version unnecessarily complicated
     * New class needed = ObjectNode
     * Including getters, setters
     */

    private ObjectNode head;

    public LinkedList() {
        head = null;
    }

    //new class for LinkedList
    public class ObjectNode {
        private Object thing;
        private ObjectNode next;

        public ObjectNode(Object thing) {
            this.thing = thing;
            this.next = null;
        }

        public Object getObject() {
            return thing;
        }

        public ObjectNode getNext() {
            return next;
        }

        public void setNext(ObjectNode newThing) {
            this.next = newThing;
        }

        /**method to determine how many variables in list (for size() below)
         * @return how many variables in list
         */
        public int howMany() {
            if(next == null){
                return 1;
            } else {
                return 1 + next.howMany();
            }
        }

    }

    /**
     * @return true if the list is empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        if(head == null){
            return true;
        } else {
            return false;
        }
    }
}

    /**
     * @return the number of items currently in the list
     */
    @Override
    public int size() {
        if(head == null){
            return 0;
        } else {
            return head.howMany();
        }
    }

}