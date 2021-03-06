package Testing123;

/**
 * File to test ArrayList.java
 * @author Annabel Jump
 * for PiJ Coursework 3
 */

import src.ArrayList;
import src.List;
import src.ReturnObject;
import src.ReturnObjectImpl;
import src.ErrorMessage;

import org.junit.*;
import org.junit.Assert.*;

public class ArrayListTest {

    public List testList;

    //initialise new ArrayList for test
    @Before
    public void starterForTen(){
        testList = new ArrayList();
    }

    //reset list after test
    @After
    public void windingDown(){
        testList = null;
    }

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

    /**
     * As both add() methods already tested in the tests above, no further testing here
     */

}