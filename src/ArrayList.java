/**
 *  A class implementing List interface as an Array.
 *  By Annabel Jump for Programming in Java Coursework 3
 *  @author Annabel Jump
 */

public class ArrayList implements List {
    //initialise list variables
    private Object[] myArray;
    private static int STARTING_SIZE = 7;
    private int size;

    //constructs an empty array
    public ArrayList() {
        myArray = Object[STARTING_SIZE];
        size = 0;
    }

    /**
     * {@InheritDoc}
     */
    @Override
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * {@InheritDoc}
     */
    @Override
    public int size() {
        return size;
    }
    /**
     * {@InheritDoc}
     */
    @Override
    public ReturnObject get(int index) {
        //determines whether requested position exists
        if(index < 0 || index >= size){
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else {
            return new ReturnObjectImpl(myArray[index]);
        }
    }

    /**
     * {@InheritDoc}
     */
    @Override
    public ReturnObject remove(int index){
        //use get method to supply the element to return (or return error for invalid index)
        ReturnObject removedObject = get(index);
        //object replaced and indices updated accordingly - if no error returned
        if(!removedObject.hasError()) {
            for (int i = index; i < size; i++) {
                myArray[i] = myArray[i + 1];
            }
            size--;
            return removedObject;
        } else {
            return removedObject;
        }
    }

    /**
     * {@InheritDoc}
     */
    @Override
    public ReturnObject add(int index, Object item){
        //no null objects allowed
        if(item == null){
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        //index error if negative or >= size of list
        } else if(index < 0 || index >= size) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else {
            //shift values up the array
            size++;
            for(int i = size - 1; i > index; i--) {
                myArray[i] = myArray[i - 1];
            }
            myArray[index] = item;
            //no error, null/empty returned
            return null;
        }
    }

    /**
     * {@InheritDoc}
     */
    @Override
    public ReturnObject add(Object item) {
        //no null objects allowed
        if(item == null) {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        } else {
            //increases size of array and adds item at end
            size++;
            myArray[size - 1] = item;
            //returns null/empty, successful addition of element
            return null;
        }
    }
}