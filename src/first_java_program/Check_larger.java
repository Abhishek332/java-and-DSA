package first_java_program;

import java.util.Scanner;

public class Check_larger {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input Three Numbers");
        int a = in.nextInt(), b= in.nextInt(), c=in.nextInt();
        int max = a;
        if(max<b){
            max = b;
        }
        if(max<c){
            max = c;
        }
        System.out.println("Maximum is : " + max);
    }
}
