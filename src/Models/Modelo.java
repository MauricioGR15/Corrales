package Models;

import Support.Routines;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo {

    private Statement conection;
    private String query;
    private Routines rut = new Routines();
    private String [] localizaciones = {"Culiacán","Mazatlán","Los Mochis"};

    public Modelo(Statement con){
        conection = con;
    }


    //PROCEDIMIENTOS ALMACENADOS PARA INSERTAR

    public void sp_insertCorrales(int noCorral, short type, int capacity) throws SQLException {
        query = "exec InsertCorrales @no ="+noCorral+", @capacidad ="+capacity+", @tipo ="+type;
        conection.execute(query);
    }

    public void sp_insertCrias(int noCria, char health, String date, int noCorral, String dieta) throws  SQLException{
        query ="exec InsertCrias @id ="+noCria+", @salud='"+health+"', @fechaL = '"+date+"' , @corralNo ="+noCorral+", @dietaID = '"+dieta+"'";
        conection.execute(query);
    }

    public void insertCrias(int noCria, char health, String date,int noCorral, String dieta) throws  SQLException{
        query = "insert into crias (cria_id,cria_salud,cria_fechaL,corral_no,dieta_id) values (";
        String cad2 = query + noCria + ",'"+health+"','"+date+"',"+noCorral+",'"+dieta+"')";
        conection.execute(cad2);

    }

    public void sp_insertClasificacion(int noCria, short peso, String colorM, short cantG, short grasaC) throws SQLException {
        query ="exec InsertClasificaciones @criaId ="+noCria+", @peso = '"+peso+"', @cantGrasa ="+cantG+", @colorMusc = '"+ colorM+ "' ,@grasCobertura ="+grasaC;
        conection.execute(query);
    }

    public void sp_insertMovimientos(int idCria, int noCorral, String fechaE) throws SQLException {
        query = "exec insertMovimientos @idCria =" +idCria+", @corralNo =" +noCorral+ ", @fechaE = '" +fechaE+"'";
        conection.execute(query);
    }

    public void sp_insertSensor() throws SQLException {
        query = "exec insertSensores @pulso =" + rut.nextInt(60,120) + ", @localizacion ='" + localizaciones[rut.nextInt(2,0)] + "'";
        conection.execute(query);
    }

    //CONSULTAS CON PARAMETROS

    public ResultSet sp_select_criaClasificada(int idCria) throws SQLException {
        query = "exec select_CriaClas @idCria = " + idCria;
        return conection.executeQuery(query);
    }

    public ResultSet sp_selectCria(int idCria) throws SQLException {
        query ="exec select_Cria @idCria = " + idCria;
        return conection.executeQuery(query);
    }

    public ResultSet sp_selectCriasClasificadas(int idCria) throws  SQLException{
        query = "exec select_CriaClasificada @idCria = " + idCria;
        return conection.executeQuery(query);
    }

    public ResultSet sp_select_noCorral(int idCorral) throws  SQLException{
        query ="select corral_tipo from corrales where corral_no =" +idCorral;
        return conection.executeQuery(query);
    }

    //CONSULTAS

    public ResultSet sp_selectCriasEnfermas() throws SQLException{
        query = "select * from CriasEnfermas";
        return conection.executeQuery(query);
    }

    public ResultSet select_dietas() throws SQLException {
        query = "select dieta_id from dietas";
        return conection.executeQuery(query);
    }

    //UPDATES

    public void sp_updateCriasFechaS(int idCria, String fechaS) throws SQLException {
        query = "exec update_CriasFechaS @idCria =" + idCria + ", @fechaS='"+fechaS+"'";
        conection.execute(query);
    }

   //VISTAS

    public ResultSet select_CriasNoClasificadas() throws SQLException {
        query = "select cria_id from dbo.CriasNoClas";
        return conection.executeQuery(query);
    }

    public ResultSet select_VistaCrias() throws  SQLException{
        query = "select * from dbo.VistaCrias order by cria_fechaS";
        return conection.executeQuery(query);
    }

    public ResultSet selectVistaCriasClasificadasSinProcesar() throws SQLException {
        query = "select * from VistaCriasClasSinProcesar";
        return conection.executeQuery(query);
    }


}
