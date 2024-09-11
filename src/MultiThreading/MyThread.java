package MultiThreading;

public class MyThread implements Runnable{

    //First way to create thread by Runnable interface and override the method of Runnable.
    @Override
    public void run() {

        for (int i=0;i<=10;i++)
        {
            System.out.println("Thread 1 is running "+i);
        }
        try {
            Thread.sleep(1000);
        }catch (Exception e)
        {

        }
    }


    public static void main(String[] args)
    {

        //Creating object of MyThread class

        MyThread my=new MyThread();

        //Creating object of Thread class to start the thread

        Thread th=new Thread(my);

        //Starting MyThread
        th.start();

        //Creating object of another thread

        AnotherThread at=new AnotherThread();

        //Starting Another Thread, We don't want to create object of Thread
        //Because this time we have extends the class Thread and start()
        //method is already there.

        at.start();

    }
}
