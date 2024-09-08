package Day4;

import java.util.Scanner;

public class Triangle01 {


    public static void main(String[] args) {

        //Q1. Pattern 0-1 triangle

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();



        //outer loop
        for (int i=1;i<=num1;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if ((i+j)%2==0)
                {
                    System.out.print("1 ");
                }
                else System.out.print("0 ");
            }
            System.out.println();
        }

    }
}
