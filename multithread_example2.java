public class multithread_example2 extends Thread {
    public  void run()
    {
        for (int i=0;i<=50;i++)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        multithread_example2 t1=new multithread_example2();
        t1.start();
        for(int i=100;i<150;i++)
            System.out.println(i);
    }
}
