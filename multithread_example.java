public class multithread_example extends Thread{
    public void run()
    {
        System.out.println("Thread is runnning");
    }

    public static void main(String[] args) {
        multithread_example t1=new multithread_example();
        t1.start();
        System.out.println("welcome");
    }


}

