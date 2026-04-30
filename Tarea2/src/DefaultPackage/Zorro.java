package DefaultPackage;

public class Zorro extends Mascota {
	private String tipoPelaje;
	
	public Zorro(int edad, String nombre1, String pelaje) {
		super(edad, nombre1);
		tipoPelaje=pelaje;
		// TODO Auto-generated constructor stub
	}
	public String getTipoPelaje() {
		return tipoPelaje;
	}
	public void setTipoPelaje(String tipoPelaje) {
		this.tipoPelaje = tipoPelaje;
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
