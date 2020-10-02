package geometria;

public abstract class Figura {
	private String color;
	
	abstract double perimetro();
	
	public Figura(String color) {
		this.color = color;
	}
	
	public void asignarCOlor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return " ,color=" + color + "]";
	}
	
	
}
