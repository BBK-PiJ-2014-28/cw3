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
     *{@InheritDoc}
     */
    @Override
    public FunctionalList rest(){
        FunctionalList requestedList = new FunctionalArrayList();
        if(isEmpty()){
            return requestedList;
        } else {
            /**
             * For loop to copy values to new List
             * Starting at i = 1 means head (at 0) is excluded
             * get() does not remove the value from the original list.
             */
            for(int i = 1; i < size(); i++){
                Object listObject = get(i).getReturnValue();
                requestedList.add(listObject);
            }
            return requestedList;
        }
    }

}