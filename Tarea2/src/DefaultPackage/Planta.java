package DefaultPackage;

public abstract class Planta implements SerVivo{
	protected boolean tieneClorofila;
	
	public Planta(boolean clorofila){
		tieneClorofila=clorofila;
	}
	
	public void setTieneClorofila(boolean tieneClorofila) {
		this.tieneClorofila = tieneClorofila;
	}
	public boolean getTieneClorofila() {
		return tieneClorofila;
	}
	
	public void hacerFotosistesis() {
		tieneClorofila=true;
	}
}
