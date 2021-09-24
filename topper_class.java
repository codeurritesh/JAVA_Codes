import java.util.Scanner;

public class topper_class {
    String name,n2,n3;
    int percent,p2,p3;
     topper_class(String n,int p)
     {
         name=n;
         percent=p;
     }
     topper_class()
     {
         super();
     }
     void take()
     {
         Scanner s= new Scanner(System.in);
         name=s.nextLine();
         n2=s.nextLine();
         n3=s.nextLine();
         percent=s.nextInt();
         p2=s.nextInt();
         p3=s.nextInt();
     }
    int top()
    {
        if(percent>p2 && percent>p3) {
            return percent;
        }
        else if(p2>percent && p2>p3)
        {
            return p2;
        }
        else
        {
            return p3;
        }
    }
}
class topper_classMain{

    public static void main(String[] args) {
        topper_class obj1 = new topper_class();
        Scanner s= new Scanner(System.in);
       obj1.take();
        System.out.println(obj1.name);
        System.out.println(obj1.n2);
        System.out.println(obj1.n3);
        System.out.println(obj1.percent);
        System.out.println(obj1.p2);
        System.out.println(obj1.p3);
        int c=obj1.top();
        System.out.println("the topper % is"+ c);



    }
}
