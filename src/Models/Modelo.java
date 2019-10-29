package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo {

    private Statement conection;
    private String query;
    private ResultSet rs;
    private PreparedStatement ps;

    public Modelo(Statement con){
        conection = con;
    }

    public void sp_corrales(int noCorral, short type, int capacity) throws SQLException {
        query = "exec InsertCorrales @no ="+noCorral+", @capacidad ="+capacity+", @tipo ="+type;
        conection.execute(query);
    }

    public void sp_crias(int noCria, char health, String date,int noCorral, String dieta) throws  SQLException{
        query ="exec InsertCrias @id ="+noCria+", @salud='"+health+"', @fechaL = '"+date+"' , @corralNo ="+noCorral+", @dietaID = '"+dieta+"'";
        conection.execute(query);
    }

    public void insertCrias(int noCria, char health, String date,int noCorral, String dieta) throws  SQLException{
        query = "insert into crias (cria_id,cria_salud,cria_fechaL,corral_no,dieta_id) values (";
        String cad2 = query + noCria + ",'"+health+"','"+date+"',"+noCorral+",'"+dieta+"')";
        conection.execute(cad2);

    }

    public void sp_clasificacion(int noCria, short peso, String colorM, short cantG, short grasaC) throws SQLException {
        query ="exec InsertClasificaciones @criaId ="+noCria+", @peso = '"+peso+"', @cantGrasa ="+cantG+", @colorMusc = '"+ colorM+ "' ,@grasCobertura ="+grasaC;
        conection.execute(query);
    }

    public void sp_select_noCorral() throws  SQLException{
        query ="exec Select_noCorral";
        conection.execute(query);
    }

    public ResultSet sp_selectCria(int idCria) throws SQLException {
        query ="exec select_Cria @idCria = " + idCria;
        rs = conection.executeQuery(query);
        return rs;
    }

    public ResultSet sp_selectCriasClasificadas(int idCria) throws  SQLException{
        query = "exec select_CriaClasificada @idCria = " + idCria;
        rs = conection.executeQuery(query);
        return rs;
    }

    public ResultSet sp_selectCriasEnfermas() throws SQLException{
        query = "select * from CriasEnfermas";
        return conection.executeQuery(query);
    }

    public void sp_updateCriasFechaS(int idCria, String fechaS) throws SQLException {
        query = "exec update_CriasFechaS @idCria =" + idCria + ", @fechaS='"+fechaS+"'";
        conection.execute(query);
    }

    public Statement getConection() {
        return conection;
    }


}
