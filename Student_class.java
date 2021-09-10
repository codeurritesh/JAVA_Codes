import java.util.Scanner;
public class student_class {
    public String name;
    public String naam;
    public String ss;

    public student_class() {
        naam = "unknown";
    }
    public student_class(String ss)
    {
        name=ss;
}
}
    class student_classMain
    {
        public static void main(String[] args) {
            student_class obj=new student_class();
            Scanner s= new Scanner(System.in);
            obj. name=s.nextLine();
            student_class obj1 =new student_class(obj.name);
            System.out.println(obj.name);
            System.out.println(obj.naam);



            //System.out.println(obj.name);


        }
    }
