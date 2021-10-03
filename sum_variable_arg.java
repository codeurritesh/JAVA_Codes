
class sum_variable_arg {
    public void sum(int... a) {
        System.out.println("The Sum of "+a.length + " args:");
        int s=0;
        for (int i : a) {
            s=s+i;

        }
        System.out.println("Sum= "+ s);


    }

}
class testMain{
public static void main(String[] args) {
    sum_variable_arg obj=new sum_variable_arg();

     obj.sum(1000);
     obj.sum(2,3,4,5);
     obj.sum(100,2000);

    }}
