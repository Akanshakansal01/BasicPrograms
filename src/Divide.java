/*
Write a Java program to divide two numbers and print on the screen.
Test Data :
50/3
Expected Output :
16
 */
import java.util.*;
public class Divide {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner n1=new Scanner(System.in);
        int a=n1.nextInt();
        int b=n1.nextInt();

        System.out.println(a/b);
    }
}
