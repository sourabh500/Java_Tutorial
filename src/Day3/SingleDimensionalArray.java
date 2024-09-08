package Day3;

public class SingleDimensionalArray {


    public static void main(String[] args)
    {
        //Single dimensional array

        //1. Declaring an array and adding value

        //Approach 1   When ,you the number of values.

        int a[]=new int[5];   //This is a fixed value

        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;


        //Approach 2   When we don't know the value and add it in, future.

        int b[] = {100,200,300,400,500};     //We can add values


        //2. Find length of an array ?

        System.out.println(a.length);      //This will print the length of an array
        System.out.println(b.length);

        //3. Read single value from an array.

        System.out.println(a[3]);    //This will print value array at index 3.


        //4. Read all the values from an array.

        //Normal for loop

//        for(int i=0;i<=a.length-1;i++)
//        {
//            System.out.println(a[i]);
//        }
//

        //Enhanced for loop/for each loop

        for(int x:a)
        {
            System.out.println(x);
        }




    }
}
