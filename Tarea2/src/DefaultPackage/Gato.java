package DefaultPackage;

public class Gato extends Mascota {
	
	private int vidasRestantes;
	private boolean esCazador;
	
	
	public Gato(int edad, String nombre1, int vidas, boolean cazador) {
		super(edad, nombre1);
		vidasRestantes=vidas;
		esCazador=cazador;
	}
	public int getVidasRestantes() {
		return vidasRestantes;
	}
	
	public void setEsCazador(boolean esCazador) {
		this.esCazador = esCazador;
	}
	public void setVidasRestantes(int vidasRestantes) {
		this.vidasRestantes = vidasRestantes;
	}
	public boolean getEsCazador() {
		return esCazador;
	}
	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void reproducirse() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void hacerSonido() {
		// TODO Auto-generated method stub
		
	}
}
