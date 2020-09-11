package geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCiruculos {

	@Test
	void interseccion() {
		
		Circulo c1 = new Circulo(new Punto(1, 1), 3);
		
		Circulo c2 = new Circulo(new Punto(5, 1), 2);

		assertEquals(true, c1.intersection(c2));

		// fail("Not yet implemented");
	}
	
	@Test
	void circuloDentroDeOtro() {
		
		Circulo c1 = new Circulo(new Punto(1, 1), 1);
		
		Circulo c2 = new Circulo(new Punto(1, 1), 6);

		assertEquals(false, c1.intersection(c2));

		// fail("Not yet implemented");
	}
	
	
	
	

}
