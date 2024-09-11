package ProjectMultiThreading;

public class ConsumerThread extends Thread{

    Company c;
    ConsumerThread(Company c)
    {
        this.c=c;
    }
    @Override
    public void run() {

        while (true)
        {
            try
            {
                this.c.consumer();
                Thread.sleep(1000);

            }catch (Exception ignored)
            {

            }
        }
    }
}
