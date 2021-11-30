import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Accept_phn {
    public static void main(String[] args) {
        String s="09876543218abc gla91876543218";
        Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
        ///Pattern p1=Pattern.compile("abc",Pattern)
        Matcher m=p.matcher(s);
        int count=0;
        while(m.find())
        {
            count++;
            System.out.println(m.start()+"     "+m.end()+"     "+m.group());

        }
        System.out.println(count);
        String s1="9876543210";
        System.out.println(s1.matches("(0|91)?[7-9][0-9]{9}"));
    }
}
