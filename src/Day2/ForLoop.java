package Day2;

public class ForLoop {

    public static void main(String[] args)
    {

        //print 1 to 10 numbers
//        for (int i=1;i<=10;i++)
//        {
//            System.out.println(i);
//        }

        //print 10 to 1 numbers

//        for(int i=10;i>=1;i--)
//        {
//            System.out.println(i);
//        }

        //print even numbers between, 1 to 10

//        for (int i=2;i<=10;i+=2)
//        {
//            System.out.println(i);
//        }
//
        //print odd numbers between, 1 to 100

//        for(int o=1;o<=99;o+=2)
//        {
//            System.out.println(o);
//        }

        //print even and odd numbers between, 1 to 10 along with message.

        for (int i=1;i<=10;i++)
        {
            if (i%2==0)
            {
                System.out.println(i+" Even Number");
            }
            else {
                System.out.println(i+ " Odd Number");
            }
        }

    }
}
