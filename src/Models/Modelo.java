package Models;

import java.sql.SQLException;
import java.sql.Statement;

public class Modelo {



    private Statement conection;
    String cad;

    public Modelo(Statement con){
        conection = con;

    }

    public void sp_corrales(int noCorral, short type, int capacity) throws SQLException {
        cad = "exec InsertCorrales @no ="+noCorral+", @capacidad ="+capacity+", @tipo ="+type;
        conection.execute(cad);
    }

    public void sp_crias(int noCria, short health, int date, int noCorral, String dieta) throws  SQLException{
        cad ="exec InsertCrias @id ="+noCria+", @salud='"+health+"', @fechaL = "+date+", @corralNo ="+noCorral+", @dietaID ="+dieta;
        conection.execute(cad);
    }

    public void sp_clasificacion(int noCria, short peso, String colorM, short cantG, short grasaC) throws SQLException {
        cad ="exec InsertClas @id ="+noCria+", @peso = '"+colorM+"', @cantGrasa ="+cantG+", @grasaCobertura ="+grasaC;
        conection.execute(cad);
    }

    public void sp_select_noCorral() throws  SQLException{
        cad ="exec Select_noCorral";
        conection.execute(cad);
    }

    public Statement getConection() {
        return conection;
    }

}
