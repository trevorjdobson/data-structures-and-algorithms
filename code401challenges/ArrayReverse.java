import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args){
    int[] toBeReversed = new int[]{1,2,3,4,5,6};
    int[] toBeReversedAgain = new int[]{1,2,3,4,5};
    System.out.println(Arrays.toString(reversArray(toBeReversed)));
    System.out.println(Arrays.toString(reversArray(toBeReversedAgain)));
  }

  public static int[] reversArray(int[] arr){
    int midPoint =  (int)Math.floor(arr.length / 2);

    for(int i = 0; i <= midPoint; i++){
      int a = arr[i];
      int b = arr[arr.length -1 -i];
      arr[i] = b;
      arr[arr.length -1 -i] = a;
    }
    return arr;
  }
}