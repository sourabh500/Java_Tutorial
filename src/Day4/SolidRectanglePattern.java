package Day4;

import java.util.Scanner;

public class SolidRectanglePattern {


    public static void main(String[] args)
    {
        //Q1. Pattern rectangle

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();

        for (int i=num1;i>=1;i++)
        {
            for (int j=1;j<=num2;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }







    }
}
