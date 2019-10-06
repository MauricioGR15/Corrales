import Controllers.*;
import Models.Conexion;
import Models.Modelo;
import Views.*;
import javax.swing.*;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
//		
		Statement conexion = Conexion.getConexion("MGR","CorralesV2","1433","sa","sa");

		VistaPrincipal principal = new VistaPrincipal();

		Modelo model = new Modelo(conexion);

		viewCrias crias = new viewCrias();
		CriasController conCrias = new CriasController(crias,model);

		viewCorrales corrales = new viewCorrales();
		CorralController conCorrales = new CorralController(corrales,model);
//		
//
		if(conexion == null) {
			JOptionPane.showMessageDialog(null, "conexion no realizada","*********", JOptionPane.ERROR_MESSAGE);
			return;
		}
//		
//		int id = 1;
//		String cad = "insert into productos values ('xdxd123','normal',15.50)";
		
//		JOptionPane.showMessageDialog(null, "Se realizo la conexion");
//		conexion.execute(cad);
//		Conexion.closeConexion();
	}

}
