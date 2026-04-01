
package function_method;
class Boxes{
   
    void Volume(double width,double height,double depth){
        double volume = width*height*depth;
        System.out.println("Volume :"+volume);
    }
}
public class BoxDemo {
    public static void main(String[] args) {
        Boxes v1 = new Boxes();
        Boxes v2 = new Boxes();
        
        
        v1.Volume(5,11,5);
        v2.Volume(6,12,7);
    }
}