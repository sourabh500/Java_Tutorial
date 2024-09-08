package Day3;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args)
    {

        //Take a matrix as input from user.Search for a given number x
        //and print indices at which it occurs.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int rows=sc.nextInt();
        System.out.println("Enter columns");
        int cols=sc.nextInt();

        //Declaring array
        int a[][]=new int[rows][cols];

        //input
        //for rows
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<cols;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter x number");
        int x=sc.nextInt();

        //output
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<cols;j++)
            {
                if (a[i][j]==x)
                {
                    System.out.println(x+" found at location ("+i+","+j+")");
                }

            }

        }


    }


}
