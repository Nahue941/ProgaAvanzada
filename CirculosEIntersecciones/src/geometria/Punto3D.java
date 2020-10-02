package geometria;

public class Punto3D extends Punto {

	private double z;

	public Punto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	public Punto3D() {
		super();
		this.z = 0;
	}

	@Override
	public String toString() {
		return "[" + getX() + ";" + getY() + ";" + z + "]";
	}

//	otra forma de llamarlo
//	@Override
//	public String toString() {
//		return super.toString() + ";" + z;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(z);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto3D other = (Punto3D) obj;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
			return false;
		return true;
	}

	@Override
	public double getModule() {
		return Math.sqrt(super.x * super.x + super.y * super.y + this.z * this.z);
	}

	public void desplazar(double x, double y, double z) {
		super.desplazar(x, y);
		this.z += z;
	}

}
