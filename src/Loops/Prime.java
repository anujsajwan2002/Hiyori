package Loops;

public class Prime {
    public static void main(String[] args){
        int n = 29, isPrime = 1;
        if (n <= 1) isPrime = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = 0;
                break;
            }
        }
        System.out.println(isPrime == 1 ? "Prime" : "Not Prime");
    }
}
