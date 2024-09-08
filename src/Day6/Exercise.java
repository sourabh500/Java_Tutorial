package Day6;

import java.util.Scanner;
import java.util.Set;

public class Exercise {

    //print sum of n natural numbers

//    public static void PrintNaturalNum(int i,int n,int sum)
//    {
//        if (i==n)
//        {
//            sum+=i;
//            System.out.println("First natural numbers sum is "+sum);
//            return;
//        }
//
//        sum+=i;
//        PrintNaturalNum(i+1,n,sum);
//
//    }
//
//    public static void main(String[] args)
//    {
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter value of n ");
//        int num=sc.nextInt();
//
//        PrintNaturalNum(1,num,0);
//
//    }



    //print factorial of a number n
//
//    public static int CalFactorial(int n)
//    {
//        if (n==1 || n==0)
//        {
//            return 1;
//        }
//
//       int fact_nm= CalFactorial(n-1);
//       int fact_n=n*fact_nm;
//       return fact_n;
//
//    }
//
//    public static void main(String[]args)
//    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter value of n");
//        int num=sc.nextInt();
//        int result= CalFactorial(num);
//        System.out.println("Factorial of number "+num+" is : "+result);
//
//    }

    //print fibonacci number of nth term

//    public static void Fib(int a,int b,int n)
//    {
//        if(n==0)
//        {
//            return;
//        }
//
//        int c=a+b;
//        System.out.println(c);
//        Fib(b , c ,n-1);
//
//    }
//
//    public static void main(String[] args)
//    {
//
//        int a =0;
//        int b= 1;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter value of n");
//        int n=sc.nextInt();
//        System.out.println(a);
//        System.out.println(b);
//        Fib(a,b,n-2);
//
//
//    }


    //print x^n  (Stack height=n)


//    public static int calPower(int x,int n)
//    {
//
//        //base case 1
//        if (n==0)
//        {
//            return 1;
//        }
//        //base case 2
//        if (x==0)
//        {
//            return 0;
//        }
//
//        int powernm=calPower(x,n-1);   //This will calculate x^n-1
//        int  xPowern= x*powernm;          //This will calculate x*x^n-1
//        return xPowern;
//
//
//    }
//
//
//    public static void main(String[] args)
//    {
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter value of x");
//        int a= sc.nextInt();
//        System.out.println("Enter value of power");
//        int b=sc.nextInt();
//
//        int result=calPower(a,b);   //calling function
//        System.out.println(result);
//
//
//    }



    //print x^n (Stack height=log n)


//    public static int calPower(int x,int n)
//    {
//        //base case 1
//        if (n==0)
//        {
//            return 1;
//        }
//        //base case 2
//        if (x==0)
//        {
//            return 0;
//        }
//
//
//        if (n%2==0)   //when power is even
//        {
//           return calPower(x,n/2) * calPower(x,n/2);
//        }
//        else {    //when power is odd
//           return calPower(x,n/2)*calPower(x,n/2)* x;
//        }
//
//    }
//    public static void main(String[] args)
//    {
//
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter value of x");
//        int a=sc.nextInt();
//        System.out.println("Enter value of power");
//        int b=sc.nextInt();
//
//        //Calling function
//        int Result=calPower(a,b);
//        System.out.println(Result);    //Printing the answer
//
//
//    }
//

    //Reverse a string


//    public static void Reverse(String str,int i)
//    {
//        if (i==0)
//        {
//            System.out.print(str.charAt(i));
//            return;
//        }
//
//        System.out.print(str.charAt(i));
//        Reverse(str,i-1);
//
//    }
//
//    public static void main(String[] args)
//    {
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter string");
//        String str1= sc.next();
//        Reverse(str1,str1.length()-1);
//
//    }


    //Find 1st and last occurrence of an element in string  aabbaacdefgajahaa

//    public static int First= -1;
//    public static int last= -2;
//
//
//    public static void Occur(String str,int index,char element)
//    {
//        if (index==str.length())
//        {
//            System.out.println(First);
//            System.out.println(last);
//            return;
//        }
//
//       char currentChar = str.charAt(index);
//       if (currentChar==element)
//       {
//           if (First==-1)
//           {
//               First=index;
//           }
//           else {
//               last=index;
//           }
//       }
//
//       Occur(str,index+1,element);
//
//    }
//    public static void main(String[] args)
//    {
//        String str= "aabbaacdefgajahaa";
//        Occur(str,0,'a');
//
//    }


    // find out the array is sorted (Strictly increasing)
   // {1,2,3,4,5}

//    public static boolean isSorted(int arr[],int inx)
//    {
//
//        if (inx== arr.length-1)
//        {
//            return true;
//        }
//        if (arr[inx]<arr[inx+1])
//        {
//            return  isSorted(arr,inx+1);
//        }
//        else
//        {
//            return false;
//        }
//
//    }
//
//
//
//    public static void main(String[] args)
//    {
//
//        int arr[]={1,2,3,4,4};
//        System.out.println(isSorted(arr,0));
//
//    }


    //Move all 'x' to the end of the string


//    public static void moveAll(String str,int inx, int count, String newStr)
//    {
//        if (inx==str.length())
//        {
//            for (int i=0;i<=count;i++)
//            {
//                newStr+='x';
//            }
//            System.out.println(newStr);
//            return;
//        }
//
//        char currChar=(str.charAt(inx));
//        if (currChar== 'x'){
//            count++;
//            moveAll(str,inx+1,count,newStr);
//        }
//        else
//        {
//            newStr+=currChar;
//            moveAll(str,inx+1,count,newStr);
//        }
//
//    }
//
//    public static void main(String[] args)
//    {
//
//        String str="axbxnhxxd";
//        moveAll(str,0,0,"");
//    }


    //Remove the duplicates from string


//    public static boolean map[]=new boolean[26];
//
//    public static void RemoveDuplicate(String str, int inx,String newStr)
//    {
//
//        if (inx==str.length())
//        {
//            System.out.println(newStr);
//            return;
//        }
//
//        char currChar= str.charAt(inx);
//        if (map[currChar-'a'])
//        {
//            RemoveDuplicate(str,inx+1,newStr);
//        }
//        else
//        {
//            newStr+=currChar;
//            map[currChar-'a']=true;
//            RemoveDuplicate(str,inx+1,newStr);
//
//        }
//    }
//
//
//
//    public static void main(String[] args)
//    {
//
//        String str="aabbccddeefghiijj";
//        RemoveDuplicate(str,0,"");
//
//    }


    //Print all the subsequences of the string


//    public static void Subsequences(String str,int inx, String newStr)
//    {
//
//        if (inx==str.length())
//        {
//            System.out.println(newStr);
//            return;
//        }
//        char currChar=str.charAt(inx);
//        //to be
//        Subsequences(str,inx+1,newStr+currChar);
//        //not to be
//        Subsequences(str,inx+1,newStr);
//
//
//    }
//    public static void main(String[] args)
//    {
//
//        String str="aaa";
//        Subsequences(str,0,"");
//
//    }


    //print keypad combination


//    public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
//
//    public static void printComb(String str,int inx,String combination)
//    {
//
//        char currentChar=(str.charAt(inx));
//        String mapping=keypad[currentChar-0];
//
//        for(int i=0;i<mapping.length();i++)
//        {
//
//        }
//
//
//    }
//
//    public static void main(String[] args)
//    {
//
//
//
//
//    }



    //print all permutations of string  "abc"

    public static void PrintPermutation(String str,String permut)
    {

        if (str.length()==0)
        {
            System.out.println(permut);
            return;
        }
        for (int i=0;i<str.length();i++)
        {
            char currChar= str.charAt(i);
            String newStr= str.substring(0,i)+str.substring(i+1);
            PrintPermutation(newStr,permut+currChar);

        }
    }

    public static void main(String[] args)
    {
        String str="abc";
        PrintPermutation(str,"");

    }






}
