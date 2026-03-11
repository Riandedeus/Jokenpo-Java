package jokenpo;

import java.util.Scanner;

import jokenpo.services.PartidaDupla;
import jokenpo.services.PartidaSolo;

public class Jogar {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int op;
		
		do {
			System.out.println("--- JOKENPÔ ---");
			System.out.println("1 - Iniciar Partida em Dupla");
			System.out.println("2 - Partida Solo");
			System.out.println("3 - Encerrar");
			op = scanner.nextInt();
			
			if(op == 1) {
				PartidaDupla partida = new PartidaDupla();
				System.out.println(partida.partidaDupla()+"\n");
			}else if(op == 2) {
				PartidaSolo partida = new PartidaSolo();
				System.out.println(partida.partidaSolo()+"\n");
			}
		}while(op != 3);
		
		
		
		scanner.close();
	}
}
