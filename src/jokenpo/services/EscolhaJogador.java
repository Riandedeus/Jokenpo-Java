package jokenpo.services;

import java.util.Random;
import java.util.Scanner;

import jokenpo.entities.Jogador;
import jokenpo.entities.Mao;

public class EscolhaJogador {
	Scanner scanner = new Scanner(System.in);
	
	public void escolhaMao(Jogador jogador) {
		int escolha;
		System.out.println("Informe a escolha do Jogador:");
		do {
			System.out.println("1 - PAPEL");
			System.out.println("2 - TESOURA");
			System.out.println("3 - PEDRA");
			escolha = scanner.nextInt();
		}while(escolha != 1 && escolha != 2 && escolha != 3);
		
		switch(escolha) {
		case 1:
			jogador.setMao(Mao.PAPEL);
			break;
		case 2:
			jogador.setMao(Mao.TESOURA);
			break;
		case 3:
			jogador.setMao(Mao.PEDRA);
			break;
		}
		
		System.out.println("O jogador escolheu: "+jogador.getMao() +"\n");
	}
	
	public void maoAleatoria(Jogador jogador) {
		Random random = new Random();
		
		int escolha = (random.nextInt(3))+1;		
		
		switch(escolha) {
		case 1:
			jogador.setMao(Mao.PAPEL);
			break;
		case 2:
			jogador.setMao(Mao.TESOURA);
			break;
		case 3:
			jogador.setMao(Mao.PEDRA);
			break;
		}
		System.out.println("A CPU escolheu: "+jogador.getMao() +"\n");
	}
	
	public EscolhaJogador() {}
}
