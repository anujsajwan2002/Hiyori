package Loops;

public class LCM {
    public static void main(String[] args){
        int a=12 , b=15;
        int gcd=a , temp=b;
        while(temp != 0){
            int t = temp;
            temp = gcd%temp;
            gcd = t;
        }
        int lcm = (a*b)/gcd;
        System.out.println("LCM : "+lcm);
    }
}
