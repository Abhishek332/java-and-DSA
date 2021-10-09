package first_java_program;

import java.util.Scanner;
public class Simple_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principle");
        float P = in.nextFloat();
        System.out.println("Enter Rate");
        float R = in.nextFloat();
        System.out.println("Enter Time");
        float T = in.nextFloat();
        System.out.println("The Simple interest is " + P*R*T/100);
    }
}
