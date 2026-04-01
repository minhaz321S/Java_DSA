
package function_method;
import java.util.Scanner;
public class DecimaltoBinary {
    public static void DectoBin(int n){
        int pow = 0;
        int bin = 0;
        while(n>0){
            int rem = n % 2;
             n = n / 2;
            
            bin = bin + (rem*Math.powExact(10, pow));
            pow++;
            
        }
        System.out.println("The binary number :"+bin);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number :");
        int n = input.nextInt();
        DectoBin(n);
    }
 
}
