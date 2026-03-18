
package Adv_Pattern;
import java.util.Scanner;
public class Inverted_Half_Pyramid_by_Number {
    public static void Numberpyramid(int n){
        for(int i=0;i<n;i++){
            int a = 1; // a er man 2nd loop er baire na nile seta bar bar inialize hbe suru theke.
            for(int j=1;j<=n-i;j++){
                
                System.out.print(a++);  // Eta na kore chaile j kei print koraileo hoy
            } System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The rows size of inverted pyramid :");
        int n = input.nextInt();
        Numberpyramid(n);
        
    }
}
