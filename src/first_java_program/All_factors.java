package first_java_program;

import java.util.Scanner;

public class All_factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = in.nextInt();
        for(int i=2; i<a; i++){
            if(a%i==0){
                System.out.println(i);
            }
        }
    }
}
