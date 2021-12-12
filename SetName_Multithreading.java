class SetName_Multithreading extends Thread{
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        SetName_Multithreading t1=new SetName_Multithreading();
        SetName_Multithreading t2=new SetName_Multithreading();
        System.out.println("Name of t1:"+t1.getName());
        System.out.println("Name of t2:"+t2.getName());

        t1.start();
        t2.start();

        t1.setName("Sonoo Jaiswal");
        System.out.println("After changing name of t1:"+t1.getName());
    }
}