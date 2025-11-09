import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = scanner.nextInt();
        System.out.print("Enter the length of each side: ");
        double s = scanner.nextDouble();

        double area = (n * s * s) / (4 * Math.tan(Math.PI / n));
        System.out.println("The area is: " + area);
    }
}
