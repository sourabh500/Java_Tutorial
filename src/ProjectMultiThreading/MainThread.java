package ProjectMultiThreading;

public class MainThread {

    public static void main(String[] args)
    {
        Company c=new Company();
        ProducerThread pt=new ProducerThread(c);
        ConsumerThread ct=new ConsumerThread(c);

        pt.start();
        ct.start();
    }
}
