package Functions;

import java.util.Scanner;

public class Prime_Factors {
    public static void main(String[] args){
//        int num = 90;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        for(int i=2 ; i <= num ; i++){
            while(num%i == 0){
                System.out.println( i + " ");
                num /= i;
            }
        }
    }
}
