import java.util.Scanner;
public class CommonDigitChecker {
    public static boolean hasCommonDigit(int a, int b) {
        int a1 = a / 10, a2 = a % 10;
        int b1 = b / 10, b2 = b % 10;
        return (a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int first = scanner.nextInt();
        System.out.print("Input the second number: ");
        int second = scanner.nextInt();
        if (first < 25 || first > 75 || second < 25 || second > 75) {
            System.out.println("Numbers must be between 25 and 75.");
        } else {
            boolean result = hasCommonDigit(first, second);
            System.out.println("Result: " + result);
        }
    }
}
