
public class TestComplejo {

	public static void main(String[] args) {
		Complejo complejo = new Complejo(3.5,4);
		System.out.println(complejo);
		
		Complejo otroComplejo = new Complejo ();
		System.out.println(otroComplejo);
		otroComplejo = complejo;
		System.out.println(otroComplejo);
		
		complejo.setReal(7);
		complejo.setImag(9);
		
		System.out.println(otroComplejo);
		
		Complejo sumaComplejos = complejo.sumarComplejos(otroComplejo);
		System.out.println(sumaComplejos);
		
		sumaComplejos = Complejo.sumaEstatica(complejo, otroComplejo);
		System.out.println(sumaComplejos);
		
		if (complejo.equals(otroComplejo)) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("Son distintos");
		}
		
	}

}
