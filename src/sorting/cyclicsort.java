package sorting;

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[]arr={7,8,9,4,5,6,1,2,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
     int i=0;
     while(i<arr.length){
         int correct =arr[i]-1;
         if(arr[i]!=arr[correct]){
             swap(arr,i,correct);
         }else{
             i++;
         }
     }

    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    }

