public class sleep_function extends  Thread {
    public void run()
    {
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(1500);
                System.out.println(i);
            }

            catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        sleep_function t1=new sleep_function();
        t1.start();
        for(int i=10;i<15;i++)
        {
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }

    }
}
