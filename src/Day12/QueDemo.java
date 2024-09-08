package Day12;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueDemo {


    public static void main(String[] args)
    {

        //Declaring queue

        PriorityQueue<Object> q=new PriorityQueue<>();

        //Adding elements add()  offer()

        q.add("cricket");
        q.add("swimming");
        //q.add(100);        //java.lang.ClassCastException
       // q.offer(10);    //java.lang.ClassCastException
        //q.offer(5.0);   //java.lang.ClassCastException

        //In queue Heterogeneous data is not allowed.
        System.out.println(q);      //Insertion order is preserved and duplicates also allowed

        //Removing elements   remove()  poll()

        System.out.println(q.remove());   //cricket
        System.out.println(q);    //[swimming]

        System.out.println(q.poll());   //swimming
        System.out.println(q);    //[]

       // System.out.println(q.remove());   //It will return NoSuchElementException if queue is empty
        System.out.println(q.poll());    //It will return null if queue is empty


        //Reading data from queue

        //Using iterator

       Iterator<Object> it= q.iterator();

       while (it.hasNext())
       {

           System.out.println(it.next());
       }

       //using for each loop

        for (Object ele:q)
        {
            System.out.println(ele);
        }

    }


}
