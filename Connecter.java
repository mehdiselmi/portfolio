package bill.print.using;


import java.sql.*;
public class Connecter {
    Connection conn;
    public  Connecter(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    
}catch(ClassNotFoundException e){
    System.err.println(e);
}
    try{
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sales","root","");
    }catch(SQLException ex){
        System.err.println(ex);
    }
 }
    Connection obtenirConnexion(){
        return conn;
    }

    PreparedStatement PreparedStatement(String select__from_product_where_id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
