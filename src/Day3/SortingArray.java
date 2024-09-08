package Day3;

import java.util.Arrays;

public class SortingArray {


    public static void main(String[] args)
    {
        //soring array

        int a[]={400,200,500,300,100,};

        System.out.println("Before sorting");
        System.out.println(Arrays.toString(a));   //print all the values of array

        Arrays.sort(a);   //This will sort array

        System.out.println("After sorting");
        System.out.println(Arrays.toString(a));



    }
}
