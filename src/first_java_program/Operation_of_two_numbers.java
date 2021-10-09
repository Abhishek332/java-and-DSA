package first_java_program;

import java.util.Scanner;

public class Operation_of_two_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter one digit, then expression, then second number");
        int num1 = in.nextInt();
        char operator = in.next().charAt(0);
        int num2 = in.nextInt();
        switch(operator){
            case '+' :
                System.out.println(num1 + num2);
                break;
            case '-' :
                System.out.println(num1 - num2);
                break;
            case '*' :
                System.out.println(num1 * num2);
                break;
            case '/' :
                System.out.println(num1 / num2);
                break;
            case '%' :
                System.out.println(num1 % num2);
                break;
            default :
                System.out.println("Wrong Expression, Please Enter Right Expression");
        }
    }
}
