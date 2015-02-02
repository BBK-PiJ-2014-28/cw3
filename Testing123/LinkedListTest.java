package Testing123;

/**
 * File to test LinkedList.java
 * @author Annabel Jump
 * for PiJ Coursework 3
 */

import src.LinkedList;
import src.List;
import src.ReturnObject;
import src.ReturnObjectImpl;
import src.ErrorMessage;

import org.junit.*;
import org.junit.Assert.*;

public class LinkedListTest {

    public List testList;

    //initialise new LinkedList for test
    @Before
    public void starterForTen(){
        testList = new LinkedList();
    }

    //reset list after test
    @After
    public void windingDown(){
        testList = null;
    }

    /**
     * LinkedList has identical functions to ArrayList
     * All tests are the same, save for added null tests
     */

    //list should initially be empty
    @Test
    public void testIfListIsEmpty(){
        assertTrue(testList.isEmpty());
        testList.add("Hi");
        assertFalse(testList.isEmpty());
    }

    //list should have initial size of 0
    @Test
    public void testSizeOfList() {
        assertEquals(0, testList.size());
        testList.add("Hi");
        testList.add("My");
        testList.add("Name");
        testList.add("Is");
        testList.add("WHAT");
        testList.add("My");
        testList.add("Name");
        testList.add("Is");
        assertEquals(8, testList.size());
    }

    //test return from get() method (incidentally, also testing both add() methods)
    @Test
    public void testFetch(){
        testList.add("Slim");
        testList.add("Shady");
        assertEquals("Shady", testList.get(1).getReturnValue());
        testList.add(1, "Fetch");
        testList.add(2, "Happens");
        assertEquals("Shady", testList.get(3).getReturnValue());
        assertEquals(ErrorMessage.INDEX_OUT_OF_BOUNDS, testList.get(4).getError());
    }

    //test remove() method
    @Test
    public void testFetchAndCarry() {
        testList.add("Stop");
        testList.add("Trying");
        testList.add("To");
        testList.add("Make");
        testList.add("Fetch");
        testList.add("Happen");
        assertEquals("Fetch", testList.remove(4).getReturnValue());
        //now "Happen" should be at position 4
        assertEquals("Happen", testList.get(4).getReturnValue());
    }

    //test add() null to end list
    @Test
    public void testNull(){
        ReturnObject helloNothing = testList.add(null);
        assertEquals(ErrorMessage.INVALID_ARGUMENT, helloNothing.getError());
    }

    //test add() null to middle list
    @Test
    public void testMiddleNull(){
        testList.add("Stop");
        testList.add("Trying");
        testList.add("To");
        testList.add("Make");
        testList.add("Fetch");
        testList.add("Happen");
        ReturnObject helloNothing = testList.add(3, null);
        assertEquals(ErrorMessage.INVALID_ARGUMENT, helloNothing.getError());
    }

}