package Day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {


    public static void main(String[] args)
    {

        //Declaring HashSet

        HashSet<Object> MySet=new HashSet<>();

        //Adding elements into hashset

        MySet.add(1);
        MySet.add("welcome");
        MySet.add(3);
        MySet.add('A');
        MySet.add(null);
        MySet.add(true);

        //Printing hashset

        System.out.println(MySet);      //The order will not be same


        //Indexing is not there in hashset
        //Insertion is not possible in hashset
        //Access specific element is not possible directly in hashset


        //To access specific element in hashset we have to convert hashset into arraylist

        ArrayList<Object> Li=new ArrayList<>(MySet);

        System.out.println(Li);

        System.out.println(Li.get(2));    //access specific element at index 2


        //Reading all the values from hashset

        for (Object Read:MySet)
        {
            System.out.println(Read);
        }


        //Using iterator

       Iterator<Object> it=MySet.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }


        //Clear all the values

        MySet.clear();
        System.out.println(MySet);        //Now it is empty


        //To check hashset is empty or not

        System.out.println(MySet.isEmpty());  //It will return True/false

    }

}
