import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///project2","root","new_password");    
            s =c.createStatement();  
        
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    } 
    public static void main(String args[])
    {
        new conn();
        System.out.println("Database Connected");
    }  
}  
