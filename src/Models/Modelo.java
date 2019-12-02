package Models;

import Support.Rut;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo {

    private Statement conection;
    private String query;
    private Rut rut;
    private String [] localizaciones;

    public Modelo(Statement con){
        conection = con;
        rut = new Rut();
        localizaciones = new String[]{"'Culiacán'","'Mazatlán'","'Los Mochis'"};
    }

    //PROCEDIMIENTOS ALMACENADOS PARA INSERTAR

    public ResultSet pa_insertCorrales(int noCorral, boolean type) throws SQLException {
        query = "exec pa_InsertCorrales "+noCorral+","+type;
        return conection.executeQuery(query);
    }

    public ResultSet pa_insertCrias(int noCria, String date, boolean health, int noCorral, String dieta) throws  SQLException{
        query ="exec pa_InsertCria "+noCria+", '"+date+"',"+health+" ,"+noCorral+", '"+dieta+"'";
        return conection.executeQuery(query);
    }


    public ResultSet pa_insertClasificaciones(int noCria, short peso, String colorM, short cantG, short grasaC, int signoV) throws SQLException {
        query ="exec pa_InsertClasificaciones " + noCria +"," +peso+ ",'" +colorM+"'," + cantG +","+grasaC+
                "," + signoV + "," +
                localizaciones[rut.nextInt(2,0)] ;
        return conection.executeQuery(query);
    }

    public ResultSet pa_procesarCria(int idCria,String fechaS) throws SQLException {
        query ="exec pa_ProcesarCria " + idCria + ",'" + fechaS +"'";
        return conection.executeQuery(query);
    }

    public ResultSet pa_sacrificarCria(int idCria,String fechaS) throws SQLException {
        query ="exec pa_SacrificarCria " + idCria + ",'" + fechaS +"'";
        return conection.executeQuery(query);
    }

    public ResultSet pa_movimientosCorrales(int id, int corralNvo, boolean salud, String dietaNva, String fechaMov, String fechaEnfIni) throws SQLException {
        query = "exec pa_obtenerCodMensajes " +id+ "," +corralNvo+"," + salud + ",'" + dietaNva+"','" + fechaMov +"','"+fechaEnfIni+"'";
        return conection.executeQuery(query);
    }

    //CONSULTAS

    public ResultSet select_corrales() throws SQLException {
        query="select * from CORRALES";
        return conection.executeQuery(query);
    }

    public ResultSet select_corralesSanos() throws SQLException {
        query="select corral_no from view_corralSano";
        return conection.executeQuery(query);
    }

    public ResultSet select_corralesNoSanos() throws SQLException {
        query="select corral_no from view_corralNoSano";
        return conection.executeQuery(query);
    }

    //CONSULTAS CON PARAMETROS
    public ResultSet pa_selectCriaParaMover(int id) throws SQLException{
        query="select * from view_prepareData where cria_id = " +id ;
        return conection.executeQuery(query);
    }

    public ResultSet pa_selectCriaSinClas (int id) throws SQLException {
        query="exec pa_select_IdcriaSinClas " + id;
        return conection.executeQuery(query);
    }

    public ResultSet pa_selectCriasClasificadas(int idCria) throws  SQLException{
        query = "exec pa_select_CriaClasificada " + idCria;
        return conection.executeQuery(query);
    }

   //VISTAS
    public ResultSet select_infoGC2() throws  SQLException{
        query="select * from view_infoGrasaC2";
        return  conection.executeQuery(query);
    }

    public ResultSet select_informe() throws  SQLException{
        query="select * from view_informe";
        return conection.executeQuery(query);
    }

    public ResultSet select_diasEnfermas() throws SQLException {
        query="select * from view_diasEnfermas";
        return conection.executeQuery(query);
    }

    public ResultSet select_CriasSinClas(int idCria) throws SQLException{
        query = "select * from view_CriasSinClas where cria_id = " + idCria;
        return conection.executeQuery(query);
    }

    public ResultSet select_CriasNoClasificadas() throws SQLException {
        query = "select cria_id from view_CriasSinClas ";
        return conection.executeQuery(query);
    }

    public ResultSet select_dietasNormales() throws SQLException{
        query = "select dieta_id from dbo.view_dietasNormales";
        return conection.executeQuery(query);
    }

    public ResultSet select_dietasEspeciales() throws SQLException{
        query = "select dieta_id from dbo.view_dietasEspeciales";
        return conection.executeQuery(query);
    }

    public ResultSet select_VistaCrias() throws  SQLException{
        query = "select * from dbo.view_Crias order by cria_fechaL";
        return conection.executeQuery(query);
    }

    public ResultSet selectVistaCriasClasificadasSinProcesar() throws SQLException {
        query = "select * from view_CriasClasSinProcesar";
        return conection.executeQuery(query);
    }


}
