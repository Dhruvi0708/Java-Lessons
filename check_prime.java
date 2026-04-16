package Loops;
import java.util.Scanner;

public class check_prime {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if(num==0){
                break;
            }
            boolean isPrime = true;
            for (int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime==true){
                System.out.println("Prime number");
            }
            else{
                System.out.println("Not a prime number");
            }
        }
        sc.close();
    }
}
