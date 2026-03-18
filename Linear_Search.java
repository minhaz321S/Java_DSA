
package Array;
import java.util.Scanner;
public class Linear_Search {
    public static int linear_search(int num[],int t){
       for(int i=0;i<num.length;i++){
           if(num[i] == t){
               return i;
           }
       }
       return -1;
    }
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number[] = {12,34,14,25,65,45,74,30};
        System.out.println("Enter the Target number :");
        int target = input.nextInt();
        int index = linear_search(number,target);
        if(index == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Target number found in index :"+index);
        }
        
        
        
    }
}
