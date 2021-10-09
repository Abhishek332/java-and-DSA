package functions;

import java.util.Scanner;

public class Pythagorean_triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of all three sides of a triangle");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(check_pythagorean(a,b,c))
            System.out.println("Yes, It is satisfying Pythagorean Triplet");
        else
            System.out.println("No, It is not satisfying Pythagorean Triplet");
    }

    static boolean check_pythagorean(int a, int b, int c){
        if(a>b){
            if(c>a)
                return c*c == a*a + b*b;
            else
                return a*a == b*b + c*c;
        }else {
            if (c > b)
                return c * c == a * a + b * b;
            else
                return b * b == a * a + c * c;
        }
    }
}
