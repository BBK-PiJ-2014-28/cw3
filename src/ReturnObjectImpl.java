/**
 *  A class implementing ReturnObject interface.
 *  By Annabel Jump for Programming in Java Coursework 3
 *  @author Annabel Jump
 */

public class ReturnObjectImpl implements ReturnObject {

    private ErrorMessage anErrorMessage; //initialise ENUM ErrorMessage
    private Object anObject;

    /**
     * constructors added for incomplete data and complete data
     */
    ReturnObjectImpl (Object thisObject) {
        anObject = thisObject;
        anErrorMessage = null;
    }

    ReturnObjectImpl (ErrorMessage thisErrorMessage) {
        anObject = null;
        anErrorMessage = thisErrorMessage;
    }

    ReturnObjectImpl (Object newObject, ErrorMessage newErrorMessage) {
        anObject = newObject;
        anErrorMessage = newErrorMessage;
    }

    @Override
    public boolean hasError() {
        /**
         * Returns whether or not an error has occurred
         */
        if (anErrorMessage == ErrorMessage.NO_ERROR {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public ErrorMessage getError() {
        /**
         * Returns ErrorMessage value (or will, once constructors added)
         */
        return anErrorMessage;
    }

    @Override
    public Object getReturnValue() {
        return anObject; //will return anObject as null or otherwise
    }


}