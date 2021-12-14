import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc1 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/youtube_1";
            String username="root";
            String password="";
            Connection con= DriverManager.getConnection(url,username,password);
            //create a query
            String q="create table table1(id int(20),name varchar(200))";
            //create a statement
            Statement st=con.createStatement();
            st.executeUpdate(q);
            System.out.println("table is created in database");
            con.close();}
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
