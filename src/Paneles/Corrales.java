package Paneles;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;


public class Corrales extends JPanel{
	
	private static final long serialVersionUID = 1L;



	private JTextField TF_corralNo;
	public JTextField getTF_corralNo() {
		return TF_corralNo;
	}

	public void setTF_corralNo(JTextField tF_corralNo) {
		TF_corralNo = tF_corralNo;
	}

	public JTextField getTF_corralTipo() {
		return TF_corralTipo;
	}

	public void setTF_corralTipo(JTextField tF_corralTipo) {
		TF_corralTipo = tF_corralTipo;
	}

	public JTextField getTF_Capacidad() {
		return TF_Capacidad;
	}

	public void setTF_Capacidad(JTextField tF_Capacidad) {
		TF_Capacidad = tF_Capacidad;
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	private JTextField TF_corralTipo;
	private JTextField TF_Capacidad;
	private JButton btnAgregar;
	private JLabel lblTipoDeCorrales;
	private JLabel lblCapacidad;

	/**
	 * Create the panel.
	 */
	public Corrales() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 108, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{41, 0, 0, 0, 41, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNumeroDeCorral = new JLabel("Numero de Corral:");
		GridBagConstraints gbc_lblNumeroDeCorral = new GridBagConstraints();
		gbc_lblNumeroDeCorral.anchor = GridBagConstraints.EAST;
		gbc_lblNumeroDeCorral.fill = GridBagConstraints.VERTICAL;
		gbc_lblNumeroDeCorral.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumeroDeCorral.gridx = 2;
		gbc_lblNumeroDeCorral.gridy = 1;
		add(lblNumeroDeCorral, gbc_lblNumeroDeCorral);
		
		TF_corralNo = new JTextField(20);
		GridBagConstraints gbc_TF_corralNo = new GridBagConstraints();
		gbc_TF_corralNo.anchor = GridBagConstraints.WEST;
		gbc_TF_corralNo.fill = GridBagConstraints.VERTICAL;
		gbc_TF_corralNo.insets = new Insets(0, 0, 5, 0);
		gbc_TF_corralNo.gridx = 3;
		gbc_TF_corralNo.gridy = 1;
		add(TF_corralNo, gbc_TF_corralNo);
		TF_corralNo.setColumns(10);
		
		JLabel lblTipoDeCorral = new JLabel("Tipo de Corral:");
		GridBagConstraints gbc_lblTipoDeCorral = new GridBagConstraints();
		gbc_lblTipoDeCorral.anchor = GridBagConstraints.EAST;
		gbc_lblTipoDeCorral.fill = GridBagConstraints.VERTICAL;
		gbc_lblTipoDeCorral.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoDeCorral.gridx = 2;
		gbc_lblTipoDeCorral.gridy = 2;
		add(lblTipoDeCorral, gbc_lblTipoDeCorral);
		
		TF_corralTipo = new JTextField(20);
		GridBagConstraints gbc_TF_corralTipo = new GridBagConstraints();
		gbc_TF_corralTipo.anchor = GridBagConstraints.WEST;
		gbc_TF_corralTipo.fill = GridBagConstraints.VERTICAL;
		gbc_TF_corralTipo.insets = new Insets(0, 0, 5, 0);
		gbc_TF_corralTipo.gridx = 3;
		gbc_TF_corralTipo.gridy = 2;
		add(TF_corralTipo, gbc_TF_corralTipo);
		TF_corralTipo.setColumns(10);
		
		lblCapacidad = new JLabel("Capacidad:");
		GridBagConstraints gbc_lblCapacidad = new GridBagConstraints();
		gbc_lblCapacidad.anchor = GridBagConstraints.EAST;
		gbc_lblCapacidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCapacidad.gridx = 2;
		gbc_lblCapacidad.gridy = 3;
		add(lblCapacidad, gbc_lblCapacidad);
		
		TF_Capacidad = new JTextField();
		GridBagConstraints gbc_TF_Capacidad = new GridBagConstraints();
		gbc_TF_Capacidad.anchor = GridBagConstraints.WEST;
		gbc_TF_Capacidad.insets = new Insets(0, 0, 5, 0);
		gbc_TF_Capacidad.gridx = 3;
		gbc_TF_Capacidad.gridy = 3;
		add(TF_Capacidad, gbc_TF_Capacidad);
		TF_Capacidad.setColumns(10);
		
		lblTipoDeCorrales = new JLabel("Tipo de corrales : 0 > Saludables, 1 > No saludables");
		GridBagConstraints gbc_lblTipoDeCorrales = new GridBagConstraints();
		gbc_lblTipoDeCorrales.gridwidth = 2;
		gbc_lblTipoDeCorrales.fill = GridBagConstraints.BOTH;
		gbc_lblTipoDeCorrales.insets = new Insets(0, 0, 5, 0);
		gbc_lblTipoDeCorrales.gridx = 2;
		gbc_lblTipoDeCorrales.gridy = 4;
		add(lblTipoDeCorrales, gbc_lblTipoDeCorrales);
		
		btnAgregar = new JButton("Agregar");
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.gridwidth = 2;
		gbc_btnAgregar.fill = GridBagConstraints.BOTH;
		gbc_btnAgregar.gridx = 2;
		gbc_btnAgregar.gridy = 5;
		add(btnAgregar, gbc_btnAgregar);

	}

}
