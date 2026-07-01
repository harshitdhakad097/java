package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class selectionsort {
    public static void main(String[]args){
        int start=0;


        int[]arr ={511,5,51,51,51,51,4,746,2,4564,2,465,20,482031,4,8,23,5,4,6,2};
        int last;
        for (int i = 0; i <arr.length ; i++) {
            last=arr.length-1-i;
          int max=maxindex(arr,0,last);
            swap(arr, max, last);



        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr,int max,int last){
        int temp;
        temp=arr[last];
        arr[last]=arr[max];
        arr[max]=temp;
    }



    static int maxindex(int[]arr, int start, int last){
        int max=start;
        for (int i = start; i <=last ; i++) {

            if(arr[i]>arr[max]){
                max=i;
            }

        }
        return max;

    }
}
