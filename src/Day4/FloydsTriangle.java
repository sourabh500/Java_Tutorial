package Day4;

import java.util.Scanner;

public class FloydsTriangle {


    public static void main(String[] args) {

        //Q1. Pattern floyd's triangle with numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        int number=1;


        //outer loop

        for(int i=1;i<=num1;i++)
        {
            //inner loop

            for (int j=1;j<=i;j++)
            {
                System.out.print(number);
                number++;
            }
            System.out.println();
        }



    }
}
