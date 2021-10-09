package conditional;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Price");
        int price = in.nextInt();
        System.out.println("Enter Discount Rate");
        float rate = in.nextFloat();
        System.out.println("Discount is " + price*rate/100);
    }
}
