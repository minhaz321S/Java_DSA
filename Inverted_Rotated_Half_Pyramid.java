
package Adv_Pattern;
import java.util.Scanner;
public class Inverted_Rotated_Half_Pyramid {
    public static void pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            } System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row size :");
        int n = input.nextInt();
        pyramid(n);
        
    }
}
