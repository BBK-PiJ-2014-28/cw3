package Testing123;

/**
 * File to test SampleableListImpl.java
 * @author Annabel Jump
 * for PiJ Coursework 3
 */

import src.ArrayList;
import src.List;
import src.FunctionalArrayList;
import src.FunctionalList;
import src.SampleableList;
import src.SampleableListImpl;
import src.ReturnObject;
import src.ReturnObjectImpl;
import src.ErrorMessage;

import org.junit.*;
import org.junit.Assert.*;

public class SampleableListImplTest {

    public List testList;

    //initialise new SampleableList for test
    @Before
    public void starterForTen(){
        testList = new SampleableListImpl();
    }

    //reset list after test
    @After
    public void windingDown(){
        testList = null;
    }

    //test list methods
    @Test
    public void allInOne(){
        SampleableList testedSample = testList.sample();
        assertTrue(testedSample.isEmpty());
        testList.add("The");
        testList.add("Walkers");
        testList.add("Are");
        testList.add("Coming");
        testList.add("RUN!");
        SampleableList secondTestedSample = testList.sample();
        assertEquals("The", secondTestedSample.get(0).getReturnValue());
        assertEquals("Are", secondTestedSample.get(2).getReturnValue());
        assertEquals("RUN!", secondTestedSample.get(4).getReturnValue());
    }

}
