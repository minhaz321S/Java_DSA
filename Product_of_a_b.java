
package function_method;
import java.util.Scanner;
public class Product_of_a_b {
    public static int multiply(int a,int b){
        int multiply = a*b;
        return multiply;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();
        
        System.out.println("a*b = "+multiply(a,b));
        
    }
}
