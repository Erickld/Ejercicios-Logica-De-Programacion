package coleccionesSALPD9;

import java.util.HashMap;
import java.util.Scanner;

public class Colecciones {

	public static void main(String[] args) {
		HashMap<String, String> diccionario = new HashMap<>();
		diccionario.put("hola", "hello");
		diccionario.put("bye", "adios");
		diccionario.put("raton", "mouse");
		diccionario.put("gato", "cat");
		diccionario.put("perro", "dog");
		diccionario.put("casa", "home");
		diccionario.put("escuela", "school");
		diccionario.put("ciudad", "city");
		diccionario.put("bicicleta", "bicycle");
		diccionario.put("motocicleta", "motorcycle");
		diccionario.put("automovil", "car");
		diccionario.put("avion", "airplane");
		diccionario.put("mar", "sea");
		diccionario.put("isla", "island");
		diccionario.put("estrella", "star");
		diccionario.put("sol", "sun");
		diccionario.put("luna", "moon");
		diccionario.put("universo", "universe");
		diccionario.put("planeta", "planet");
		diccionario.put("espacio", "space");
		
		Scanner scanner = new Scanner(System.in);
		String palabra;

		do {
			System.out.println("Ingresa una palabra en español para buscarla en el diccionario.");
			System.out.println("Para salir del diccionario ingresa la palabra 'salir'.");
			System.out.print("Palabra: ");
			palabra = scanner.nextLine();
			palabra = palabra.toLowerCase();
			if (!palabra.equals("salir")) {
				if (diccionario.get(palabra) != null) {
					System.out.println("Traducción: " + diccionario.get(palabra));
				} else {
					System.out.println("La palabra '" + palabra + "' no se encuentra en el diccionario.");
				}
				System.out.println();
			}
		} while (!palabra.equals("salir"));

		System.out.println("Has salido del diccionario.");
		scanner.close();
		
	}

}