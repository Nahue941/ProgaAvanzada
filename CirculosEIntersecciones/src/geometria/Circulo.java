package geometria;

public class Circulo {
	private double radio;
	private Punto centro;
	
	
	public Circulo(double radio, Punto centro) {
		this.radio = radio;
		this.centro.getX();
		this.centro.getY();
	}
	
	//Para que NO exista inteseccion:
	//	1- la disancia entre centros es mayor que la suma de sus radios.
	//	2- el radio mayor es mas grande que la suma de la distancia entre sus centros y el radio menor.
	public boolean intersection(Circulo c) {
		double distance = this.centro.distance(c.centro);
		double r1 = this.radio, r2 = c.radio;
		
		return ! ( distance > (r1 + r2) || Math.max(r1, r2) > distance + Math.min(r1, r2));
	}
	
	
	
	
	
	
	
}
