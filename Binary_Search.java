
package Array;
import java.util.Scanner;
public class Binary_Search {
    public static int binarysearch(int number[],int key){
        int start = 0;
        int end = number.length - 1;
        while(start<=end){
            int mid = (start+end)/2;
            if(number[mid] == key){
                return mid;
              }
            if(number[mid] < key){
              start = start+1;
            }
            else{
              end = mid-1;
            }
            
    }
        return -1;
 }      
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter key value in even number(2 to 30) :");
        int key = input.nextInt();
        System.out.println("Index for key is :"+binarysearch(number,key));
        
    }
    
}
