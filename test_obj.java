public class test_obj {
   static int noofobj = 0;

    {
        noofobj += 1;
    }

    public test_obj() {
    }

    public test_obj(int n) {

    }

    public test_obj(String s) {

    }




    public static void main(String[] args) {
        test_obj t1=new test_obj();
        test_obj t2=new test_obj(5);
        test_obj t3=new test_obj("ritesh");
        System.out.println(noofobj);
    }}
