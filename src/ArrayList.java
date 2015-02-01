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
     * Returns the elements at the given position.
     * Determines if requested position does not exist
     * @param index the position in the list of the item to be retrieved
     * @return the element or an appropriate error message,
     *         encapsulated in a ReturnObject
     */
    @Override
    public ReturnObject get(int index) {
        if(index < 0 || index >= size){
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else {
            return new ReturnObjectImpl(myArray[index]);
        }
    }
}