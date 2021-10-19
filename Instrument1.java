package music ;
class guitar extends Instrument{
    @Override
    public void play() {
        System.out.println("tin tin tin");

    }
}
class piano extends Instrument{
    @Override
    public void play() {
        System.out.println("tun tun tun ");

    }
}
class flute extends Instrument{
    @Override
    public void play() {
        System.out.println("toot toot toot");

    }
}
public class Instrument1{
    public static void main(String[] args) {
        Instrument arr[]=new Instrument[10];
        arr[0]=new piano();
        arr[1]=new guitar();
        arr[2]=new flute();
        arr[3]=new piano();
        arr[4]=new guitar();
        arr[5]=new flute();
        arr[6]=new piano();
        arr[7]=new guitar();
        arr[8]=new flute();
        arr[9]=new piano();

       for(int i=0;i< arr.length;i++)
       {
           if(arr[i] instanceof piano)
           {
               System.out.println("yes it is a piano");
               arr[i].play();
           }
           if(arr[i] instanceof guitar)
           {
               System.out.println("yes it is a guitar");
               arr[i].play();
           }
           if(arr[i] instanceof flute)
           {
               System.out.println("yes it is a flute");
               arr[i].play();
           }
       }



    }


}



