
package function_method;
import java.util.Scanner;
public class Check_Prime {
    public static boolean prime(int n){
        if(n == 2){
            return true;
        }
//        boolean isprime = true;
        for(int i=2;i<=Math.sqrt(n);i++){   //This is more optimised. 
// for(int i=2;i<=n-1;i++)
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for checking prime :");
        int n = input.nextInt();
        System.out.println(n+" is a prime:"+prime(n));
    }
}
