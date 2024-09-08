package Day6;

public class Recursion {

    //print numbers 1 to 5 using recursion


    public static void PrintNumber(int n)
    {
       if (n==6)
       {
           return;
       }

       System.out.println(n);
       PrintNumber(n+1);

    }

    public static void main(String[] args)
    {
        int n=1;      //Initializing the value
        PrintNumber(n);   //Calling the function

    }


}
