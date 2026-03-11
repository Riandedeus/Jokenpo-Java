package jokenpo.services;

import java.util.Scanner;

import jokenpo.entities.Jogador;

public class PartidaDupla {
	Scanner scanner = new Scanner(System.in);
	
	
	Partida partida = new Partida();
	EscolhaJogador escolha = new EscolhaJogador();
	Jogador jogador1 = new Jogador();
	Jogador jogador2 = new Jogador();
	
	public String partidaDupla() {
		
		System.out.println("Jogador 1");
		escolha.escolhaMao(jogador1);
		
		System.out.println("Jogador 2");
		escolha.escolhaMao(jogador2);
		
		String result = partida.iniciarPartida(jogador1, jogador2);
		
		return result;
		
		
	}
	
	public PartidaDupla() {}
}
