
package Adv_Pattern;
import java.util.Scanner;
public class Floyds_Triangle {
    public static void floyd_triangle(int n){
        int a = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a++ +" ");
            } System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter row size :");
        int n = input.nextInt();
        floyd_triangle(n);
    }
}
