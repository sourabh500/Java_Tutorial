package Day11;

import java.util.*;

public class HashMapDemo {


    public static void main(String[] args)
    {

        //Declaring Hashmap

        HashMap<Integer,String> myMap=new HashMap<>();

        //Adding pairs

        myMap.put(1,"Hello");
        myMap.put(2,"World");
        myMap.put(3,"Java");

        System.out.println(myMap);       //It will print the pairs of hashmap

        //Size of hashmap

        System.out.println("Size of hashmap is "+myMap.size());     //Print size of Hashmap


        //Remove pair from hashmap

        myMap.remove(2);//Here 2 is the key

        System.out.println(myMap);


        //Access value of the key

        System.out.println(myMap.get(1));   //This will print value of key at 1 in hashmap

        //Get all the keys from hashmap

        Set<Integer> allKey=myMap.keySet();     //Return all the key in form of set
        System.out.println(allKey);

       // Get all the values from Hashmap

        Collection<String> allValue=myMap.values();   //Return all the values in form of collection
        System.out.println(allValue);


        //Get keys along with the values

        System.out.println(myMap.entrySet());   //Return key along with values

        //Reading data from hashmap

        //using for each loop

        for (int k:allKey)   //allkey is myMap.keySet()  Returns all the keys
        {
            System.out.println(k+"     "+myMap.get(k));
        }


        //using iterator

         Iterator<Map.Entry<Integer,String>> it= myMap.entrySet().iterator();

        while (it.hasNext())
        {
            Map.Entry<Integer,String> ent=it.next();
            System.out.println(ent.getKey()+"   "+ent.getValue());
        }


    }


}
