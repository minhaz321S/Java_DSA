
package function_method;
import java.util.Scanner;
public class Syntax_with_Parameter {
    public static int printsum(int num1,int num2){ //Parameter or Formal Parameter
       
        int sum = num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a :");
        int a = input.nextInt();
        System.out.print("b :");
        int b = input.nextInt();
        int sum = printsum(a,b); // Arguement or Actual Parameter
        System.out.println("sum :"+sum);
    }
}
