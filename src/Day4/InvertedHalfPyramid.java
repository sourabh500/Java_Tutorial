package Day4;

import java.util.Scanner;

public class InvertedHalfPyramid {

    public static void main(String[] args) {

        //Q1. Pattern Half pyramid

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();

//        for(int i=num1;i>=1;i--)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //rotated 180 degree

        //outer loop
        for (int i=1;i<=num1;i++)
        {

            //print space
            for(int j=1;j<=num1-i;j++)
            {
                System.out.print(" ");
            }
            //print stars
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
