
package Array;
import java.util.Scanner;
public class Array_in_out_upd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks[] = new int[100];
        marks[0] = input.nextInt();
        marks[1] = input.nextInt();
        marks[2] = input.nextInt();
        System.out.println("Phy :"+marks[0]);
        System.out.println("Chem :"+marks[1]);
        System.out.println("Math :"+marks[2]);
        marks[2] = marks[2] + 79;
        System.out.println("Math :"+marks[2]);
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage :"+percentage+"%");
        System.out.println("Length of Array :"+marks.length);
    }
}
