package code401challenges.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {
    Sort sort = new Sort();
    @Test
    public void insertSort() {
        int[] arr = {5,4,3,2,1};
        sort.insertSort(arr);
        String expected = "[1,2,3,4,5]";
        String actual = sort.toString(arr);
        assertEquals(expected,actual);
    }
    @Test
    public void insertSortEmpty() {
        int[] arr = {};
        sort.insertSort(arr);
        String expected = "[]";
        String actual = sort.toString(arr);
        assertEquals(expected,actual);
    }
    @Test
    public void insertSortOne() {
        int[] arr = {5};
        sort.insertSort(arr);
        String expected = "[5]";
        String actual = sort.toString(arr);
        assertEquals(expected,actual);
    }
    @Test
    public void insertSortNegative() {
        int[] arr = {5,4,-9,2};
        sort.insertSort(arr);
        String expected = "[-9,2,4,5]";
        String actual = sort.toString(arr);
        assertEquals(expected,actual);
    }
    @Test
    public void mergeSort() {
        int[] arr = {5,4,9,2,10};
        sort.mergeSort(arr,0,arr.length-1);
        String expected = "[2,4,5,9,10]";
        String actual = sort.toString(arr);
        assertEquals(expected,actual);
    }
    @Test
    public void mergeSortNegative() {
        int[] arr = {5,4,-9,2};
        sort.mergeSort(arr,0,arr.length-1);
        String expected = "[-9,2,4,5]";
        String actual = sort.toString(arr);
        assertEquals(expected,actual);
    }
}