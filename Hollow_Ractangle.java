
package Adv_Pattern;
import java.util.Scanner;
public class Hollow_Ractangle {
    public static void hollow(int totrows,int totcols){
        // Outer loops
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=totcols;j++){
                if(i == 1 || i == totrows || j == 1 || j == totcols ){
                    System.out.print("*");
            }
                else{
                    System.out.print(" ");
                }
        }  System.out.println();
    } 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total rows :");
        int totrows = input.nextInt();
        System.out.println("Enter total Columns :");
        int totcols = input.nextInt();
        hollow(totrows,totcols);
        
    }
}
