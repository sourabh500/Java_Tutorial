package Day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLists {


    /*  Operations :

    Declare an ArrayList of different Types
    Add Element
    Get Element
    Add Element at a specific Index
    Set Element at a specific Index
    Delete Element from an Index
    Size of the List
    Loop/Iterate on the List
    Sort the List      */

    public static void main(String[] args)
    {

        //Declare an ArrayList of different types

        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();


        //Add elements

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(4);
        System.out.println(list);

        //To get elements

        int element= list.get(3);     //getting list element at index 3
        System.out.println(element);


        //add element in between

        list.add(1,5);   //adding element 5 at index 1
        System.out.println(list);

        //set element


        list.set(1,0);             //setting 0 at index 1
        System.out.println(list);

        //remove element

        list.remove(1);    //removing element at index 1
        System.out.println(list);

        //size of ArrayList

        int s=list.size();           //getting the size of ArrayList
        System.out.println(s);


        //loops on ArrayList

        //Normal for loop
        for (int i=0;i<list.size();i++)
        {
            int ele=list.get(i);
            System.out.print(ele);
        }
        System.out.println();

        //enhanced for loop

        for (int numbers:list)
        {
            System.out.print(numbers);
        }

        System.out.println();


        //using iterator

        Iterator<Integer> it=list.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        //sorting the arraylist

//        list.add(2);
//        Collections.sort(list);         //sorting in ascending order
//        System.out.println(list);


        //Remove specific elements from the array list

        //Firstly create another array list and select which elements you want to remove

        ArrayList<Object> myList=new ArrayList<>();
        myList.add(1);
        myList.add(2);

        list.removeAll(myList);
        System.out.println(list);


    }




}




