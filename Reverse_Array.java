
package Array;

public class Reverse_Array {
    public static void reverse_array(int number[]){
        int start = 0;
        int end = number.length - 1;
        while(start < end){
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp;
            start++;
            end--;
        } 
    }
    public static void main(String[] args) {
        int number[] = {2,33,21,56,67,74,89,56};
        reverse_array(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
    } System.out.println();
    
  }
}
