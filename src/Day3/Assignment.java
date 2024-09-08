package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment {


    public static void main(String[] args)
    {

        //1. Find sum of elements in array

//        int a[]={1,2,3,4,5};
//        int sum=0;
//        for(int x:a)
//        {
//            sum+=x;
//            System.out.println(sum);
//
//        }

        //Print even and odd number from an array

//        int b[] = {1,2,3,4,5,6,7,8,9,10};
//
//        for(int y:b)
//        {
//            if (y%2==0)
//            {
//
//                System.out.println(y+" Number is even");
//            }
//            else
//                System.out.println(y+" Number is odd");
//        }


        // print array value in descending order

//        int c[]={10,20,30,40,50,60,70,80};
//
//        for(int i=c.length-1;i>=0;i--)
//        {
//            System.out.println(c[i]);
//        }

       //Take an array of names as an input from user and print them on screen.

        //Scanner sc=new Scanner(System.in);
//        System.out.println("Enter size");
//        int size=sc.nextInt();
//
//        String names[]=new String[size];
//        System.out.println("Enter names");
//
//        //input
//        for (int i=0;i<size;i++)
//        {
//            names[i]=sc.next();
//        }
//
//        //output
//        for(int i=0;i<names.length;i++)
//        {
//            System.out.println("Name"+(i+1)+"  is : "+names[i]);
//        }


        //Take an array as input from the user. search for a given number x and print the index at which occurs.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=sc.nextInt();

        int a[]=new int[size];
        System.out.println("Enter the number for index value");
        int num=sc.nextInt();

        for (int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }

        for (int i=0;i<size;i++)
        {
           if (num==a[i])
           {
               System.out.println("Number found at index "+i);
           }
        }














    }
}
