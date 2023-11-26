import java.util.Scanner;

public class Triangle {
    private double base;
    private double height;

    public Triangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        this.base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        this.height = scanner.nextDouble();
        scanner.close();
    }

    public double calculateArea() {
        return 0.5 * this.base * this.height;
    }

    public void displayArea() {
        double area = calculateArea();
        System.out.println("The area of the triangle is " + area + ".");
    }
}
