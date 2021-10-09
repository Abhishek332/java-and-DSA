package functions;

import java.util.Scanner;

public class Check_eligibility {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = in.nextInt();
        boolean flag = eligible(age);
        if(flag)
            System.out.println("You are eligible for Voting");
        else
            System.out.println("You are not eligible for Voting");
    }

    static boolean eligible(int age){
            return age>=18;
    }
}


