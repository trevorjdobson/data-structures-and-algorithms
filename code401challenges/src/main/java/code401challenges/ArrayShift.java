package code401challenges;

public class ArrayShift {

    public static int[] insertShiftArray(int[] arr, int num){
        int length = arr.length + 1;
        int[] newArr = new int[length];
        int midPoint = length/2;

        for(int i = 0; i < length; i++){
            if(i<midPoint){
                newArr[i] = arr[i];
            }else if(i == midPoint){
                newArr[i] = num;
            }else if(i > midPoint){
                newArr[i] = arr[i-1];
            }
        }
        return newArr;
    };
}
