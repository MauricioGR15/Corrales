package Models;


import java.sql.*;

public class Conexion {

    static private String url=null;
    static private Statement statement = null;
    static private Connection conn;

    private Conexion()  {
    }

    static synchronized public Statement getConexion(String hostname,String database,String puerto, String user,String password){
        if(statement==null){
            url= "jdbc:sqlserver://"+hostname+"\\SQLEXPRESS:"+puerto+";"
                    + "databaseName="+database+";user="+user+";password="+password+";";
            try {
                conn = DriverManager.getConnection(url);
                statement = conn.createStatement();
            } catch (SQLException e) {
                return null;
            }
        }
        return statement;
    }


    static synchronized public void closeConexion(){
        try {
            conn.close();
            statement.close();
        } catch(SQLException E){
        }
    }
}