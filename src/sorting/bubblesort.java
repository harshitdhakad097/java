package sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {

int[]arr ={7,8,64,4784,669,8,784,2,6,69,9,87,472,32,63,69,9,87,522,6,9,845,4,58,};
bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
  int temp;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1;  j < arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                 temp=   arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

            }

        }
    }
}
