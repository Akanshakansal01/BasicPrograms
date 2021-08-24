/*
Write a Java program that takes a number as input and prints its multiplication table upto 10.
 */
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a no.:");
        int a = n.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(a+" * "+i+" = "+(i*a));
        }
    }
}
