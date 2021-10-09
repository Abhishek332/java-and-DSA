package conditional;

import java.util.Scanner;

public class Average_of_N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of N");
        int n = in.nextInt();
        int total = 0;
        for(int i=1; i<=n; i++){
            total+= in.nextInt();
        }
        System.out.println("Average is " + (float)total/n);
    }
}
