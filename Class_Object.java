
package OOP;

public class Class_Object {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Sakib";
        s1.age = 52;
        s1.sec = "2C2";
        s1.studentsinfo();
        Pen p1 = new Pen();
        p1.setcolor("Black");
        p1.settip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}

class Pen{
    String color;
    int tip;
    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
}
class Students{
    String name;
    int age;
    String sec;
    void studentsinfo(){
        System.out.println(name);
        System.out.println(sec);
        System.out.println(age);
    }
}
