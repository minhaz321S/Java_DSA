
package Array;
import java.util.Scanner;
public class Array_as_Function_Arguement {
    public static void update(int marks[],int a){
        a = 36;
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
    }
 }       
    public static void main(String[] args) {
        int marks[] = {96,97,98};
        int a = 55;
        update(marks,a);
        //Print our marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println(a);
            
        
    }
}
