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
    @Test
    public void testInsertBefore(){
        LinkedList<Integer> newList = new LinkedList();
        newList.insert(9);
        newList.insert(2);
        newList.insert(7);
        newList.insert(12);
        newList.insertBefore(15,2);
        String expected = "12,7,15,2,9";

        assertTrue(expected.equals(newList.toString()));
    }
    @Test
    public void testInsertBefore_FirstNode(){
        LinkedList<Integer> newList = new LinkedList();
        newList.insert(9);
        newList.insert(2);
        newList.insert(7);
        newList.insert(12);
        newList.insertBefore(15,12);
        String expected = "15,12,7,2,9";

        assertTrue(expected.equals(newList.toString()));
    }
    @Test
    public void testInsertAfter(){
        LinkedList<Integer> newList = new LinkedList();
        newList.insert(9);
        newList.insert(2);
        newList.insert(7);
        newList.insert(12);
        newList.insertAfter(15,2);
        String expected = "12,7,2,15,9";

        assertTrue(expected.equals(newList.toString()));
    }
    @Test
    public void testInsertAfter_LastItem(){
        LinkedList<Integer> newList = new LinkedList();
        newList.insert(9);
        newList.insert(2);
        newList.insert(7);
        newList.insert(12);
        newList.insertAfter(15,9);
        String expected = "12,7,2,9,15";

        assertTrue(expected.equals(newList.toString()));
    }
    @Test
    public void testAppend(){
        LinkedList<Integer> newList = new LinkedList();
        newList.insert(9);
        newList.insert(2);
        newList.insert(7);
        newList.insert(12);
        newList.append(15);
        String expected = "12,7,2,9,15";

        assertTrue(expected.equals(newList.toString()));
    }

    @Test
    public void testAppend_Multiple(){
        LinkedList<Integer> newList = new LinkedList();
        newList.insert(9);
        newList.insert(2);
        newList.insert(7);
        newList.insert(12);
        newList.append(15);
        newList.append(16);
        newList.append(17);
        String expected = "12,7,2,9,15,16,17";

        assertTrue(expected.equals(newList.toString()));
    }
    @Test
    public void testKFromEnd_LastItem() throws Exception {
        LinkedList<Integer> newList = new LinkedList();
        newList.insert(9);
        newList.insert(2);
        newList.insert(7);
        newList.insert(12);

        int expected = 9;
        int actual = newList.kFromEnd(0);

        assertTrue(expected == actual);
    }
    @Test
    public void testKFromEnd_MiddleItem() throws Exception {
        LinkedList<Integer> newList = new LinkedList();
        newList.insert(9);
        newList.insert(2);
        newList.insert(7);
        newList.insert(12);

        int expected = 7;
        int actual = newList.kFromEnd(2);

        assertTrue(expected == actual);
    }
    @Test (expected = Exception.class)
    public void testKFromEnd_KGreater() throws Exception {
        LinkedList<Integer> newList = new LinkedList();
        newList.insert(9);
        newList.insert(2);
        newList.insert(7);
        newList.insert(12);


        newList.kFromEnd(10);

    }
    @Test (expected = Exception.class)
    public void testKFromEnd_KIsSameLength() throws Exception {
        LinkedList<Integer> newList = new LinkedList();
        newList.insert(9);
        newList.insert(2);
        newList.insert(7);
        newList.insert(12);


        newList.kFromEnd(4);

    }
    @Test (expected = Exception.class)
    public void testKFromEnd_KIsNegative() throws Exception {
        LinkedList<Integer> newList = new LinkedList();
        newList.insert(9);
        newList.insert(2);
        newList.insert(7);
        newList.insert(12);


        newList.kFromEnd(-1);

    }
    @Test
    public void testKFromEnd_KIsSizeOne() throws Exception {
        LinkedList<Integer> newList = new LinkedList();
        newList.insert(9);

        int expected = 9;
        int actual = newList.kFromEnd(-0);
        assertTrue(expected == actual);
    }
    @Test
    public void testMerge_SecondLonger(){
        LinkedList<Integer> testListOne = new LinkedList();
        testListOne.insert(3);
        testListOne.insert(1);

        LinkedList<Integer> testListTwo = new LinkedList();
        testListTwo.insert(6);
        testListTwo.insert(5);
        testListTwo.insert(4);
        testListTwo.insert(2);
        LinkedList test = LinkedList.mergeLinkedLists(testListOne,testListTwo);
        String expected = "6,5,4,3,2,1";
        assertTrue(expected.equals(test.toString()));
    }
    @Test
    public void testMerge_FirstLonger(){
        LinkedList<Integer> testListOne = new LinkedList();
        testListOne.insert(6);
        testListOne.insert(5);
        testListOne.insert(3);
        testListOne.insert(1);

        LinkedList<Integer> testListTwo = new LinkedList();
        testListTwo.insert(4);
        testListTwo.insert(2);
        LinkedList test = LinkedList.mergeLinkedLists(testListOne,testListTwo);
        String expected = "6,5,4,3,2,1";
        assertTrue(expected.equals(test.toString()));
    }
    @Test
    public void testMerge_SameLength(){
        LinkedList<Integer> testListOne = new LinkedList();
        testListOne.insert(3);
        testListOne.insert(1);

        LinkedList<Integer> testListTwo = new LinkedList();
        testListTwo.insert(4);
        testListTwo.insert(2);
        LinkedList test = LinkedList.mergeLinkedLists(testListOne,testListTwo);
        String expected = "4,3,2,1";
        assertTrue(expected.equals(test.toString()));
    }
    @Test
    public void testMerge_OneEmpty(){
        LinkedList<Integer> testListOne = new LinkedList();
        testListOne.insert(3);
        testListOne.insert(1);

        LinkedList<Integer> testListTwo = new LinkedList();

        LinkedList test = LinkedList.mergeLinkedLists(testListOne,testListTwo);
        String expected = "3,1";
        assertTrue(expected.equals(test.toString()));
    }

}
