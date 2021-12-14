import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class First_jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/youtube";
        String username="root";
        String password="";
        Connection con= DriverManager.getConnection(url,username,password);
        if(con.isClosed())
        {
            System.out.println("connection is closed");
        }
        else
        {
            System.out.println("not closed");
        }
    }
}
