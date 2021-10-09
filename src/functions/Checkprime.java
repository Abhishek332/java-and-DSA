package functions;

import java.util.Scanner;

public class Checkprime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        boolean f = checkprime(a);
        if(f)
            System.out.println("Number is Prime");
        else
            System.out.println("Number is not Prime");
    }

    static boolean checkprime(int num){
        int c=2;
        while(c*c<num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
