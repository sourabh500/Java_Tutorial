package MultiThreading;


public class AnotherThread extends Thread{

    //Second way to creating Thread by extends Thread class


    @Override
    public void run() {
        for (int i=10;i>=0;i--)
        {
            System.out.println("Another thread is running "+i);
        }
        try {
            Thread.sleep(1000);
        }catch (Exception e)
        {

        }
    }

}
