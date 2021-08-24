/* Write a Java program to print the sum of two numbers.
Test Data:
Enter two numbers:
74
36
Expected Output :
 Sum of 74 and 36 is 110
 */

import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
      Scanner n1=new Scanner(System.in);
      System.out.println("Enter two numbers:");
      int a=n1.nextInt();
      int b=n1.nextInt();
      int s=a+b;
      System.out.println("Sum of "+a+" and "+b+" is "+s);
    }
}
