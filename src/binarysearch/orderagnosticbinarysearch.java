package binarysearch;

import java.util.Scanner;

public class orderagnosticbinarysearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 7, 8, 9, 11, 22, 33, 66, 555, 777, 8888, 6563541, 9876563};
        Scanner in = new Scanner(System.in);
        System.out.println("enter desired element");
        int target = in.nextInt();

        int ans= bseasrch(arr,target);
        System.out.println(ans);

    }

    static int bseasrch(int[] arr,int target){
        int start=0;
        int end = arr.length-1;
        int mid;
        boolean isasc = arr[start]<arr[end];
        while(start<=end){
             mid= start+(end-start)/2;
            if(isasc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            else{
                    if(target >arr[mid]){
                        end=mid-1;
                    } else if (target<arr[mid]) {
                        start=mid+1;
                    }else{
                        return mid;
                    }

            }
        }

return -1;

    }
}
