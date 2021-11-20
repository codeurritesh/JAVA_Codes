import java.util.Scanner;

class ageException extends RuntimeException {
    ageException(String obj)
    {
        super(obj);
    }
}
class age_error_msg{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        String b=s.next();
        try{
            if(a<=18 || a>=60)
            {
                throw new ageException("invalid age");
            }
            System.out.println("name:"+b+"age:"+a);
        }
        catch(ageException obj)
        {
            System.out.println(obj);
        }
    }
}
