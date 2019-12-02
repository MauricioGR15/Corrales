package App;

import Controllers.*;
import Models.Conexion;
import Models.Modelo;
import Views.MainFrame;
import Views.viewPrincipal;

import javax.swing.*;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) throws SQLException{

		Statement conexion = Conexion.getConexion("MGR","CorralesV2","1433","sa","sa");

//		VistaPrincipal principal = new VistaPrincipal();


		MainFrame main = new MainFrame();	//Frame principal
		viewPrincipal viewPrincipal = new viewPrincipal(main);	//Panel with the main menu
		main.add(viewPrincipal);
		main.setVisible(true);
		Modelo model = new Modelo(conexion);

		PrincipalController conPrin = new PrincipalController(viewPrincipal);
		CriasController conCrias = new CriasController(viewPrincipal.getCrias(),model);
		CorralController conCorrales = new CorralController(viewPrincipal.getCorrales(),model);
		ClasController conClasificaciones = new ClasController(viewPrincipal.getClas(),model);
		ProcesarController conProcesar = new ProcesarController(viewPrincipal.getProcesar(),model);
		EnfermasController conEnfermas = new EnfermasController(viewPrincipal.getEnfermas(),model);
		CuarController conTratamientos = new CuarController(viewPrincipal.getCuarentenas(),model);
		InformeController conInforme = new InformeController(viewPrincipal.getInforme(),model);



		if(conexion == null) {
			JOptionPane.showMessageDialog(null, "conexion no realizada","*********", JOptionPane.ERROR_MESSAGE);
			return;
		}
	}

}
