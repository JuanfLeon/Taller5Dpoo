package interfaz;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class PanelInferiorAux extends JPanel{
	private PanelCalculos panelCalculos;
	private PanelOpciones panelOpciones;
	
	public PanelInferiorAux() {

	    setLayout(new BorderLayout());

	    panelCalculos = new PanelCalculos();
	    panelOpciones = new PanelOpciones();

	    JPanel contenido = new JPanel();
	    contenido.setLayout(new BorderLayout());

	    contenido.add(panelCalculos, BorderLayout.NORTH);
	    contenido.add(panelOpciones, BorderLayout.CENTER);

	    add(contenido, BorderLayout.NORTH);
	    
	}
	
}
