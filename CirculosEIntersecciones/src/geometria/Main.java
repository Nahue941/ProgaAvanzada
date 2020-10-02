package geometria;

public class Main {

	public static void main(String[] args) {

		Punto p1 = new Punto(1, 2);

		System.out.println(p1.toString());

		Circulo c1 = new Circulo(new Punto(1, 1), 3);
		System.out.println(c1.toString());

	}

}
