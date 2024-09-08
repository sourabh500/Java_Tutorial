package Day9;

import java.util.LinkedList;
import java.util.Scanner;

public class Question {



    public static void main(String[] args)
    {

        //Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
        // Search for the number 7 & display its index.

        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        System.out.println(list);


        //searching for the number 7 and display its index

        for (int i=0;i<list.size();i++)
        {
            if (list.get(i)==7)

            {
                System.out.println("Index of number 7 is : " +i);
            }
        }



        //Take elements(numbers in the range of 1-50) of a Linked List as input from the user.
        // Delete all nodes which have values greater than 25.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers in the range of 1 to 50");
        LinkedList<Integer> li=new LinkedList<>();
        sc.nextInt();


        

    }
}
