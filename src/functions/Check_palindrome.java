package functions;

import java.util.Scanner;

public class Check_palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = in.nextInt();
        if(check_palindrome(a))
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
    }

    static boolean check_palindrome(int n){
        int a, b=0, n1 = n;
        while(n1>0){
            a=n1%10;
            n1=n1/10;
            b= b*10+a;
        }
        return n==b;
    }
}
