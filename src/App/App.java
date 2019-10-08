package App;

import Controllers.CorralController;
import Controllers.CriasController;
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

		if(conexion == null) {
			JOptionPane.showMessageDialog(null, "conexion no realizada","*********", JOptionPane.ERROR_MESSAGE);
			return;
		}

		
//		JOptionPane.showMessageDialog(null, "Se realizo la conexion");

	}

}
