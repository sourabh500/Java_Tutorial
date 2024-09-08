package Day4;

import java.util.Scanner;

public class SolidRhombus {

    public static void main(String[] args) {

        //Q1. Pattern Solid Rhombus

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        //outer loop

        for (int i=1;i<=num1;i++)
        {
            //space print
            for (int j=1;j<=num1-i;j++)
            {
                System.out.print(" ");
            }
            //print stars
            for (int j=1;j<=num1;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }


    }
