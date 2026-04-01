
package function_method;
import java.util.Scanner;
public class Binomial_Cofficient {
    public static int fact(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public static int bincoff(int n,int r){
        
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);
        int bc = fact_n / (fact_r*fact_nmr);
        return bc;
    }
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Enter Value of n :");
        int n = input.nextInt();
        System.out.print("Enter Value of r :");
        int r = input.nextInt();
        System.out.println("Binomial Cofficient = "+bincoff(n,r));
    }
}
