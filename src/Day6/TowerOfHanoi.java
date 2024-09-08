package Day6;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void TowerOfHan(int n,String source,String Helper,String Destination)
    {
        if (n==1)
        {
            System.out.println("Transfer disk"+ n +" from "+ source +" to "+ Destination);
            return;
        }

        TowerOfHan(n-1,source,Destination,Helper);
        System.out.println("Transfer disk"+ n +" from "+ source +" to " + Destination);
        TowerOfHan(n-1,Helper,source,Destination);

    }

    public static void main(String[] args)
    {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of disk");
        int d=sc.nextInt();
        TowerOfHan(d,"S","H","D");

    }
    
}
