import java.util.*;
class tall_boy {
    String name;
    int height;


}
class tall_boymain {
    public static void main(String[] args) {
        int maxh=0;
        String nm="";

        Scanner s = new Scanner(System.in);
        tall_boy arr[] = new tall_boy[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = new tall_boy();
        }
        for (int i = 0; i < 3; i++) {
            arr[i].name = s.next();
            arr[i].height = s.nextInt();

        }
        for (int i = 0; i <3; i++) {

            if((arr[i].height)>maxh)
            {
                maxh=arr[i].height;
                 nm=arr[i].name;
        }}

        System.out.println("Max height="+ maxh);
        System.out.println("name="+nm);
    }
}
