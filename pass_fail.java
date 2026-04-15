import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks ");
        int marks = sc.nextInt();
        String result = marks>=33 ?"pass":"fail";
        System.out.println(result);
        sc.close();
    }
}
