/**
 *  An implementation of ImprovedStack
 *  By Annabel Jump for Programming in Java Coursework 3
 *  @author Annabel Jump
 *  {@InheritDoc}
 */

public class ImprovedStackImpl implements ImprovedStack {

    //need to create stack + list to use in this class
    private List myList;
    private Stack myStack;

    /**
     * construct new ImprovedStackImpl
     * @param desired type of list
     */
    public ImprovedStackImpl(List newList) {
        myList = newList;
        myStack = new StackImpl(myList);
    }

    /**
     * now all methods from StackImpl should be inserted
     * to allow full functionality of ImprovedStackImpl
     */
    @Override //just in case
    public boolean isEmpty(){
        if(myStack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size(){
        return myStack.size();
    }

    @Override
    public void push(Object item){
        myStack.push(item); //push() in StackImpl will add() item
    }

    @Override
    public ReturnObject top(){
        return myStack.top();
    }

    @Override
    public ReturnObject pop(){
        return myStack.pop();
    }

    /**
     * {@InheritDoc}
     */
    @Override
    public ImprovedStack reverse(){
        //Create new ImprovedStackImpl to take reversed list
        ImprovedStack backwardsStack = new ImprovedStackImpl();
        int size = myStack.size();
        /**
         * Adapt For loop from other classes
         * using i-- will ensure reverse order
         */
        for(int i = size - 1; i >= 0; i--){
            Object item = myList.get(i).getReturnValue();
            backwardsStack.push(item);
        }
        return backwardsStack;
    }

    /**
     * {@InheritDoc}
     */
    @Override
    public void remove(Object object){
        int size = myStack.size();
        //use For loop to check all entries in Stack/List
        for(int i = 0; i < size; i++){
            if(myList.get(i).getReturnValue().equals(object)){
                //remove the object from the stack
                myList.remove(i);
            }
        }
        return null;
    }
}
