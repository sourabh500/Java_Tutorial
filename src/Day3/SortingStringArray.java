package Day3;

import java.util.Arrays;

public class SortingStringArray {


    public static void main(String[] args)
    {
        String s[]={"welcome","john","Apple","coding"};

        System.out.println("Before sorting");
        System.out.println(Arrays.toString(s));

        Arrays.sort(s);

        System.out.println("After sorting");
        System.out.println(Arrays.toString(s));

        //output
/*
        Before sorting
        [welcome, john, Apple, coding]
        After sorting
        [Apple, coding, john, welcome]
*/




    }



}
