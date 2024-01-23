package Bank.Management;
import  java.sql.*;

public class Connect {
    Connection c;
    Connect(){
        try{
            Class.forName(com.mysql.cj.jdbc.Driver);
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","keyboardmouse");
        }
        catch (Exception e) {
            System.out.println(e);
        }


    }

    public static void main(String[] args) {
        new Connect();
    }


}
