package first_java_program;
import java.util.Scanner;

public class LCM_HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = in.nextInt(), b = in.nextInt(), temp, hcf, lcm;
        int num1 = a, num2 = b;
        while(true){
            if(a<b){
                temp = a;
                a=b;
                b=temp;
            }
            temp = a%b;
            if(temp==0){
                hcf = b;
                break;
            }else {
                a = b;
                b = temp;
            }
        }
        System.out.println("HDF is " + hcf);
        lcm = num1*num2/hcf;
        System.out.println("LCM is " + lcm);
    }
}
