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
     *  @return true if the list is empty, false otherwise.
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
     * @return the number of items currently in the list
     */
    @Override
    public int size() {
        return size;
    }
    /**
     * Returns the elements at the given position
     * @param index the position in the list of the item to be retrieved
     * @return the element or an appropriate error message,
     *         encapsulated in a ReturnObject
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
     * Returns the elements at the given position and removes it
     * from the list. The indeces of elements after the removed
     * element must be updated accordignly.
     *
     * @param index the position in the list of the item to be retrieved
     * @return the element or an appropriate error message,
     *         encapsulated in a ReturnObject
     */
    @Override
    public ReturnObject remove(int index){
        //use get method to supply the element to return (or return error for invalid index)
        ReturnObject removedObject = get(index);
        //object replaced and indices updated accordingly - if no error returned
        if(!removedObject.hasError()) {
            for (i = index; i < size; i++) {
                myArray[i] = myArray[i + 1];
            }
            size--;
            return removedObject;
        } else {
            return removedObject;
        }
    }
}