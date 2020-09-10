package geometria;

public class Punto {
	
	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getModule() {		
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}
	
	public double distance(Punto p2) {
		Punto pAux = new Punto(p2.x-this.x, p2.y-this.y);
		return pAux.getModule();
	}
		
	
}
