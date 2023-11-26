package java_methods;

import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks for Java Programming: ");
        int javaMarks = input.nextInt();
        System.out.println("Enter marks for Networking: ");
        int networkingMarks = input.nextInt();
        System.out.println("Enter marks for Maths: ");
        int mathsMarks = input.nextInt();

        double average = (javaMarks + networkingMarks + mathsMarks) / 3.0;

        System.out.println("Marks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + average);
    }
}
