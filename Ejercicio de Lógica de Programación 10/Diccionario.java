package diccionarioRRLPD10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {

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
		
		List<String> clavesDiccionario = new ArrayList<String>(diccionario.keySet());
		List<String> clavesRandom = new ArrayList<>();
		Random randomNumber = new Random();

		while (clavesRandom.size() < 5) {
			int num = randomNumber.nextInt(clavesDiccionario.size());
			String clave = clavesDiccionario.get(num);
			
			if (!clavesRandom.contains(clave)) {				
				clavesRandom.add(clave);
			}
		}

		//System.out.println(clavesRandom.toString());
		Scanner scanner = new Scanner(System.in);
		List<String> respuestas = new ArrayList<>();

		System.out.println("Ingresa la traducción de las siguientes palabras");
		for (int i = 0; i <= clavesRandom.size()-1; i++) {
			String palabraRandom = clavesRandom.get(i);
			System.out.println("Palabra " + (i+1) + ": " + palabraRandom);
			System.out.print("Traducción: ");
			String userTraduccion = scanner.nextLine();
			userTraduccion = userTraduccion.toLowerCase();
			respuestas.add(userTraduccion);
		}
		
		System.out.println();
		System.out.println("Resultados:");
		int aciertos = 0;
		for (int i = 0; i <= clavesRandom.size()-1; i++) {
			String clave = clavesRandom.get(i);
			String traduccion = diccionario.get(clave);
			String respuesta = respuestas.get(i);
			
			System.out.println("Palabra " + (i+1) + ": " + clave);
			System.out.println("Traducción: " + traduccion);
			System.out.println("Tú respuesta: " + respuesta);
			if (traduccion.equals(respuesta)) {
				aciertos++;
				System.out.println("Respuesta correcta.");
			} else {
				System.out.println("Respuesta incorrecta.");
			}
			System.out.println();
		}
		
		System.out.println("Aciertos: " + aciertos + "/" + clavesRandom.size());
		scanner.close();

	}

}
