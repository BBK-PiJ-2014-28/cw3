/**
 *  A class implementing SampleableList interface
 *  By Annabel Jump for Programming in Java Coursework 3
 *  @author Annabel Jump
 */

public class SampleableListImpl extends ArrayList implements SampleableList{
    /**
     * Returns a list containing the first, third, fifth...
     * items of this list, or an empty list if the list is empty.
     *
     * @return a list containing the first, third, fifth... items of this list
     */
    public SampleableList sample(){
        SampleableList requestedSample = new SampleableListImpl();
        if(isEmpty()){
            return requestedSample;
        } else {
            /**
             * For loop to copy across the 1st (0), 3rd (2), 5th (4) variables
             * similar to rest() in FunctionalArrayList, but only
             * requested variables copied
             */
            for(int i = 0; i < size(); i += 2){
                Object listObject = get(i).getReturnValue();
                requestedList.add(listObject);
            }
            return requestedList;
        }

    }


}