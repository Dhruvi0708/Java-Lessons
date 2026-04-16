package Loops;
import java.util.Scanner;

public class div_by_10_continue {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter numbers");
        while(true){
            num = sc.nextInt();
            if(num==0){
                break;
            }
            if(num%10==0){
                continue;
            }
            System.out.println("Entered number - "+num);
        }
        sc.close();
    }
}
