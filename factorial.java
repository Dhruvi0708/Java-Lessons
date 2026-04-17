package Loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for factorial");
        int num = sc.nextInt();
        int product = 1;
        for(int i=num;i>=1;i--){
            product*=i;
        }
        System.out.println("Factorial - "+product);

        sc.close();
    }
}
