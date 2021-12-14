import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class Prepared_statement {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/youtube_1";
            String username="root";
            String password="";
            Connection con= DriverManager.getConnection(url,username,password);
            //create a query
            String q="insert into table1(name,id) values(?,?)";
//get the prepared statement obj
            PreparedStatement ps=con.prepareStatement(q);

            //setting values
            ps.setString(1,"ritesh verma");
            ps.setInt(2,201500573);


            ps.executeUpdate();
            System.out.println("Inserted");
            con.close();





        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }




}
