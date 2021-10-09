package functions;

import java.util.Scanner;

public class Checkeven {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = in.nextInt();
        checkeven(num);
    }

    static void checkeven(int a){
        if(a%2 == 0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }
}