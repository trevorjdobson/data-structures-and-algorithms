# Reverse an Array
First code challange working with arrays.

## Challenge
Write a function that takes in an array of integeres and reverses the array.

## Approach & Efficiency
I decided to use a for loop to swap the elements of the array in place.  I used the halfway point of the array as my stopping point for the for loop.

## Solution
![whiteboard](20190806_095408.jpg)

# Insert in Array
Second code challenge working with arrays

## Challenge
Write a function that takes in an array of integers and an interger and inserts that integer in the middle of the array.

## Approach & Efficiency
I first made a new array with the length being 1 more than the input array.  I then found the midpoint of that array.  I then looped through the new array inserting elements in their proper locations.

## Solution
![whiteboard](arrayShift.jpg)

# Binary Search
Third Code Challenge with arrays.
## Challenge
Write a function that takes in a 1D array and a key that returns the index of the element that matches the key.  If the element does not exist return -1.  Do not use any built in methods.

## Approach & Efficiency
My first approach to this problem was to find the midpoint of the array. Then check if that element is bigger or smaller than the key.  Then find the midpoint of the remaining portion of the array based off of it being bigger or smaller and repeating that process until the key is found or there are no more to check.

## Solution
![whiteboard](binarySearch.jpg)