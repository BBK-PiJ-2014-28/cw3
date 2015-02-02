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
}
