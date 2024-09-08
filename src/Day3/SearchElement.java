package Day3;

public class SearchElement {

    public static void main(String[] args)
    {
        int a[] = {10,20,30,40,50,60};
        int search_element= 30;

        boolean status=false;

        for (int x:a)
        {
            if (x==search_element)
            {
                System.out.println("Element found");
                status=true;
                break;
            }
        }
        if (!status)

        {
            System.out.println("Element not found");
        }



    }
}
