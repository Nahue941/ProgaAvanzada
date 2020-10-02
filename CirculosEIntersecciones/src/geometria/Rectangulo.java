package geometria;

public class Rectangulo extends Figura {
	private double base;
	private double altura;

	public Rectangulo(double base, double altura, String color) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double perimetro() {
		return base * 2 + altura * 2;
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + super.toString();
	}

}
