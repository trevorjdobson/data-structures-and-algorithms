package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void testInsertShiftArray(){


        int testArray[] = new int[]{1,2,3,4};
        int resultArray[] = new int[]{1,2,5,3,4};

        assertArrayEquals(resultArray,ArrayShift.insertShiftArray(testArray,5));

    }

}