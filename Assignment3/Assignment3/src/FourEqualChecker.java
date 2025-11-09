import java.util.Scanner;
public class FourEqualChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = scanner.nextInt();
        System.out.print("Input second number: ");
        int b = scanner.nextInt();
        System.out.print("Input third number: ");
        int c = scanner.nextInt();
        System.out.print("Input fourth number: ");
        int d = scanner.nextInt();
        if (a == b && b == c && c == d) {
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are not equal!");
        }
    }
}
