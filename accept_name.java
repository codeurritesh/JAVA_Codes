import com.mysql.cj.jdbc.exceptions.MySQLStatementCancelledException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class accept_name {


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            //String s="bbbbrrrrrrrbbbbbreyueyrbbbbbb";
            String s="99  897  *&ab";
            Pattern p=Pattern.compile("\\W");
            ///Pattern p1=Pattern.compile("abc",Pattern)
            Matcher m=p.matcher(s);
            int count=0;
            while(m.find())
            {
                count++;
                System.out.println(m.start()+"     "+m.end()+"     "+m.group());

            }
            System.out.println(count);

        }
    }


