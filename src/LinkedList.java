/**
 *  A class implementing List interface using pointers.
 *  By Annabel Jump for Programming in Java Coursework 3
 *  @author Annabel Jump
 *  {@InheritDoc}
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

        /**
         * method to retrieve variable at certain point in list
         * @param index (int position)
         * @return the variable at the position
         */
        public ObjectNode getNode(int index){
            if(next == null){
                return null;
            } else if(index == 0) {
                return this;
            } else {
                return next.getNode(index - 1);
            }
        }

        /**
         * Method to update pointers for removal of item in list
         * Invoked by remove() below
         */
        public void ObjectNode bypassNode(int index){
            if(index == 0){
                head = head.getNext();
            } else {
                ObjectNode before = getNode(index - 1);
                ObjectNode after = getNode(index + 1);
                before.setNext(after);
            }
        }

        /**
         * Method to add new Node at index point in list
         * Invoked by add(int, ObjectNode) below
         */
        public void ObjectNode addNode(int index, ObjectNode newNode){
            if(index == 0){
                ObjectNode second = head;
                head = newNode;
                head.setNext(second);
            } else {
                ObjectNode before = head.getNode(index - 1);
                ObjectNode after = head.getNode(index);
                before.setNext(newNode);
                newNode.setNext(after);
            }
        }

        /**
         * Method to add variable at end of LinkedList
         * Invoked by add(Object) below
         */
        public void ObjectNode endNode(ObjectNode newNode){
            if(head == null){
                head = newNode;
            } else {
                int endList = head.howMany();
                ObjectNode secondLast = head.getNode(endList);
                secondLast.setNext(newNode);
            }
        }
    }

    /**
     * {@InheritDoc}
     */
    @Override
    public boolean isEmpty() {
        if(head == null){
            return true;
        } else {
            return false;
        }
    }


    /**
     * {@InheritDoc}
     */
    @Override
    public int size() {
        if(head == null){
            return 0;
        } else {
            return head.howMany();
        }
    }

    /**
     *{@InheritDoc}
     */
    @Override
    public ReturnObject get(int index){
        int size = size();
        //determines whether requested position exists
        if(index < 0 || index >= size){
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else if(isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPY_STRUCTURE);
        } else {
            // returns object at index position (method in ObjectNode class)
            ObjectNode element = head.getNode(index);
            return new ReturnObjectImpl(element.getObject());
        }
    }
    /**
     * {@InheritDoc}
     */
    @Override
    public ReturnObject remove(int index){
        /**
         * As in ArrayList, use get method to supply element to return
         * (or return error for invalid request)
         */
        ReturnObject removedObject = get(index);
        //If no error returned, invoke updating of pointers
        if(!removedObject.hasError()){
            bypassNode(index);
            return removedObject;
        } else {
            return removedObject;
        }
    }

    /**
     * {@InheritDoc}
     */
    public ReturnObject add(int index, Object item){
        int size = size();
        //no null objects allowed
        if(item == null){
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
            //index error if negative or >= size of list
        } else if(index < 0 || index >= size) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else {
            ObjectNode addedNode = new ObjectNode(item);
            addNode(index, addedNode);
            return null;
        }
    }
    /**
     * {@InheritDoc}
     */
    public ReturnObject add(Object item){
        //no null objects allowed
        if(item == null) {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        } else {
            ObjectNode addedNode = new ObjectNode(item);
            endNode(addedNode);
            return null;
        }
    }
}