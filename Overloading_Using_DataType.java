
package function_method;

public class Overloading_Using_DataType {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,3));
        System.out.println(sum(3.0f,5.0f));
        System.out.println(sum(3.01,5.0));
    }
}
