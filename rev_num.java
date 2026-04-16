package Loops;
import java.util.Scanner;

public class rev_num {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse =0;
        while(num>0){
            int lastDigit = num%10;
            reverse = reverse *10 + lastDigit;
            num = num/10;
        }
        System.out.println("Reverse = "+reverse);

        sc.close();
    }
}
