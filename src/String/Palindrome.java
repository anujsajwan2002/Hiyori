package String;

import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String n = sc.nextLine();
        String reversed = new StringBuilder(n).reverse().toString();

        if(n.equals(reversed)){
            System.out.println("Palindrome!!");
        }else{
            System.out.println("Not a Palindrome!!");

        }
    }
}
