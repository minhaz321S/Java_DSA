
package function_method;
class Student{
    int id;
    String name;
    void Displayinfo(){
        System.out.println("Id :"+id);
        System.out.println("Name :"+name);
    }
}
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.id = 1136;
        s1.name = "Sazzad";
        s2.id = 1156;
        s2.name = "Raihana";
        s1.Displayinfo();
        s2.Displayinfo();
    }
}
