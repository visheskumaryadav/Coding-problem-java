package Basics;

public class Program2 {
    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num / 2); i++) {
                if (num % i == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrime(131));
    }
}
