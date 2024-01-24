package Bank.Management;
import  java.sql.*;

public class Connect {
    Connection c;
    Statement s;
    Connect(){
        try{
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","keyboardmouse");
            s=c.createStatement();
        }
        catch (Exception e) {
            System.out.println(e);
        }


    }




}
