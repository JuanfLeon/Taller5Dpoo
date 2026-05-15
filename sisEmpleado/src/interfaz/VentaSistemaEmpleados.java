package interfaz;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VentaSistemaEmpleados extends JFrame{
	private PanelSuperiorAux panelSuperior;
	private PanelInferiorAux panelInferior;
	
	
	public VentaSistemaEmpleados() {
		this.panelSuperior = new PanelSuperiorAux();
		this.panelInferior = new PanelInferiorAux();
		
			BorderLayout bl= new BorderLayout();
			setLayout(bl);
			add(panelSuperior,BorderLayout.NORTH);
			add(panelInferior,BorderLayout.CENTER);
			
			
			setTitle("Sistema de un Empleado");
			setSize(getPreferredSize());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			setVisible(true);
	}
	
	
	public static void main(String[] args) {
		VentaSistemaEmpleados ventana= new VentaSistemaEmpleados();
		
	}
}
