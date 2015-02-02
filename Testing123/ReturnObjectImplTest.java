package Testing123;

/**
 * File to test ReturnObjectImpl.java
 * @author Annabel Jump
 * for PiJ Coursework 3
 */

import src.ReturnObject;
import src.ReturnObjectImpl;
import src.ErrorMessage;

import org.junit.*;
import org.junit.Assert.*;

public class ReturnObjectImplTest {

    public ReturnObject testReturnObject;

    //initialise new ReturnObject
    @Before
    public void starterForTen(){
        testReturnObject = new ReturnObjectImpl(ErrorMessage.NO_ERROR, "Mean");
    }

    //reset Object after test
    @After
    public void windingDown(){
        testReturnObject = null;
    }

    //test hasError()
    @Test
    public void testIfError(){
        assertFalse(testReturnObject.hasError());
        secondTestReturnObject = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        assertTrue(secondTestReturnObject.hasError());
        secondTestReturnObject = null;
    }

    //test getError() and getReturnValue()
    @Test
    public void testErrorFetch(){
        assertEquals(ErrorMessage.NO_ERROR, testReturnObject.getError());
        assertEquals("Mean", testReturnObject.getReturnValue());
    }

}