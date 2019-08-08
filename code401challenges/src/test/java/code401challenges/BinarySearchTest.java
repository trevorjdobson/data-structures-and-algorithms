package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void testBinarySearch_Even(){
        int[] sortedArray = {4,8,15,16,23,42};
        assertTrue(BinarySearch.binarySearch(sortedArray,8)==1);

    }
    @Test
    public void testBinarySearch_Odd(){
        int[] sortedArray = {4,8,15,16,23,42,60};
        assertTrue(BinarySearch.binarySearch(sortedArray,8)==1);

    }
    @Test
    public void testBinarySearch_LargeArray(){
        int[] sortedArray = {4,8,15,16,23,42,60,65,70,75,80,85,95,100,105,110};
        assertTrue(BinarySearch.binarySearch(sortedArray,110)==15);

    }
    @Test
    public void testBinarySearch_Last(){
        int[] sortedArray = {4,8,15,16,23,42};
        assertTrue(BinarySearch.binarySearch(sortedArray,42)==5);

    }
    @Test
    public void testBinarySearch_First(){
        int[] sortedArray = {4,8,15,16,23,42};
        assertTrue(BinarySearch.binarySearch(sortedArray,4)==0);

    }
    @Test
    public void testBinarySearch_TooBig(){
        int[] sortedArray = {4,8,15,16,23,42};
        assertTrue(BinarySearch.binarySearch(sortedArray,60)==-1);

    }
    @Test
    public void testBinarySearch_TooSmall(){
        int[] sortedArray = {4,8,15,16,23,42};
        assertTrue(BinarySearch.binarySearch(sortedArray,2)==-1);

    }

}