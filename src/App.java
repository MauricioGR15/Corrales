import Vistas.VistaPrincipal;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

public class App {

	static VistaPrincipal view;
	static Modelo model;
	Conexion con;
	
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
//		
//		Statement conexion = Conexion.getConexion("MGR","Prueba","1433","UserSQL","sql");
		view = new VistaPrincipal();
		model = new Modelo();
		Controlador controller = new Controlador(view,model);
//		
//
//		if(conexion == null) {
//			JOptionPane.showMessageDialog(null, "conexion no realizada","*********", JOptionPane.ERROR_MESSAGE);
//			return;
//		}
//		
//		int id = 1;
//		String cad = "insert into productos values ('xdxd123','normal',15.50)";
		
//		JOptionPane.showMessageDialog(null, "Se realizo la conexion");
//		conexion.execute(cad);
//		Conexion.closeConexion();
	}

}
