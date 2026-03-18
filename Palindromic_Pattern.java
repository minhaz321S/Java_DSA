
package Adv_Pattern;
import java.util.Scanner;
public class Palindromic_Pattern {
    public static void palindromic_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            int a = 2;
            for(int j=2;j<=i;j++){
                System.out.print(a++);
            } System.out.println();
    }
 }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter pattern size :");
        int n = input.nextInt();
        palindromic_pattern(n);
        
    }
}
