package Day1;

public class CheckEvenOdd {


    public static void main(String[] args) {

        //Check the number is even or odd
        int a = 30;

        if (a % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }


        //Check the number is positive negative or zero

        int b = 0;

        if (b > 0) {
            System.out.println("Number is positive");
        } else if (b < 0) {
            System.out.println("Number is negative");

        } else
            System.out.println("Number is zero");


        //Find largest of three numbers

        int x = 10, y = 200, z = 100;
        if (x > y && y > z) {
            System.out.println("x is largest");
        } else if (y > x && y > z) {
            System.out.println("y is largest");
        } else if (z > x && z > y) {
            System.out.println("Z is largest");
        }

        //Print week name with week no

        int weekNo = 5;

        if (weekNo == 1) {
            System.out.println("Sunday");
        } else if (weekNo == 2) {
            System.out.println("Monday");
        } else if (weekNo == 3) {
            System.out.println("Tuesday");
        } else if (weekNo == 4) {
            System.out.println("Wednesday");
        } else if (weekNo == 5) {
            System.out.println("Thursday");
        } else if (weekNo == 6) {
            System.out.println("Friday");
        } else if (weekNo == 7) {
            System.out.println("Saturday");
        } else
            System.out.println("Invalid week number");



    //Largest of two numbers using ternary operator

    int num1 = 30, num2 = 20;
    String res = (num1 > num2) ? "num1 is largest" : "num2 is largest";
        System.out.println(res);

}

}
