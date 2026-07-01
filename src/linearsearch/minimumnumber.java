package linearsearch;

public class minimumnumber {
   public static void main(String[] args) {
        int[] arr = {54,544,45,646,46,4,561,1654,-1,112,54,7,1,4};

        System.out.println(minimun(arr));


    }
    static int minimun(int[] arr){
int ans= arr[0];
for (int i=1; i< arr.length; i++){
    if (arr[i] <ans){
        ans=arr[i];
    }
}
return ans;
    }
}
