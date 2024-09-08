package Tcs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Q1 {
   /* A chocolate factory is packing chocolates into the packets.
   The chocolate packets here represent an array  of N number of integer values.
   The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

    Example 1 :

    N=8 and arr = [4,5,0,1,9,0,5,0].

    There are 3 empty packets in the given set. These 3 empty packets represented as
    O should be pushed towards the end of the array

    Input :

            8  – Value of N

   [4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline */


    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);

        
        System.out.println("Enter value of N ");

        int N= sc.nextInt();

        LinkedList<Integer> Lis=new LinkedList<>();

        for (int i=0;i<N;i++) {

            Lis.add(sc.nextInt());
        }
        System.out.println("Before "+Lis);

        Collections.sort(Lis,Collections.reverseOrder());

        for (int i=0;i<Lis.size();i++)
        {
            int Data= Lis.get(i);
            System.out.print(Data+" ");
        }

    }
}
