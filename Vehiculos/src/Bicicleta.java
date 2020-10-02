
public class Bicicleta extends Vehiculo{
	private final int CAPACIDAD_MAXIMA = 20;
	
	private String zona; 

	
	public Bicicleta(String zona) {
		this.zona = zona;
	}
	
	public boolean puedeLlevar (Paquete paquete) {
		if (paquete.getDestino() == this.zona)
			if(paquete.getPeso() + this.carga <= CAPACIDAD_MAXIMA)
				return true;
		
		return false; 
	}

	@Override
	public String toString() {
		return "Bicicleta [CAPACIDAD_MAXIMA=" + CAPACIDAD_MAXIMA + ", zona=" + zona + "]";
	}
	

}
