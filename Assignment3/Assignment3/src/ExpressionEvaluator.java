public class ExpressionEvaluator {
    public static void main(String[] args) {
        int exprA = (101 + 0) / 3;
        double exprB = 3.0e-6 * 10000000.1;
        boolean exprC = true && true;
        boolean exprD = false && true;
        boolean exprE = (false && false) || (true && true);
        boolean exprF = (false || false) && (true && true);

        System.out.println("(101 + 0) / 3 -> " + exprA);
        System.out.println("(3.0e-6 * 10000000.1) -> " + exprB);
        System.out.println("(true && true) -> " + exprC);
        System.out.println("(false && true) -> " + exprD);
        System.out.println("((false && false) || (true && true)) -> " + exprE);
        System.out.println("(false || false) && (true && true) -> " + exprF);
    }
}