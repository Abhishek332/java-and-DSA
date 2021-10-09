package functions;

import java.util.Scanner;

public class Area_Circumference_of_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        int r = in.nextInt();
        area_circumferrence(r);
    }

    static void area_circumferrence(int r){
        System.out.println("Area of Circle is : " + 3.14*r*r);
        System.out.println("Circumferrence is : " + 2*3.14*r);
    }
}
