
public class Complejo {
	// Atributos
	private double real;
	private double imag;
	private static int contador = 0;
	private static final double PI = 3.14;

	// Constructor por defecto
	public Complejo() {
//		this.real = 0;
//		this.imag = 0;
		this(0, 0); // ---> Creo por defecto invocando al parametrizado
	}

	// Constructor parametrizado
	public Complejo(double real, double imag) {

		this.real = real;
		this.imag = imag;
		this.contador++;
	}

	@Override
	public String toString() {
		return "Complejo [real=" + real + ", imag=" + imag + "] --> Contador:" + contador;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	public Complejo sumarComplejos(Complejo c) {
		return new Complejo (this.real + c.real, this.imag + c.imag);
	}
	
	public static Complejo sumaEstatica (Complejo c1, Complejo c2) {
		return new Complejo (c1.real + c2.real, c1.imag + c2.imag);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(imag);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(real);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(imag) != Double.doubleToLongBits(other.imag)) //Double es una clase envoltura del tipo de dato elemental double
			return false;
		if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
			return false;
		return true;
	}
	
}
