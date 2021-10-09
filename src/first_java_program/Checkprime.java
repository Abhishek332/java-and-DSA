package first_java_program;
import java.util.Scanner;

public class Checkprime{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = in.nextInt();
        boolean flag = true;
        if(num>3){
            for(int i=2; i<=num/2; i++){
                if(num%i==0){
                    flag = false;
                    break;
                }
            }
        }
        if(flag)
            System.out.println("Number is Prime");
        else
            System.out.println("Number is not Prime");
    }
}