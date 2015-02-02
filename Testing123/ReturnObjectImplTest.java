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
        testReturnObject = new ReturnObjectImpl();
    }

    //reset Object after test
    @After
    public void windingDown(){
        testReturnObject = null;
    }

    
}