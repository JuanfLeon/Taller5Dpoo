package interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDatos extends JPanel{
	private JLabel nombre;
	private JLabel apellido;
	private JLabel genero;
	private JLabel nacimiento;
	private JLabel ingreso;
	private JLabel salario;
	private JTextField nombreText;
	private JTextField apellidoText;
	private JTextField generoText;
	private JTextField nacimientoText;
	private JTextField ingresoText;
	private JTextField salarioText;
	private JButton btnModificar;
	
	
	
	public PanelDatos() {
		BorderLayout bl= new BorderLayout();
		setLayout(bl);
		JPanel auxWest= new JPanel();
		auxWest.setLayout(new GridLayout(7,1));
		
		nombre = new JLabel("Nombre:");
        apellido = new JLabel("Apellido:");
        genero = new JLabel("Género:");
        nacimiento = new JLabel("Fecha nacimiento:");
        ingreso = new JLabel("Fecha ingreso:");
        salario = new JLabel("Salario:");
		
        auxWest.add(nombre);
        auxWest.add(apellido);
        auxWest.add(genero);
        auxWest.add(nacimiento);
        auxWest.add(ingreso);
        auxWest.add(salario);
        
        nombre.setHorizontalAlignment(JLabel.RIGHT);
        apellido.setHorizontalAlignment(JLabel.RIGHT);
        genero.setHorizontalAlignment(JLabel.RIGHT);
        nacimiento.setHorizontalAlignment(JLabel.RIGHT);
        ingreso.setHorizontalAlignment(JLabel.RIGHT);
        salario.setHorizontalAlignment(JLabel.RIGHT);
        
		
		JPanel auxCenter= new JPanel();
		auxCenter.setLayout(new GridLayout(7,1));
		
		nombreText=new JTextField("Pedro");
		apellidoText= new JTextField("Vazquez");
		generoText= new JTextField("masculino");
		nacimientoText= new JTextField("01-01-2001");
		ingresoText= new JTextField("14-05-2026");
		salarioText= new JTextField("1000$");
		
		btnModificar= new JButton("Modificar salario");
		
		auxCenter.add(nombreText);
		auxCenter.add(apellidoText);
		auxCenter.add(generoText);
		auxCenter.add(nacimientoText);
		auxCenter.add(ingresoText);
		auxCenter.add(salarioText);
		auxCenter.add(btnModificar);
		
		
		auxCenter.setPreferredSize(getPreferredSize());
		ImageIcon foto = new ImageIcon("./data/empleado1 (1).png");

		Image img = foto.getImage();
		Image imgEscalada = img.getScaledInstance(150, 180, Image.SCALE_SMOOTH);

		JLabel east = new JLabel(new ImageIcon(imgEscalada));
		
		setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(0, 195, 0, 195), BorderFactory.createTitledBorder("Datos")) );

        // AGREGAR AL PANEL PRINCIPAL
        add(auxWest, BorderLayout.WEST);
        add(auxCenter, BorderLayout.CENTER);
        add(east, BorderLayout.EAST);
        
		
	}
	
}
