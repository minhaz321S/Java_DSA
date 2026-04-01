
package function_method;
class Box{
    double width;
    double height;
    double depth;
}
public class Box_Demo {
    public static void main(String[] args) {
        Box v1 = new Box();
        v1.depth = 10;
        v1.height = 20;
        v1.width = 30;
        System.out.println("Volume = "+(v1.depth*v1.width*v1.height));
    }
}
