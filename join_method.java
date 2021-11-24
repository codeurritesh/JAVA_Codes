 public class join_method {
    public static void main(String[] args) {
tanyaa r=new tanyaa();
Thread t1=new Thread(r);
t1.start();
tanu r1=new tanu();
Thread t2=new Thread(r1);
t2.start();

    }

}
class tanyaa implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=20;i++)
        {
            if(i%2==1)
            {
                System.out.println(i);
            }
        }}}
class tanu implements Runnable{
    @Override
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }}
    }

