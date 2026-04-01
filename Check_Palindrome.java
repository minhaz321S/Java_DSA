
package function_method;
import java.util.Scanner;
public class Check_Palindrome {
    public static void palindrome(int n,int r){
        if(n == r){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = input.nextInt();
        int original = number;
        int rev = 0;
        while(number>0){
           int ld = number % 10;
            rev = rev*10 + ld;
            number = number / 10;
            
            
        }
        System.out.println("Rverse number is =" +rev);
        System.out.println("Original number :"+original);
        palindrome(original,rev);
        
        
    }
}
