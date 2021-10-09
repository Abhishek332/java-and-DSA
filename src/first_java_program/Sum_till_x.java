package first_java_program;

import java.util.Scanner;

public class Sum_till_x {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers, I will add till you enter \"x\" ");
        int sum = 0;
        char num;
        while(true){
            num = in.next().charAt(0);
            if(num!='x'){
                sum += Integer.parseInt(String.valueOf(num));
            }
            else{
                break;
            }
        }
        System.out.println("Total Sum = " + sum);
    }
}
