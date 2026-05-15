package interfaz;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCalculos extends JPanel{
	
	private JButton btnEdad;
	private JButton btnAntiguedad;
	private JButton btnPrestaciones;
	private JTextField edad;
	private JTextField antiguedad;
	private JTextField prestaciones;

	public PanelCalculos() {
		FlowLayout fl= new FlowLayout();
		setLayout(fl);
		
		JPanel auxLayout= new JPanel(new GridLayout(3,2));
		
		btnAntiguedad= new JButton("Calcular Antiguedad");
		btnEdad= new JButton("Calcular Edad");
		btnPrestaciones=new JButton("Calcular Prestaciones");
		edad= new JTextField();
		antiguedad= new JTextField();
		prestaciones= new JTextField();
		
		auxLayout.add(btnEdad);
		auxLayout.add(edad);
		auxLayout.add(btnAntiguedad);
		auxLayout.add(antiguedad);
		auxLayout.add(btnPrestaciones);
		auxLayout.add(prestaciones);
		
		
		add(auxLayout);
		setBorder(BorderFactory.createTitledBorder("Cálculos"));
	}
	
}
