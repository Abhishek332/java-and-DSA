package functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = in.nextInt();
        System.out.println(factorial(n));
    }

    static int factorial(int n){
        int a =1;
        if(n==1 || n==0){
            return 1;
        }else{
            while(n>1){
                a*=n;
                n--;
            }
            return a;
        }
    }
}
