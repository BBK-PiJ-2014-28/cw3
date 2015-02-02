/**
 *  A class implementing FunctionalList interface
 *  Extends LinkedList
 *  By Annabel Jump for Programming in Java Coursework 3
 *  @author Annabel Jump
 */

public class FunctionalLinkedList extends LinkedList implements FunctionalList{
    /**
     *{@InheritDoc}
     */
    public ReturnObject head(){
        if(isEmpty()){
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            ReturnObject requestedObject = get(0);
            return requestedObject;
        }
    }


}