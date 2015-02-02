package Testing123;

/**
 * File to test FunctionalArrayList.java
 * @author Annabel Jump
 * for PiJ Coursework 3
 */

import src.ArrayList;
import src.List;
import src.FunctionalArrayList;
import src.FunctionalList;
import src.ReturnObject;
import src.ReturnObjectImpl;
import src.ErrorMessage;

import org.junit.*;
import org.junit.Assert.*;

public class FunctionalArrayListTest {

    public List testList;

    //initialise new FunctionalArrayList for test
    @Before
    public void starterForTen(){
        testList = new FunctionalArrayList();
    }

    //reset list after test
    @After
    public void windingDown(){
        testList = null;
    }

    //head should initially be empty
    @Test
    public void testIfHeadIsEmpty(){
        ReturnObject helloNothing = testList.head();
        assertTrue(helloNothing.hasError());
        testList.add("Brains");
        ReturnObject helloSomething = testList.head();
        assertFalse(helloSomething.hasError());
    }

    //check correct return with head()
    @Test
    public void testHeadContainsBrains() {
        testList.add("Zombie");
        testList.add("Wants");
        testList.add("Brains");
        ReturnObject nowNow = testList.head();
        assertEquals("Zombie", nowNow.getReturnValue());
    }

}