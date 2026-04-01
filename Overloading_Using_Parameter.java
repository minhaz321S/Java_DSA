
package function_method;

public class Overloading_Using_Parameter {
    public static int sum(int a,int b){
        return a + b;
    }
    public static int sum(int a,int b,int c,int d){
        return a + b + c + d;
        
    }
    public static void main(String[] args) {
        System.out.println(sum(2,4));
        System.out.println(sum(3,4,6,1));
    }
}
