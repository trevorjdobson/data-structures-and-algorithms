package code401challenges.LinkedLists;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void testCreateList(){
        LinkedList<Integer> newList = new LinkedList();
        assertEquals(newList.head,null);
    }

    @Test
    public void testInsert() {
        LinkedList<Integer> newList = new LinkedList();
        newList.insert(9);
        int expected = newList.head.value;

        assertEquals(9, expected);
    }

    @Test
    public void testIncludes() {
        LinkedList<Integer> newList = new LinkedList();
        newList.insert(9);
        newList.insert(2);
        newList.insert(7);
        newList.insert(12);

        assertTrue(newList.includes(7));
    }
    @Test
    public void testIncludes_False() {
        LinkedList<Integer> newList = new LinkedList();
        newList.insert(9);
        newList.insert(2);
        newList.insert(7);
        newList.insert(12);

        assertFalse(newList.includes(8));
    }
    @Test
    public void tesToString() {
        LinkedList<Integer> newList = new LinkedList();
        newList.insert(9);
        newList.insert(2);
        newList.insert(7);
        newList.insert(12);

        String expected = "12,7,2,9";

        assertTrue(expected.equals(newList.toString()));
    }


}
