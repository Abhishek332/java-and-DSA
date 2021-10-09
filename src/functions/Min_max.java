package functions;

import java.util.Scanner;

public class Min_max {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Three Numbers Respectively");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int min = min(a,b,c);
        System.out.println("Minimum in three numbers is : " + min);
        int max = max(a,b,c);
        System.out.println("Maximum in three numbers is : " + max);
    }

    static int min(int a, int b, int c){
        int min = a;
        if(b<min)
            min = b;
        if(c<min)
            min = c;
        return min;
    }

    static int max(int a, int b, int c){
        int max = a;
        if(b>max)
            max = b;
        if(c>max)
            max = c;
        return max;
    }
}
