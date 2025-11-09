import java.util.Scanner;

public class HexToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.nextLine();

        int decimal = Integer.parseInt(hex, 16);
        String octal = Integer.toOctalString(decimal);

        System.out.println("Equivalent of octal number is: " + octal);
    }
}
