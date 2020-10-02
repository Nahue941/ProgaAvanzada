
public class Camioneta extends Vehiculo{
	private final int CAPACIDAD_MAXIMA = 2000;
	
	private String zonas = new LinkedList<String>(); 
	
	public Bicicleta(String zona) {
		this.zona.add(zona);
	}
	
	public boolean puedeLlevar (Paquete paquete) {
		if (this.zonas.contains(paquete.getDestino()))
			if(paquete.getPeso() + this.carga <= CAPACIDAD_MAXIMA)
				return true;
		
		return false; 
	}

	@Override
	public String toString() {
		return "Camioneta [CAPACIDAD_MAXIMA=" + CAPACIDAD_MAXIMA + ", zonas=" + zonas + "]";
	}
	
	
}
