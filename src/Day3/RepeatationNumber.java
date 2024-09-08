package Day3;

public class RepeatationNumber {


    public static void main(String[] args)
    {
        int a[]={10,20,30,40,20,20,50,20,20,40,40,40,30,20,10,10,10,10,10,20,10};
        int repNo=40;
        int count=0;

        for (int x:a)
        {
            if (x==repNo)
            {
                count++;

            }
        }
        System.out.println(count);

    }
}
