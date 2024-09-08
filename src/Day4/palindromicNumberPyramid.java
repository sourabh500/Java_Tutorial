package Day4;

import java.util.Scanner;

public class palindromicNumberPyramid {

    public static void main(String[] args) {

        //Q1. Pattern palindromic Number pyramid

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num = sc.nextInt();


        for (int i=1;i<=num;i++)
        {
            //spaces
            for (int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            //first part
            for (int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            //second part
            for (int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }


    }

    }
