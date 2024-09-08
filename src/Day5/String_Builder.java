package Day5;

import java.util.Scanner;

public class String_Builder {

    public static void main(String[] args)
    {

        //Reverse a string using stringBuilder
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.next();

        StringBuilder sb=new StringBuilder(str);

        for (int i=0;i<sb.length()/2;i++)
        {
            int front=i;
            int back=sb.length()-i-1;

            char frontChar= sb.charAt(front);
            char backChar= sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }

        System.out.println(sb);

    }

}
