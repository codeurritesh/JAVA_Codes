import p1.Class_room;
import java.util.Scanner;


public class Class_room_2 {


        public static void main(String[] args) {
            int sum=0;
            // t=0;
            Class_room obj= new Class_room();
            System.out.println("For AC-");
            Scanner s=new Scanner(System.in);
            obj.Ac=s.nextBoolean();
            System.out.println("For theatre-");
            obj.theatre=s.nextBoolean();
            System.out.println("For fan-");
            obj.fan=s.nextBoolean();
            System.out.println("For light-");
            obj.light=s.nextBoolean();
            obj.onandoff(obj.Ac, obj.theatre, obj.fan,obj.light,sum);




        }

    }
