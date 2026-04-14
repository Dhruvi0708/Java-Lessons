import java.util.Scanner;

public class bill_total_avg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser ;
        System.out.println("Total = "+total);
        float newTotal = total + (0.18f * total);
        System.out.println("Cost after gst = "+newTotal);

        sc.close();
    }
}



