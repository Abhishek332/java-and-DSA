package first_java_program;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int ans =1, num = in.nextInt();
        while(num>1){
            ans*=num;
            num--;
        }
        System.out.println("Factorial of given number is " + ans);
    }
}
