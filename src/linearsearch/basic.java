package linearsearch;

import java.util.Scanner;

public class basic {
   public static void main(String[] args) {
        int num[]= {10,202,25,55,84,6,94,5,684,2,66,84,6,6,5};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int z=linearsearch(num,target);
       System.out.println(z);

    }
    static int linearsearch(int[] num,int target) {
        if (num.length == 0) {
            return -1;
        }
//
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] == target) {
//                return i;
//            }
//        }
        for (int element :num){
            if (element==target){
                return element;
            }
        }
        return -1;
    }
}
