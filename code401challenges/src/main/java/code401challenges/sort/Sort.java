package code401challenges.sort;

public class Sort {
    public static int[] insertSort(int[] arr){
        for(int i = 1; i<=arr.length-1; i++){
            int j = i-1;
            int temp = arr[i];
            while((j>=0)&&(temp < arr[j])){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }

        return arr;
    }

    public String toString(int[]arr){
        if(arr.length==0){return "[]";}
        String str = "[";
        for(int i = 0; i<arr.length;i++){
            str += Integer.toString(arr[i]);
            str += ",";

        }
        str = str.substring(0, str.length() - 1);
        str +="]";
        return str;
    }
}
