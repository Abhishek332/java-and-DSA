/*Kunal is allowed to go out with his friends only on the even days of a given month.
Write a program to check if he can go out in the month of August.*/

package conditional;

import java.util.Scanner;

public class Allow_to_go {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Today's Date");
        int dt = in.nextInt();
        if(dt>=1 && dt<=31){
            if(dt%2==0)
                System.out.println("He can go today");
            else
                System.out.println("Kunal can't go today");
        }
        else
            System.out.println("You Entered a Date that can't Exist.");
    }
}
