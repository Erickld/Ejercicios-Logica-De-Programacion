package arraysSALPD8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysE8 {
	
	public static void main(String[] args) {
		List<Integer> listaNumeros = new ArrayList<>();
		List<Integer> numPrimos = new ArrayList<>();
		List<Integer> noPrimos = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa 10 números enteros positivos:");
		while (listaNumeros.size() < 10) {
			int number = scanner.nextInt();
			if (number <= 0) {
				System.out.println("Número inválido, ingresa solo números enteros positivos:");
			} else {
				listaNumeros.add(number);
				if(esPrimo(number)) {
					numPrimos.add(number);
				} else {
					noPrimos.add(number);
				}
			}
		}
		
		System.out.println("Array original:");
		printIndexValueArray(listaNumeros);

		System.out.println("Array con los números primos en las primeras posiciones:");
		numPrimos.addAll(noPrimos);
		printIndexValueArray(numPrimos);
				
		scanner.close();
	}
	

	
	public static boolean esPrimo(int numero) {
		int divisores = 0;
		if (numero <= 1) {
			return false;
		}
		for (int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				divisores++;
			}
			if (divisores > 2) {
				return false;
			}
		}
		return true;
	}

	
	public static void printIndexValueArray(List<Integer> arr) {
		for (int i = 0; i <= arr.size()-1 ; i++) {
			int num = arr.get(i);
			System.out.println("pos[" + i + "] = " + num);
		}
		System.out.println();
	}
	
	
}
