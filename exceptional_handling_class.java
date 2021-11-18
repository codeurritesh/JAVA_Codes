public class exceptional_handling_class {
    public static void main(String[] args) {
        int sum=0;
        for(String a:args)
        {
            try{
               sum+=Integer.parseInt(a);
        }
            catch(NumberFormatException e){
                System.out.println("Enter correct input in integer form!!");
            }
        }
        System.out.println("Sum ="+ sum);
    }
}
