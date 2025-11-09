import java.util.Scanner;
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
    	int a = scanner.nextInt();
    	System.out.print("Enter the Second Number: ");
        int b = scanner.nextInt();
        if (a == b)	System.out.println(a + " == " + b);
        if (a != b)	System.out.println(a + " != " + b);
        if (a < b)	System.out.println(a + " < " + b);
        if (a > b) 	System.out.println(a + " > " + b);
        if (a <= b)	System.out.println(a + " <= " + b);
        if (a >= b) System.out.println(a + " >= " + b);
    }
}
