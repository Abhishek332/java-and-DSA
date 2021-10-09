package functions;

import java.util.Scanner;

public class Grade_calculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks out of 100");
        int mark = in.nextInt();
        showGrade(mark);
    }

    static void showGrade(int m){
        if(m>=91 && m<=100)
            System.out.println("AA");
        else if(m>=81 && m<=90)
            System.out.println("AB");
        else if(m>=71 && m<=80)
            System.out.println("BB");
        else if(m>=61 && m<=70)
            System.out.println("BC");
        else if(m>=51 && m<=60)
            System.out.println("CD");
        else if(m>=41 && m<=50)
            System.out.println("DD");
        else if(m<=40)
            System.out.println("Fail");
        else
            System.out.println("You Entered more then 100 marks");
    }
}
