
package function_method;
import java.util.Scanner;
public class BinarytoDecimal {
    public static void BintoDec(int n){
         int dec = 0;
        for(int pow=0;n>0;pow++){
//            int pow = 0;
            int ld = n % 10;
            n = n/10;
            dec = dec + (ld * Math.powExact(2, pow));
          
        }
        System.out.print("The Decimal number :"+dec);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number :");
        int n = input.nextInt();
        BintoDec(n);
       
    }
   
}
