import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OptimizedPrimeFinder {
    public static List<Integer> findPrimes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int num = 2; num * num <= limit; num++) {
            if (isPrime[num]) {
                for (int multiple = num * num; multiple <= limit; multiple += num) {
                    isPrime[multiple] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
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
