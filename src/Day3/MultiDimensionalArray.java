package Day3;

public class MultiDimensionalArray {


    public static void main(String[] args)
    {

        //Two/Multi dimensional array

        //1. Declaring array

        //Approach 1          when you know the value.

        int a[][] = new int[3][2];

        a[0][0] = 100;
        a[0][1] = 200;

        a[1][0] = 300;
        a[1][1] = 400;

        a[2][0] = 500;
        a[2][1] = 600;

        //Approach 2    when you don't know the value and want to add it in, future.

        int b[][] = {{100,200},{300,400},{500,600}};


        //2. Find length of an array

        System.out.println(a.length);   //It will give number of rows.
        System.out.println(a[0].length);  //It will give number of columns of specific row.

        //3. Read single value of an array

        System.out.println(a[0][1]);

        //4. Read all the value from an array

        //Normal for loop

//        for (int r=0;r<=a.length-1;r++)
//        {
//            for (int c=0;c<=a[r].length-1;c++)
//            {
//                System.out.print(a[r][c]);
//            }
//            System.out.println();
//        }


        //Enhanced for loop

        for (int arr[]:a)           //Here 'a' is two-dimensional array that is why we are capturing it
                                       //in array type of variable.
        {
            for (int x:arr)
            {
                System.out.print(x+" ");
            }
            System.out.println();
        }













    }



}
