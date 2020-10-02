
public abstract class Vehiculo {
	protected int carga = 0;
	private List<Paquete> paquetes = new LinkedList<Paquete>();
	public abstract boolean puedeLlevar (Paquete paquete);
	
	public void cargar(Paquete paquete) {
		//agrego a la coleccion de paquetes
		this.paquetes.add(paquete);
		this.carga += paquete.getPeso();
	}

	@Override
	public String toString() {
		return "Vehiculo [carga=" + carga + "]";
	}
	
	
}
