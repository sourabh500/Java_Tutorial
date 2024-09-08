package Day9;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {



    public static void main(String[] args)
    {


        //Declaring Linked list

        LinkedList<Integer> l=new LinkedList<>();

        //Adding elements in linked list
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(7);

        //printing linked list
        System.out.println(l);

        //size of linked list

        int s=l.size();
        System.out.println(s);


        //Delete element by index value

        l.remove(2);  //Here 2 is, index
        System.out.println(l);

        //inserting element in between

        l.add(2,9);
        System.out.println(l);

        //Adding element at first position

        l.addFirst(2);
        System.out.println(l);

        //Adding elements at last

        l.addLast(10);
        System.out.println(l);

        //Deleting element at first and last

        l.removeFirst();
        l.removeLast();

        System.out.println(l);

        //Read the linked list data

        //1. using normal for loop
        for (int i=0;i<l.size();i++)
        {
            int data=l.get(i);
            System.out.println(data);

        }

        // 2. using for each loop

        for (int d:l)
        {
            System.out.print(d);
        }

        System.out.println();

        //3. Using iterator

       Iterator<Integer> it= l.iterator();
        while (it.hasNext())
        {
            int val= it.next();
            System.out.println(val);
        }


        //sort the inked list

        Collections.sort(l);
        System.out.println(l);

        //sorting in reverse order

        l.sort(Collections.reverseOrder());
        System.out.println(l);





    }
}
