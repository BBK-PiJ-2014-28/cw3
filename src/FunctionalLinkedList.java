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
    @Override
    public ReturnObject head(){
        if(isEmpty()){
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            ReturnObject requestedObject = get(0);
            return requestedObject;
        }
    }

    /**
     * {@InheritDoc}
     */
    @Override
    public FunctionalList rest(){
        FunctionalList requestedList = new FunctionalLinkedList();
        if(isEmpty()){
            return requestedList;
        } else {
            /**
             * For the life of me I cannot see how this should be different
             * to the FunctionalArrayList - all differences in data structure
             * are dealt with in the LinkedList methods (which are far more complicated)
             * So, once again here is a For loop to transfer the list values to the
             * new list, starting at i=1 to cut out the head of the list
             */
            for(int i = 1; i < size(); i++){
                Object listObject = get(i).getReturnValue();
                requestedList.add(listObject);
            }
            return requestedList;
        }
    }


}