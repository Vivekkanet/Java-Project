package bank.management.system;

import java.sql.*;


public class Conn {
    
    Connection con;
    Statement stmt;
    
    public Conn()
    {
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","vivek");
            stmt=con.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
