package Day4;

import java.util.Scanner;

public class HalfPyramid {


    public static void main(String[] args) {

        //Q1. Pattern Half pyramid

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        //outer loop
        for (int i=1;i<=num1;i++)
        {
            //inner loop
            for (int j=1;j<=i;j++)            //i ,is row number
            {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
