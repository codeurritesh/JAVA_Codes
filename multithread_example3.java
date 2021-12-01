public class multithread_example3 extends  Thread {
    public void run()
    {
        System.out.println(10/0);
        for(int i=0;i<=5;i++)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        multithread_example3 t1=new multithread_example3();
        t1.start();
        t1.setName("NEW");
        for(int i=10;i<=15;i++)
        {
            System.out.println(i);
        }
    }
}
