/*
Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
 */
import java.util.*;
public class Product {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Input first number:");
        int a=n.nextInt();
        System.out.println("Input first number:");
        int b=n.nextInt();
        System.out.println(a*b);
    }

}
