package Loops;

import java.util.Scanner;

public class sumfirst_n {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int count = 1;
        int sum =0;
        while(count<=num){
            sum += count;
            count++;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
