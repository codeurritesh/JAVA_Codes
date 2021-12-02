public class sleep_function2 extends Thread {
public void run()
{
    for(int i=0;i<=10;i++) {
        try {
            Thread.sleep(1000);
            System.out.print("5 ");
            Thread.sleep(1000);
            System.out.print("X ");
            Thread.sleep(1000);
            System.out.print(i);
            Thread.sleep(1000);
            System.out.print("=");
            Thread.sleep(1000);
            System.out.println(5*i);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
    public static void main(String[] args) {
        sleep_function2 t1= new sleep_function2();
        t1.start();
    }
}
