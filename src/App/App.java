package App;

import Controllers.*;
import Models.Conexion;
import Models.Modelo;
import Views.VistaPrincipal;
import javax.swing.*;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) throws SQLException{

		Statement conexion = Conexion.getConexion("MGR","CorralesV2","1433","sa","sa");

		VistaPrincipal principal = new VistaPrincipal();

		Modelo model = new Modelo(conexion);

		CriasController conCrias = new CriasController(principal.getPnl_crias(),model);
		CorralController conCorrales = new CorralController(principal.getPnl_corrales(),model);
		ClasController conClasificaciones = new ClasController(principal.getPnl_clas(),model);
		ProcesarController conProcesar = new ProcesarController(principal.getPnl_procesar(),model);
		EnfermasController conEnfermas = new EnfermasController(principal.getPnl_enfermas(),model);
		CuarController conTratamientos = new CuarController(principal.getPnl_tratamientos(),model);

		if(conexion == null) {
			JOptionPane.showMessageDialog(null, "conexion no realizada","*********", JOptionPane.ERROR_MESSAGE);
			return;
		}
	}

}
