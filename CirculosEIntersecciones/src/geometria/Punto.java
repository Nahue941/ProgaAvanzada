package geometria;

public class Punto {

	protected double x;
	protected double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punto() {
		x = 0;
		y = 0;
	}

	public double getModule() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	public double distance(Punto p2) {
		Punto pAux = new Punto(p2.x - this.x, p2.y - this.y);
		return pAux.getModule();
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void desplazar(double x, double y) {
		this.x += x;
		this.y += y;
	}

	@Override
	public Object clone() {
		return new Punto(this.x, this.y);
	}

	@Override
	public String toString() {
		return "Punto [x:" + x + ", y:" + y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
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
		Punto other = (Punto) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

}
