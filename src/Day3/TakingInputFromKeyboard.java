package Day3;

import java.util.Scanner;

public class TakingInputFromKeyboard {


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number");

        int num1=sc.nextInt();

        System.out.println("Enter second number");

        int num2=sc.nextInt();

        System.out.println("Addition of two numbers is :"+(num1+num2));


    }



}
