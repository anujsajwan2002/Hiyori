package Operators;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args){
//      int num = 1234;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int lastDigit = num % 10;
        System.out.println("Last Digit of "+num+ " is : " +lastDigit);
    }
}
