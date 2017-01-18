package Teoria;

public class Arrays2 {

	public static void main(String[] args) {
		//definimos un array bidimensional de int
		final int TAMANO_FILAS = 3;
		final int TAMANO_COLUMNAS = 3;
		int [][] coleccionBidimensionalEnteros = new int [TAMANO_FILAS][TAMANO_COLUMNAS];
		//primera fila o fila 0 
		coleccionBidimensionalEnteros[0][0] = 0;
		coleccionBidimensionalEnteros[0][1] = 1;
		coleccionBidimensionalEnteros[0][2] = 2;
		//segunda fila o fila 1
		coleccionBidimensionalEnteros[1][0] = 3;
		coleccionBidimensionalEnteros[1][1] = 4;
		coleccionBidimensionalEnteros[1][2] = 5;
		//tercera fila o fila 2
		coleccionBidimensionalEnteros[2][0] = 6;
		coleccionBidimensionalEnteros[2][1] = 7;
		coleccionBidimensionalEnteros[2][2] = 8;
		//recorremos el Array
		for (int i = 0; i < coleccionBidimensionalEnteros.length; i++) {
			for (int j = 0; j < coleccionBidimensionalEnteros.length; j++) {
				System.out.println(coleccionBidimensionalEnteros[i][j]);
			}
		//cambiamos el bucle
		for (int[] is : coleccionBidimensionalEnteros) {
			for (int j : is) {
				System.out.println(i);
			}
		}	
		//ahora creamos la colección bidimensional y la inicializamos
		int[][][] coleccionTridimensionalEnteros = {
				{ {1,2}, {3,4} },
				{ {5,6}, {7,8} },
				{ {9,10}, {10,11} }
		};
		//recorremos el Array
		for (int[][] js : coleccionTridimensionalEnteros) {
			for (int[] js2 : js) {
				for (int j : js2) {
					if(i % 2 == 0)
					System.out.println(i);
				}
			}
		}
			
		}
		
	}

}
