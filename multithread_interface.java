public class multithread_interface implements Runnable{
    public  void run()
    {
        System.out.println("THREAD");
    }

    public static void main(String[] args) {
        multithread_interface t1=new multithread_interface();
        Thread obj= new Thread(t1);
        obj.start();
        for(int i=0;i<=15;i++)

        {
            System.out.println(i);
        }
    }
}
