package minutosRestantesSALPD7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MinutosRestantes {
	
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		String diaTxt = "";
		int diaNum = 0;
		int hora = 0;
		int minutos = 0;

		do {
			System.out.print("Ingresa un día de la semana (de lunes a viernes): ");
			diaTxt = scanner.nextLine();
			diaTxt = diaTxt.toLowerCase();
			
			switch (diaTxt) {
				case "lunes":
					diaNum = 2;
					break;
				case "martes":
					diaNum = 3;
					break;
				case "miercoles":
					diaNum = 4;
					break;
				case "jueves":
					diaNum = 5;
					break;
				case "viernes":
					diaNum = 6;
					break;
				default:
					diaNum = 0;
					System.out.println("Día de la semana inválido.");
					break;
			}

		} while (diaNum > 6 || diaNum < 2);
		
		
		do {
			System.out.print("Ingresa la hora del dia en fomato de 24 horas (de 0 a 23 horas): ");
			hora = scanner.nextInt();
			scanner.nextLine();
			if (hora < 0 || hora > 23) {
				System.out.println("Hora ingresada inválida.");
			}
		} while (hora < 0 || hora > 23);
		
		
		do {
			System.out.print("Ingresa los minutos de la hora (de 0 a 59 minutos): ");
			minutos = scanner.nextInt();
			scanner.nextLine();
			if (minutos < 0 || minutos > 59) {
				System.out.println("Minutos ingresados inválidos.");
			}
		} while (minutos < 0 || minutos > 59);
		
	
		System.out.println("Dia y hora ingresados: " + diaTxt + ", " + hora + ":" + minutos + " hrs");
		String fechaTxtUsuario = diaNum + "/10/23 " + hora + ":" + minutos;
		String fechaTxtFinSemana = "06/10/23 15:00";

		if (diaTxt.equals("viernes") && (hora > 15 || (hora == 15 && minutos > 0))) {
			fechaTxtFinSemana = "13/10/23 15:00";
		}

		//Calculo de los minutos para el proximo fin de semana:
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy HH:mm");
		Date fechaUsuario = format.parse(fechaTxtUsuario);
		Date fechaFinSemana = format.parse(fechaTxtFinSemana);
		long diferenciaMS = fechaFinSemana.getTime() - fechaUsuario.getTime();
		long diferenciaMin = diferenciaMS/60000;
		System.out.println("Faltan " + diferenciaMin + " minutos para el proximo fin de semana.");

		scanner.close();
	}

}
