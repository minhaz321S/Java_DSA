
package function_method;
import java.util.Scanner;
public class Factorial {
    public static int fact(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for Factorial :");
        int n = input.nextInt();
        System.out.println("Factorial of n = "+fact(n));
    }
}
