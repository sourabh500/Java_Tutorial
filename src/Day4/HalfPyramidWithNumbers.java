package Day4;

import java.util.Scanner;

public class HalfPyramidWithNumbers {

    public static void main(String[] args)
    {

        //Half pyramid with numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        //outer loop
        for (int i=1;i<=num1;i++)
        {
            //inner loop
            for (int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }



    }


}
