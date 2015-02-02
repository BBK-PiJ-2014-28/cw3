/**
 *  A class that extends AbstractStack
 *  By Annabel Jump for Programming in Java Coursework 3
 *  @author Annabel Jump
 *  {@InheritDoc}
 */

public class StackImpl extends AbstractStack {

    //Create list
    public StackImpl(List list){
        super(list);
    }

    /**
     * Methods from Stack needed to extend AbstractStack specifically
     * because AbstractStack uses a PROTECTED list. Must link the
     * protected list to the public list in AbstractStack
     * {@InheritDoc}
     */
    @Override
    public boolean isEmpty(){
        if(internalList.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    /**
     * {@InheritDoc}
     */
    @Override
    public int size(){
        return internalList.size();
    }

    /**
     *{@InheritDoc}
     */
    @Override
    public void push(Object item){
        internalList.add(item);
        //adding with just Object parameter adds to end/top of list
    }

    /**
     * {@InheritDoc}
     */
    @Override
    public ReturnObject top(){
        ReturnObject requestedObject;
        int size = internalList.size();
        //size - 1 should be last/top variable in list
        requestedObject = internalList.get(size - 1);
        /**
         * internal measures within the get() methods should
         * take care of returning errors for empty stacks
         * get() methods do not modify the list itself
         */
        return requestedObject;
    }

    /**
     * {@InheritDoc}
     */
    @Override
    public ReturnObject pop(){
        ReturnObject requestedObject;
        int size = internalList.size();
        /**
         * remove() methods in list implementations should remove from the
         * list; setting size - 1 means last/top variable should be removed
         */
        requestedObject = internalList.remove(size - 1);
        return requestedObject;
    }
}