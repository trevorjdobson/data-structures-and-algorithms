# QUICK SORT
QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways. \-GeeksForGeeks

## Learning Objectives
* Undertand The Algorithm
* Pros
* Cons

## Informative Flow
* PROS
    * Efficient
    * Can be two or three times faster than merge sort
    * Can be done in place
* CONS
    * Not Stable

## Algorithm
*  Quicksort is a divide and conquer algorithm. Quicksort first divides a large array into two smaller sub-arrays: the low elements and the high elements. Quicksort can then recursively sort the sub-arrays. The steps are:
  * Pick an element, called a pivot, from the array.
  * Partitioning: reorder the array so that all elements with values less than the pivot come before the pivot, while all elements with values greater than the pivot come after it (equal values can go either way). After this partitioning, the pivot is in its final position. This is called the partition operation.
  * Recursively apply the above steps to the sub-array of elements with smaller values and separately to the sub-array of elements with greater values.
  * -Wikipedia QuickSort
  
![Visual](quicksort.gif)

## Readings and References

[Wikipedia](https://en.wikipedia.org/wiki/Quicksort)

[GeeksForGeeks](https://www.geeksforgeeks.org/quick-sort/)