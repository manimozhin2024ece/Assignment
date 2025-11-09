import java.util.Scanner;
public class ClimbStairs {
    public static int countWays(int n) {
        if (n <= 1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1; // 1 way to stay at the ground
        dp[1] = 1; // 1 way to reach the first step
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }	return dp[n];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of steps: ");
        int n = scanner.nextInt();
        int ways = countWays(n);
        System.out.println("Distinct ways can you climb to the top: " + ways);
    }
}