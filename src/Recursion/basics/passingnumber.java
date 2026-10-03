package Recursion.basics;

public class passingnumber {
     public static void main(String[] args) {
int ans = totaldigits(7760);
         System.out.println(ans);
    }
    static int totaldigits(int n){
         if(n==0){
             return 0;
         }
         return n%10 +totaldigits(n/10);
    }
}
