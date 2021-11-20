import java.util.Objects;
import java.util.Scanner;

class InvalidCountryException extends RuntimeException {


    InvalidCountryException() {
        super();
    }

}

class Student_potal{
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            String a=s.next();
            String b= s.next();
registerUser(a,b);
        }
            public  static void registerUser(String username, String usercountry) {
                try {
                    if (!Objects.equals(usercountry, "India") )throw new InvalidCountryException();
                    System.out.println("resigtration done succesfully");
                } catch (InvalidCountryException obj) {
                    System.out.println("user outside india is not registered");
                }

            }
        }




