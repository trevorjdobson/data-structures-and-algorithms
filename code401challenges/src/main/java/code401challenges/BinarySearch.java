package code401challenges;

public class BinarySearch {

    public static int binarySearch(int[] sortedArr, int key){
        int midPoint = sortedArr.length / 2;

        while(midPoint>=0 && midPoint <= sortedArr.length-1){
            if(sortedArr[midPoint]==key){
                return midPoint;
            }else if(sortedArr[midPoint]<key){
                if(midPoint == sortedArr.length-1){
                    midPoint = -1;
                }else {
                    midPoint = midPoint + ((sortedArr.length - midPoint) / 2);
                }
            }else if(sortedArr[midPoint]>key){
                if(midPoint == 0){
                    midPoint = -1;
                }else{
                    midPoint = midPoint /2;

                }
            }
        }
        return -1;
    }
}

//  Different version of the code that also works
//        int x = (int)(Math.log(sortedArr.length)/Math.log(2) + 1e-10)+1;
//
//        for(int i=0; i<x;i++){
//            if(sortedArr[midPoint]==key){
//                return midPoint;
//            }else if (sortedArr[midPoint]<key){
//                midPoint = midPoint + ((sortedArr.length - midPoint) / 2);
//            }else if(sortedArr[midPoint]>key){
//                midPoint = midPoint /2;
//            }
//        }
