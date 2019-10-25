/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sai more
 */

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;  
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbService 
{
    private static String servername="localhost";
    private static String username="root";
    private static String dbname="students";
    private static Integer portnumber=3306;
    private static String password="";
    
    public static Connection getConnection()
    {
        Connection cnx=null;
        MysqlDataSource datasource= new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        datasource.setServerName(servername);
        try {
            cnx=datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("GetConnection ->"+DbService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return cnx;
    }
    
    
   /* public static void main(String[] arge)
    {
        try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1234");  
//here sonoo is database name, root is username and password  
Statement stmt=con.prepareStatement("insert into std values(1,2)");  
ResultSet rs=stmt.executeQuery("select * from std");  
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getInt(2));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
        //return con;
}  */
    
}
