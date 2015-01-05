/**
 *  A class implementing ReturnObject interface.
 *  By Annabel Jump for Programming in Java Coursework 3
 */

public class ReturnObjectImpl implements ReturnObject {

    private ErrorMessage anErrorMessage; //initialise ENUM ErrorMessage
    private Object anObject;

    /**
     * need to insert constructors here
     */

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

    public ErrorMessage getError() {
        /**
         * Returns ErrorMessage value (or will, once constructors added)
         */
        return anErrorMessage;
    }

    public Object getReturnValue() {
        return anObject; //will return anObject as null or otherwise once constructors written
    }


}