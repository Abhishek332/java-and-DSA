package first_java_program;

import java.util.Scanner;

public class Largest_till_zero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Numbers Till 0, I will check largest Number");
        int max=0;
        int num = in.nextInt();
        while(num!=0){
            if(num>max) max = num;
            num = in.nextInt();
        }
        System.out.println("Largest Number is " + max);
    }
}
