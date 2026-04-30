package DefaultPackage;

public abstract class Mascota extends Animal{
	protected String nombre;
	
	public String getNombre() {
		return nombre;
	}public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Mascota(int edad, String nombre1) {
		super(edad);
		nombre=nombre1;
	}
}
