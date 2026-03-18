
package Array;

public class Total_SubArrays {
    public static void printSubarrays(int num[]){
        int total_subarray = 0;
        int sum = 0;
        for(int i=0;i<num.length;i++){
            int start = i;
            for(int j=i;j<num.length;j++){
               int end = j;
               sum = 0;
               for(int k=start;k<=end;k++){
                    System.out.print(num[k]+" "); 
                   sum = sum+num[k];
                    
            } System.out.println("Sum ="+sum);
               total_subarray++; 
            System.out.println();
        } System.out.println();
    }  System.out.println("Total Sub Array ="+total_subarray);
 }       
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14,16,18,20};
        printSubarrays(num);
    }
    
}
