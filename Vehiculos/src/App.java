import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		//array de vehiculos
		//array de paquetes
		
		//para cada paquete
			//para cada vehiculo
				//si puede cargarlo
					//cargarlo
					//sacar paquete de lista

		
		List<Vehiculo> vehiculos = new LinkedList<Vehiculo>();
		vahiculos.add(new Bicicleta("Moron"));
		Camioneta camioneta = new Camioneta();
		camioneta.agregarZona("Castelar");
		camioneta.agregarZona("Haedo");
		vehiculos.add(camioneta);
		
		List<Paquete> paquetes = new LinkedList<Paquete>();
		paquetes.add(new Paquetes("Haedo", 150));
		paquetes.add(new Paquetes("Castelar", 50));
		paquetes.add(new Paquetes("Moron", 15));
		
		
		
		for (Iterator<Paquete> iterator = paquetes.iterator(); iterator.hashNext();) {
			Paquete paquete = iterator.next();
			bolean haCargado = false;
			for(int i=0; i<vehiculos.size() && !haCargado; i++) {
				Vehiculo vehiculo = Vehiculo.get(i);
				
				if(vehiculo.puedeLlevar(paquete)) {
					vehiculo.cargar(paquete);
					//sacarlo
					iterator.remove();
					//asegurarme de que no sigo iterando
					haCargado = true;
				}
			}
			
		}
		
		System.out.println(vehiculos);
		
	}

}
