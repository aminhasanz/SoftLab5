import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFinder {
    public static List<Integer> findPrimes(int limit) {
        List<Integer> primes = new ArrayList<>();
        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(num);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int limit = scanner.nextInt();
        List<Integer> primes = findPrimes(limit);
        System.out.println("Found " + primes.size() + " prime numbers up to " + limit);
    }
}
