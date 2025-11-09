import java.util.Scanner;

public class BetweenZeroAndOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of a side (s): ");
        double s = scanner.nextDouble();

        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

        System.out.println("The area of the hexagon is: " + area);

        scanner.close();
    }
}
