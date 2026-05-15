package interfaz;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelOpciones extends JPanel{

	private JButton btnEmpleado;
	private JButton opcion1;
	private JButton opcion2;
	
	public PanelOpciones() {
		setLayout(new GridLayout(1,3,5,5));
		
		btnEmpleado= new JButton("Cambiar Empleado");
		opcion1= new JButton("Opcion 1");
		opcion2= new JButton("Opcion 2");
		
		add(btnEmpleado);
		add(opcion1);
		add(opcion2);
		setBorder(
			    BorderFactory.createCompoundBorder(
			        BorderFactory.createEmptyBorder(5,195,5,195),
			        BorderFactory.createTitledBorder("Opciones")));
	}
}
