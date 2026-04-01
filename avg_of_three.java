
package function_method;
import java.util.Scanner;
public class avg_of_three {
    public static void calculateavg(double a,double b,double c){
        double avg = (a + b + c)/3;
        System.out.printf("Average of three number is = %.3f ",avg);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value 1 :");
        double a = input.nextDouble();
        System.out.println("Enter value 2 :");
        double b = input.nextDouble();
        System.out.println("Enter value 3 :");
        double c = input.nextDouble();
        calculateavg(a,b,c);
    }
}
