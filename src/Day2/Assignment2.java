package Day2;

public class Assignment2 {

    //Reverse a number

    public static void main(String[] args) {


        int i = 1234;
        int remainder1 = i % 10;
        int rev1 = remainder1;
        int num = i / 10;
        int remainder2 = num % 10;
        int rev2 = remainder2;
        int num2 = 123 / 10;
        int remainder3 = num2 % 10;
        int rev3 = remainder3;
        int num3= 12/10;
        int remainder4=num3;
        int rev4=remainder4;

        System.out.println(rev1+""+rev2+""+rev3+""+rev4);

    }


}
