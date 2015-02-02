/**
 *  A class implementing FunctionalList interface
 *  Extends ArrayList
 *  By Annabel Jump for Programming in Java Coursework 3
 *  @author Annabel Jump
 */

public class FunctionalArrayList extends ArrayList implements FunctionalList {
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

    /**
     * Returns a list with the elements in this list except the
     * head. The elements must be in the same order. The original list
     * must not change or be affected by changes in the new list.
     *
     * If the list is empty, another empty list is returned.
     */
    public FunctionalList rest(){

    }

}