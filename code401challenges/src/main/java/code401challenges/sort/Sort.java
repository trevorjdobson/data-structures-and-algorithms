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

    public void mergeSort(int[] arr, int l, int r){
        if (l < r){
            int m = (l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr , m+1, r);
            merge(arr, l, m, r);
        }

    }
    public void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j=0; j<n2; ++j) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2){
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
