package Teoria;

import java.io.SequenceInputStream;

public class Arrays1 {

	public static void main(String[] args) {
		//Creo la colección
		int[] coleccionEnteros = new int[3];
		//Añadimos elementos a la colección
		coleccionEnteros[0] = 1;
		coleccionEnteros[1] = 2;
		coleccionEnteros[2] = 3;
		//recorremos la colección
		for (int i = 0; i < coleccionEnteros.length; i++) {
			System.out.println(coleccionEnteros[i]);
		}
		//otra forma de recorrer la colección
		for (int i : coleccionEnteros) {
			System.out.println(i);
		}
		//coleccoón de cadenas
		String[] coleccionCadenas = new String[4];
		coleccionCadenas[0] = "hola";
		coleccionCadenas[1] = " ";
		coleccionCadenas[2] = "mundo";
		coleccionCadenas[3] = "\n";
		//recorrer la colección 
		for (String string : coleccionCadenas) {
			System.out.println(string);
		} 
		//crear una colección de double inicializada
		double[] colecionDouble = {1.2, 11.5, -23.65, 0.005, 7};
		//recorrer Array de double
		for (double d : colecionDouble) {
			System.out.printf("%9.3f", d);
		}
	}
	
}
