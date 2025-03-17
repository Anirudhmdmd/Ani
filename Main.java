public class PrimeNumber {
    public static boolean isPrime(int num) {
        if (num < 2) return false; // Numbers less than 2 are not prime
        for (int i = 2; i * i <= num; i++) { // Loop till square root of num
            if (num % i == 0) return false; // If divisible, not prime
        }
        return true; // If no factors found, it's prime
    }

    public static void main(String[] args) {
        int num = 29; // Change this number to test
        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }
    }
}
