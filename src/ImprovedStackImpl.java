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

    
}
