package ProjectMultiThreading;

public class Company {

    int n;
    boolean f=false;
    synchronized public void producer(int n) throws Exception {
        if (f)
        {
            wait();
        }
        this.n=n;
        System.out.println("produced "+this.n);
        f=true;
        notify();
    }

   synchronized public int consumer()  {
        if (!f)
        {
            try {
                wait();
            }catch (Exception ignored)
            {

            }
        }
        System.out.println("consumed "+this.n);
        f=false;
        notify();
        return this.n;
   }

}
