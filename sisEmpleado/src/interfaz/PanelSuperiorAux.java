package interfaz;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelSuperiorAux extends JPanel{
	private JLabel encabezado;
	private PanelDatos panelDatos;
	
	public PanelSuperiorAux() {
		
		ImageIcon imagen= new ImageIcon("./data/Encabezado.png");
		encabezado = new JLabel(imagen);
		this.panelDatos= new PanelDatos();
		
		BorderLayout bl= new BorderLayout();
		setLayout(bl);
		
		add(encabezado,BorderLayout.NORTH);
		add(panelDatos,BorderLayout.CENTER);
		
	}
	
}
