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
    public void push(Object item){
        internalList.add(item);
    }
    
}