/*
Area Of Circle Java Program
Area Of Triangle
Area Of Rectangle Program
Area Of Isosceles Triangle
Area Of Parallelogram
Area Of Rhombus
Area Of Equilateral Triangle
 */

package conditional;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for \"Circle\" \n" +
                "Enter 2 for \'Triangle\' \n" +
                "Enter 3 for \'Rectangle\' \n" +
                "Enter 4 for \'Isoscele Traingle\' \n" +
                "Enter 5 for \'Parallelogram\' \n" +
                "Enter 6 for \'Rhombus\' \n" +
                "Enter 7 for \'Equilateral Triangle\'");
        System.out.println("\n\n Choose a option");
        int option = in.nextInt();
        switch (option){
            case 1 : {
                System.out.println("Enter Radius of Circle");
                int r = in.nextInt();
                System.out.println("Area of Circle is " + 3.14*r*r);
            }
            break;

            case 2 : {
                System.out.println("Enter Base and then Prependicular height");
                int base = in.nextInt();
                int height = in.nextInt();
                System.out.println("Area of triangle is " + 0.5*base*height);
            }
            break;

            case 3 : {
                System.out.println("Enter length and then width");
                int length = in.nextInt();
                int width = in.nextInt();
                System.out.println("Area of Rectangle is " + length*width);
            }
            break;

            case 4 : {
                System.out.println("Enter Base and then Prependicular height");
                int base = in.nextInt();
                int height = in.nextInt();
                System.out.println("Area of Isosceles triangle is " + 0.5*base*height);
            }
            break;

            case 5 : {
                System.out.println("Enter width and  height");
                int width = in.nextInt();
                int height = in.nextInt();
                System.out.println("Area of Parallelogram is " + width * height);
            }
            break;

            case 6 : {
                System.out.println("Enter both diagonal size");
                int d1 = in.nextInt();
                int d2 = in.nextInt();
                System.out.println("Area of Rhombus is " + d1 * d2);
            }
            break;

            case 7 : {
                System.out.println("Enter the value of side");
                int a = in.nextInt();
                System.out.println("Area of Equilateral Triangle is " + 1.732/4*a*a);
            }
            break;
        }
    }
}
