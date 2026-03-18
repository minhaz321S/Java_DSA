
package Array;
import java.util.*;

public class Largest_Smallest_in_Array {
    public static int get_Large_Small(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
           if(num[i]>largest){
               largest = num[i];
        }
     } 
        for(int i=0;i<num.length;i++){
           if(num[i]<smallest){
               smallest = num[i];
        }
     } System.out.println("Smallest value = "+smallest);
        return largest;
        
   }      
    
   public static void main(String[] args) {
        int num[] = {12,12,144,67,4454,34,566,44,87,555,45};
        System.out.println("Largest value = "+get_Large_Small(num));
        
    }
}
