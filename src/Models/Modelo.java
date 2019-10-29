package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo {

    private Statement conection;
    private String cad;
    private ResultSet rs;
    private PreparedStatement ps;

    public Modelo(Statement con){
        conection = con;
    }

    public void sp_corrales(int noCorral, short type, int capacity) throws SQLException {
        cad = "exec InsertCorrales @no ="+noCorral+", @capacidad ="+capacity+", @tipo ="+type;
        conection.execute(cad);
    }

    public void sp_crias(int noCria, char health, String date,int noCorral, String dieta) throws  SQLException{
        cad ="exec InsertCrias @id ="+noCria+", @salud='"+health+"', @fechaL = '"+date+"' , @corralNo ="+noCorral+", @dietaID = '"+dieta+"'";
        conection.execute(cad);
    }

    public void insertCrias(int noCria, char health, String date,int noCorral, String dieta) throws  SQLException{
        cad = "insert into crias (cria_id,cria_salud,cria_fechaL,corral_no,dieta_id) values (";
        String cad2 = cad + noCria + ",'"+health+"','"+date+"',"+noCorral+",'"+dieta+"')";
        conection.execute(cad2);

    }

    public void sp_clasificacion(int noCria, short peso, String colorM, short cantG, short grasaC) throws SQLException {
        cad ="exec InsertClasificaciones @criaId ="+noCria+", @peso = '"+peso+"', @cantGrasa ="+cantG+", @colorMusc = '"+ colorM+ "' ,@grasCobertura ="+grasaC;
        conection.execute(cad);
    }

    public void sp_select_noCorral() throws  SQLException{
        cad ="exec Select_noCorral";
        conection.execute(cad);
    }

    public ResultSet sp_selectCria(int idCria) throws SQLException {
        cad ="exec select_Cria @idCria = " + idCria;
        rs = conection.executeQuery(cad);
        return rs;
    }

    public Statement getConection() {
        return conection;
    }


}
