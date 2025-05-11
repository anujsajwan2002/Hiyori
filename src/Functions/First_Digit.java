package Functions;

public class First_Digit {
    public static void main(String[] args){
        int value = 96547;    // gives the first digit of a number
        while(value >= 10){
            value /= 10;   // value = value / 10
        }
        System.out.println("First Digit : " + value);
    }
}
