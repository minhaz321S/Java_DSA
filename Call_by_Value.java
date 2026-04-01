
package function_method;
import java.util.Scanner;
public class Call_by_Value {
    public static void swap(int a,int b){
        System.out.println(a);
        System.out.println(b);
      a = 10;
      b = 5;
        System.out.println(a);
        System.out.println(b);
          
    }
    public static void main(String[] args) {
        int a,b,temp;
        Scanner input = new Scanner(System.in);
        System.out.print("a :");
        a = input.nextInt();
        System.out.print("b :");
        b = input.nextInt();
        swap(a,b);
        System.out.println("After swapping a :"+a); // Now This is called Call by value 
        System.out.println("After swapping b :"+b); // Here only transfer value not the actual variable.
        
    }
}
