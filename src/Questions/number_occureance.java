package Questions;

import java.util.Scanner;

public class number_occureance {
   public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        int number = in.nextInt();
        int numberoccurence = in.nextInt();
         int count =0;
         int  remainder;
         while (number>0) {
             remainder = number % 10;
             if (remainder == numberoccurence) {
                 count++;
             }
             number = number / 10;
         }
             System.out.println(count);

    }
}
