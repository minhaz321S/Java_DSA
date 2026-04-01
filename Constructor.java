
package OOP;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        Students s2 = new Students();
        s2.name  = "Minhaz";
        System.out.println(s2.name);
    }
}

 class Student{
    String name;
    int age;
    Student(){
        System.out.println("Constructor is called....");

    }
}
