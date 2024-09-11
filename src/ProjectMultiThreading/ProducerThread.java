package ProjectMultiThreading;

public class ProducerThread extends Thread{

    Company c;
    ProducerThread(Company c)
    {
        this.c=c;
    }
    @Override
    public void run() {
        int i=1;
        while (true)
        {
            try {
                this.c.producer(i);
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            i++;

        }
    }
}
