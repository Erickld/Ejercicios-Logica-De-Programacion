package textoInvertidoSALPD6;

import java.util.Scanner;

public class TextoInvertido {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa una palabra o frase: ");
		String palabra = scanner.nextLine();
		
		for(int i = palabra.length()-1; i >= 0; i--) {
			System.out.print(palabra.charAt(i));
		}
		scanner.close();
	}

}