package Tcs;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Q2 {

   /* Airport security officials have confiscated several item of the passengers at the security check point.
     All the items have been dumped into a huge box (array). Each item possesses a certain amount of risk[0,1,2].
     Here, the risk severity of the items represent an array[] of N number of integer values.
     The task here is to sort the items based on their levels of risk in the array.
     The risk values range from 0 to 2.

     Example :

Input :

7  -> Value of N

[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.

Output :

0 0 0 1 1 2 2  -> Element after sorting based on risk severity   */

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Value of N");

        int n=sc.nextInt();

        int a[]=new int[n];

        int count=0;
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]<a[i+1])
            {
                count++;
            }

        }
        System.out.println(count);

//        Arrays.sort(a);
//        System.out.print("After sorting"+Arrays.toString(a)+" ");


    }








}
