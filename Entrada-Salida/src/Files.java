import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.LinkedList;

public class Files {
	private String name;

	public Files(String name) {
		this.name = name;
	}

	public LinkedList<Integer> leerArchivo() {
		Scanner file = null;
		LinkedList<Integer> readInt = new LinkedList<Integer>();
		try {
			file = new Scanner(new File(this.name + ".txt"));
			while (file.hasNext())
				readInt.add(file.nextInt());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			file.close();
		}

		return readInt;
	}

	public void guardarArchivo(int[] datos) {
		FileWriter file = null;
		PrintWriter pw = null;

		try {
			file = new FileWriter(this.name + ".txt");
			pw = new PrintWriter(file);

			for (int i = 0; i < datos.length; i++) {
				pw.println(datos[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void writeTable(int max, int min, double average) {
		FileWriter file = null;
		PrintWriter pw = null;

		try {
			file = new FileWriter(this.name + ".txt");
			pw = new PrintWriter(file);

			pw.println("+----------+-------+");
			pw.println("| Máximo   | " + String.format("%5d", max) + " |");
			pw.println("+----------+-------+");
			pw.println("| Mínimo   | " + String.format("%5d", min) + " |");
			pw.println("+----------+-------+");
			pw.println("| Promedio | " + String.format("%5d", Math.round(average)) + " |");
			pw.println("+----------+-------+");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
