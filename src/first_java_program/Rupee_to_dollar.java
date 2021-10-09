package first_java_program;

import java.util.Scanner;

public class Rupee_to_dollar {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Currency in Indian Rupee, I will convert into Dollar");
        int rs = in.nextInt();
        System.out.println(rs + "Rs. in dollar is " + rs/70 + "$");
    }
}
