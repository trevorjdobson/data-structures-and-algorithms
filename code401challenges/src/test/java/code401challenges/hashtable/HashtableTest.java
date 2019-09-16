package code401challenges.hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    Hashtable testHashTable;

    @Before
    public void setUp(){
        testHashTable = new Hashtable(1024);
        testHashTable.add("lab-1","this is lab 1");
        testHashTable.add("lab-2","this is lab 2");
        testHashTable.add("lab-3","this is lab 3");
    }
    @Test
    public void add() {
        testHashTable.add("lab-4","this is testing the add method");
        assertEquals("this is testing the add method",testHashTable.get("lab-4"));
    }

    @Test
    public void get() {
        assertEquals("this is lab 2",testHashTable.get("lab-2"));
    }

    @Test
    public void contains() {
        assertTrue(testHashTable.contains("lab-1"));
        assertFalse(testHashTable.contains("lab-8"));
    }
}