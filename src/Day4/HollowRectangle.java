package Day4;

import java.util.Scanner;

public class HollowRectangle {

    public static void main(String[] args) {

        //Q1. Pattern Hollow rectangle

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        for(int i=1;i<=num1;i++)
        {
            for (int j=1;j<=num2;j++)
            {
                if (i==1 || j==1 || i==num1 || j==num2)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }





    }
}