import java.awt.GridBagLayout;

import javax.swing.*;

import Paneles.*;

public class Vista extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTabbedPane pnlPrincipal;
	private JPanel pnlCrias, pnlTrat;
	private Corrales pnl_corrales;
	
	
	
	public Vista() {
		Interfaz();
		setVisible(true);
	}
	
	public void Interfaz() {
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		pnlPrincipal = new JTabbedPane();
		pnlCrias = new JPanel(new GridBagLayout());
		pnlTrat = new JPanel(new GridBagLayout());
		pnl_corrales = new Corrales();
		
		pnlPrincipal.add("Corrales",new Crias());
		pnlPrincipal.add("Crias", pnl_corrales);
		pnlPrincipal.add("Tratamiento",pnlTrat);
		
		add(pnlPrincipal);
	}
	
	public JPanel getPnlCorrales() {
		return pnl_corrales;
	}
	
}
