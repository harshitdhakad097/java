package linearsearch;


import java.util.Scanner;

public class searchinstring {
   public static void main(String[] args) {
String name ="there are many words in this string";
       Scanner in = new Scanner(System.in);
//char target =in.next();
      char target ='y';
       System.out.println(search(name,target));
    }
 static int search(String str,char target){
       if (str.length()==0){
           return -1;
       }
       for(int i=0; i<str.length();i++){
         if (target==str.charAt(i)){
             return i;
         }
     }
       return -1;
 }
}
