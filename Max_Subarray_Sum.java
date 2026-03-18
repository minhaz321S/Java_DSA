
package Array;

public class Max_Subarray_Sum {
    public static void maxSubarraySum(int num[]){
        int sum = 0;
        int Max_sum = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
           int start = i;
            for(int j=i;j<num.length;j++){
             int end = j;
              sum = 0;
               for(int k=start;k<=end;k++){
                 sum = sum+num[k];
               } System.out.println("Sum ="+sum);
                if(sum>Max_sum){
                    Max_sum = sum;
                }
            }
        } System.out.println("Max Sum of the Sub Array ="+Max_sum);
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14,16,18,20};
        maxSubarraySum(num);
       
      }
}