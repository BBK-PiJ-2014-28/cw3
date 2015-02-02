package Testing123;

/**
 * File to test FunctionalLinkedList.java
 * @author Annabel Jump
 * for PiJ Coursework 3
 */

import src.LinkedList;
import src.List;
import src.FunctionalLinkedList;
import src.FunctionalList;
import src.ReturnObject;
import src.ReturnObjectImpl;
import src.ErrorMessage;

import org.junit.*;
import org.junit.Assert.*;

/**
 * Tests for this class are identical to FunctionalArrayListTest
 * as two classes are the same
 */


public class FunctionalLinkedListTest {

    public List testList;

    //initialise new FunctionalLinkedList for test
    @Before
    public void starterForTen(){
        testList = new FunctionalLinkedList();
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

    /**
     *now check correct return with rest()
     * by doing rest(), then check head is the original value
     * of variable at 1
     */
    @Test
    public void testRestContainsBrains() {
        testList.add("Zombie");
        testList.add("Wants");
        testList.add("Brains");
        FunctionalList mmTasty = testList.rest();
        ReturnObject notReally = mmTasty.head();
        assertEquals("Wants", notReally.getReturnValue());
    }
}