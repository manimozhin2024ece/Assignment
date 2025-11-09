public class SumOfPrimes {
    public static boolean isPrime(int num) {
        if (num <= 1)	return false;
        if (num == 2)	return true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        } return true;
    }
    public static void main(String[] args) {
        int count = 0, num = 2, sum = 0;
        for ( ; count < 100 ; num++) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
        } System.out.println("Sum of the first 100 prime numbers: " + sum);
    }
}
