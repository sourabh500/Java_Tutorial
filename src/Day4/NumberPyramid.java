package Day4;

import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {

        //Q1. Pattern Number pyramid

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num = sc.nextInt();
        int n=0;

        //outer loop
        for (int i=1;i<=num;i++)
        {
            //spaces
            for (int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print(n+i+" ");
            }
            System.out.println();
        }


    }
}
