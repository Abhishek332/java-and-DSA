package functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers respectively");
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = sum(a,b);
        System.out.println("Sum of " + a + " and " + b +" is : " + ans);
    }

    static int sum(int a, int b){
        return a+b;
    }
}
