package sorting;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {511, 5, 51, 51, 51, 51, 4, 746, 2, 4564, 2, 465, 20, 482031, 4, 8, 23, 5, 4, 6, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr,j);
                } else {
                    break;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }


    static void swap(int[] arr, int j) {
        int temp;
        temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
    }
}