package linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class arrays2d {
    public static void main(String[] args) {


        int[][] acr = {
                {6846, 45, 43, 31, 13},
                {68413, 46, 4651, 31, 4531, 15},
                {65, 64, 44, 5, 2, 14, 8, 3,}
        };
        Scanner in=new Scanner(System.in);
        int target=in.nextInt();
        int[] result =searcharray(target,acr);

        System.out.println(Arrays.toString(result));
    }
    static int[] searcharray(int target,int[][] acr){
        for (int i=0;i<acr.length;i++){
            for (int j=0; j< acr[i].length;j++){
                if (target==acr[i][j])
                    return new int[]{i,j};
            }
        }
    return new int[]{-1,-1};
    }
}
