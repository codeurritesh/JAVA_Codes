class multithreading_print implements Runnable {
    public static Thread t1;


    public static void main(String[] args) {
        t1 = new Thread(new multithreading_print());
        t1.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            if (i == 6) {
                try {
                    t1.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
            System.out.println(i);
        }
    }
}

