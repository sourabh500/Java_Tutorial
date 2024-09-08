package Day2;

import java.util.Enumeration;
import java.util.Scanner;

public class Loop_Exercise {


    public static void main(String[] args)
    {

        //Q1. Write a program to calculate the sum of first 10 natural number.


//        int sum=0;
//        for(int i=0;i<=10;i++)
//        {
//           sum+=i;
//        }
//        System.out.println("sum of first 10 natural number is "+sum);


        //Q2. Write a program that prompts the user to input a positive integer.
        // It should then print the multiplication table of that number.
//
//        Scanner console=new Scanner(System.in);
//        int num;
//
//        System.out.println("Enter any positive integer: ");
//        num=console.nextInt();
//
//        System.out.println("Multiplication table of "+num);
//
//        for (int i=1;i<=10;i++)
//        {
//            System.out.println(num+" * "+i+" = "+(num*i));
//        }


        //Q4. Write a program to find the factorial value of any number entered through the keyboard.


//        Scanner console=new Scanner(System.in);
//        int num;   //To hold number
//        int fact=1;    //To hold factorial
//
//        System.out.println("Enter a number: ");
//        num=console.nextInt();
//
//
//        for (int i=1;i<=num;i++)
//        {
//            fact*=i;
//        }
//        System.out.println("Factorial value of" +num+ "is :" +fact);



        //Q5. Two numbers are entered through the keyboard.
        // Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

//        Scanner sc=new Scanner(System.in);
//        int base;  //To hold base number
//        int power;   //To hold power
//        int result = 1;    //To hold result
//
//        System.out.println("Enter base number :");
//        base=sc.nextInt();
//
//        System.out.println("Enter power number :");
//        power=sc.nextInt();
//
//        for (int i=1;i<=power;i++)
//        {
//            result *= base;
//        }
//
//        System.out.println("Result is : "+result);


        //Q6. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
        // For example, if the input is 12345, the output should be 54321.

         Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter five digit number");
//        int num= sc.nextInt();
//
//        int reverse=0;
//
//
//        while(num!=0)
//        {
//           reverse=reverse*10+num%10;
//           num=num/10;
//        }
//        System.out.println("Reverse number of entered number is : "+reverse);


        //Q7. Write a program that reads a set of integers,
        // and then prints the sum of the even and odd integers.

//        System.out.println("Enter a number");
//        int num=sc.nextInt();
//        int even=0;
//        int odd=0;
//
//        while (num>0)
//        {
//            if (num%2==0)
//            {
//                even+=num;
//
//            }
//            else {
//                odd+=num;
//            }
//
//        }
//        System.out.println("sum of even number is "+even+" & Sum of odd number is "+odd);


        //Q8. Write a program that prompts the user to input a positive integer.
        // It should then output a message indicating whether the number is a prime number.

//        System.out.println("Enter any positive number");
//        int num= sc.nextInt();
//
//        while (num>0)
//        {
//            if (num%2==1)
//            {
//                System.out.println(num+" : is a prime number");
//                break;
//            }
//            else {
//                System.out.println(num + " : is not a prime number");
//                break;
//            }
//        }

        //Q9. Write a program to enter the numbers till the user wants and
        // at the end it should display the count of positive, negative and zeros entered.

        System.out.println("Enter any number");

        int positive=0;
        int negative=0;
        int zero=0;

        for (int i = 1;i<=10; i++) {
            int num= sc.nextInt();
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else
                zero++;

        }
        System.out.println("Positive numbers are "+positive);
        System.out.println("Negative numbers are "+negative);
        System.out.println("Zero are "+zero);

    }



}
