
package function_method;
import java.util.Scanner;
public class Sum_of_digit {
    public static int sumdigit(int n){
        int sum = 0;
        while(n>0){
           int ld = n % 10;
            sum = sum + ld;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = input.nextInt();
        System.out.println("Sum of the digit = "+sumdigit(n));
        
    }
}
