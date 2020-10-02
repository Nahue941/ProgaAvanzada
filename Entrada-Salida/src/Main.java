import java.util.concurrent.ThreadLocalRandom;
import java.util.Collections;
import java.util.LinkedList;

//entre 0 y 12k rango numeros
//crear entre 10k y 20k num
public class Main {

	public static void main(String[] args) {
		int rangeFor = getRandomNumber(10000, 20000);
		int[] arrayInt = new int[rangeFor];
		LinkedList<Integer> intFiles = new LinkedList<Integer>();

		for (int i = 0; i < rangeFor; i++) {
			arrayInt[i] = getRandomNumber(0, 12000);
		}

		Files arch = new Files("Prueba");
		arch.guardarArchivo(arrayInt);

		Files file2 = new Files("Prueba");
		intFiles = file2.leerArchivo();

		Collections.sort(intFiles);
		int min, max;
		double average;
		min = intFiles.getFirst();
		max = intFiles.getLast();

		average = listAverage(intFiles);

		Files fileTable = new Files("table");
		fileTable.writeTable(max, min, average);
		

	}

	static public int getRandomNumber(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}

	static public double listAverage(LinkedList<Integer> li) {
		double sum = 0;
		int count = 0;
		for (int i : li) {
			sum += i;
			count++;
		}

		return sum / count;
	}

}
