package atividade06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int div = 60;
		
		System.out.println("Informe os segundos para conversão:");
		int segundos = sc.nextInt(); 
		
		int segundo = segundos % div;
		int minutos = segundos / div;
		int minuto = minutos % div;
		int hora = minutos / div;
		System.out.printf("%02d Horas, %02d Minutos, %02d Segundos", hora, minuto, segundo);
		sc.close();

	}

}
