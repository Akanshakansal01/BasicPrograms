/*
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 */
import java.util.*;
public class ArthimeticOpeartion {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Input first number:");
        int a=n.nextInt();
        System.out.println("Input first number:");
        int b=n.nextInt();
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
