package App;

import Controllers.CorralController;
import Controllers.CriasController;
import Models.Conexion;
import Models.Modelo;
import Views.VistaPrincipal;
import Views.viewCorrales;
import Views.viewCrias;
import javax.swing.*;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) throws SQLException{

		Statement conexion = Conexion.getConexion("MGR","CorralesV2","1433","sa","sa");

		VistaPrincipal principal = new VistaPrincipal();

		Modelo model = new Modelo(conexion);

		viewCrias crias = new viewCrias();
		CriasController conCrias = new CriasController(crias,model);

		viewCorrales corrales = new viewCorrales();
		CorralController conCorrales = new CorralController(corrales,model);

		if(conexion == null) {
			JOptionPane.showMessageDialog(null, "conexion no realizada","*********", JOptionPane.ERROR_MESSAGE);
			return;
		}

		
//		JOptionPane.showMessageDialog(null, "Se realizo la conexion");

//		Conexion.closeConexion();
	}

}
