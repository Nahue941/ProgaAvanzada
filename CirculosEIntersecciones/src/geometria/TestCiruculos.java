package geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCiruculos {

	@Test
	void mismoCentroMismoRadio() {
		// Dos circulos con el mismo punto como centro y mismo radio.
		// Intersectan en todos los puntos de los bordes.
		Circulo c1 = new Circulo(new Punto(1, 1), 3);
		Circulo c2 = new Circulo(new Punto(1, 1), 3);

		assertEquals(true, c1.intersection(c2));
	}

	@Test
	void mismoCentroDistintoRadio() {
		// Dos circulos con el mismo punto como centro pero con distintos radios.
		// No tienen que intersectar en ningun punto.
		Circulo c1 = new Circulo(new Punto(1, 1), 3);
		Circulo c2 = new Circulo(new Punto(1, 1), 5);

		assertEquals(false, c1.intersection(c2));
	}

	@Test
	void circulosLejanos() {
		// Circulos lejanos, en distintos cuadrantes y con radios no lo suficientemente
		// grande como para intersectar.
		Circulo c1 = new Circulo(new Punto(10, 9), 3);
		Circulo c2 = new Circulo(new Punto(-5, -6), 2);

		assertEquals(false, c1.intersection(c2));
	}

	@Test
	void interseccionEnUnPunto() {
		// Circulos que intersectan en un solo punto.
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(2, 0), 1);

		assertEquals(true, c1.intersection(c2));
	}

	@Test
	void interseccionDoble() {
		// Circulos que intersectan en 2 puntos.
		Circulo c1 = new Circulo(new Punto(1, 1), 3);
		Circulo c2 = new Circulo(new Punto(5, 1), 2);

		assertEquals(true, c1.intersection(c2));
	}

	@Test
	void circuloDentroDeOtro() {
		// Circulo dentro de otro, con distinto centro y con un radio muy chico para uno
		// de los dos como para intersectar al otro.
		Circulo c1 = new Circulo(new Punto(2, 2), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 6);

		assertEquals(false, c1.intersection(c2));
	}
}
