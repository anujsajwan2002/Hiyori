package Operators;

public class Gp {
    public static void main(String[] args){
        int a = 3;    // first term
        int r = 2;    // common ratio
        int n = 4;    // term to find
        double tn = a * Math.pow(r, n - 1); //ar^(n-1)
        System.out.println("GP nth term: " + tn);  // Output: 24.0

    }
}
