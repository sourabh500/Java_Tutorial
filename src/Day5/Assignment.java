package Day5;

import java.util.Scanner;

public class Assignment {


    //Take an array of strings input from the user and find the cumulative (combined)
    //length of string

    public static void main(String[] args)
    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter array size");
//        int size=sc.nextInt();
//        String a[]=new String[size];
//
//        //input
//        for (int i=0;i<a.length;i++)
//        {
//            a[i]=sc.next();
//        }
//
//        int Total=0;
//        //output
//        for (int i=0;i<a.length;i++)
//        {
//            int Length=a[i].length();
//            Total+=Length;
//
//        }
//        System.out.println("Total length of the string is : "+Total);



        //Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
        //Example :
        //original = “eabcdef’ ; result = “iabcdif”

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter any name");
//
//        String Original=sc.next();
//
//        String result = "";
//
//        for (int i=0;i<Original.length();i++)
//        {
//            if (Original.charAt(i)=='e')
//            {
//
//                result+= 'i';
//
//            }
//            else
//            {
//                result+=Original.charAt(i);
//
//            }
//
//        }
//        System.out.println(result);



        //Input an email from the user.
        //You have to create a username from the email by deleting the part that comes after ‘@’.
        // Display that username to the user.

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an email address");

        String email=sc.next();
        String userName= "";

        for (int i=0;i<email.length();i++)
        {
            if (email.charAt(i)=='@')
            {
               break;
            }
            else
            {
                userName+= email.charAt(i);
            }
        }
        System.out.println(userName);
        
    }
}
