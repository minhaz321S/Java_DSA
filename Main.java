
package function_method;

public class Main {
    int id;
    String name;
    
    public static void main(String[] args) {
        Main obj1 = new Main();
         Main obj2 = new Main();
        obj1.id  = 1;
       obj1.name  = "A";
        obj2.id  = 2;
       obj2.name  = "B";
       
        System.out.println(obj1.id);
        System.out.println(obj1.name);
//        System.out.println(obj1.Dept);
        System.out.println(obj2.id);
        System.out.println(obj2.name);
        
        
    }
}
