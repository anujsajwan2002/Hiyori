package JavaIO;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!!");
    }
}
