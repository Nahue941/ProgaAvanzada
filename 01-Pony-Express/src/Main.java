
public class Main {

	public static void main(String[] args) {
		int num = jinetes(new int[] { 100 });

		System.out.println(num);

	}

	/**
	 * @param estaciones es la distancia en millas de una estación hasta la otra.
	 * 
	 * @returns -la cantidad de jinetes necesarios para enviar el correo desde un
	 *          extremo hasta el otro del recorrido. -'-1' en caso de contener algun
	 *          numero negativo o una distacia mayor a 100 millas entre estaciones.
	 *          -'0' si el vector estaba cargado con 0 nada mas.
	 */

	public static int jinetes(int[] estaciones) {
		int i = 0;
		while (estaciones[i] == 0) {
			i++;
		}
		if (i == estaciones.length - 1 && estaciones[i] == 0)
			return 0;

		int quantityHorseRiders = 1;
		int travelledMiles = 0;
		for (; i < estaciones.length; i++) {
			if (estaciones[i] < 0 || estaciones[i] > 100)
				return -1;

			else if (travelledMiles + estaciones[i] <= 100)
				travelledMiles += estaciones[i];

			else {
				travelledMiles = estaciones[i];
				quantityHorseRiders++;
			}
		}
		return quantityHorseRiders;
	}
}
