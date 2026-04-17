package Loops;

import java.util.Scanner;

public class even_odd_sum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers and for exit press 0");
        int num;
        int evensum = 0;
        int oddsum = 0;
        while(true){
            num = sc.nextInt();
            if(num==0){
                break;
            }
            else if(num % 2 ==0){
                evensum+=num;
            }
            else{
                oddsum+=num;
            }
        }
        System.out.println("Sum of even numbers - "+evensum);
        System.out.println("Sum of odd numbers - "+oddsum);
        sc.close();
    }
}
