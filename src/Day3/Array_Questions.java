package Day3;

import java.util.Arrays;

public class Array_Questions {

    public static void main(String[] args)
    {

        //Q1. Write a Java program to sort a numeric array and a string array.

        int a[]={2,4,1,6,7,3,5};

//        System.out.println("Before sorting");
//        System.out.println(Arrays.toString(a));
//
//        Arrays.sort(a);
//
//        System.out.println("After sorting");
//        System.out.println(Arrays.toString(a));

        // Using bubble sort technique

        System.out.println("Before sorting");
        System.out.println(Arrays.toString(a));

        int n=a.length;

        for(int i=0;i<n-1;i++)     //Number of passes
        {
            for(int j=0;j<n-i-1;j++)  //Iteration
            {
               if (a[j]>a[j+1])
               {
                   //swap
                   int temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;

               }
            }
            System.out.println("After sorting");
            System.out.println(Arrays.toString(a));
        }







    }



}
