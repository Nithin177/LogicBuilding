public class PrimeNumber {
    public static void main(String[] args) {
        int n = 37;
        boolean isPrime = checkPrime(n, 2);

        String result = isPrime ? "Prime" : "Not Prime";
        System.out.println(n + " is : " + result);
    }

    static boolean checkPrime(int n, int i) {
        // 0, 1 and negative numbers are not prime
        if (n < 2)
            return false;

        // Base case: if i exceeds sqrt(n), no divisors found → prime
        if (i * i > n)
            return true;

        // If n is divisible by i → not prime
        if (n % i == 0)
            return false;

        // Recurse with next i
        return checkPrime(n, i + 1);
    }
}
