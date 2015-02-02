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
     * Returns a copy of this stack with the items reversed, the top
     * elements on the original stack is at the bottom of the new
     * stack and viceversa.
     *
     * @return a copy of this stack with the items reversed.
     */
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
}
