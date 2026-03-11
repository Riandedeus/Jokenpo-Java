package jokenpo.services;

import jokenpo.entities.Jogador;

public class PartidaSolo {
	Jogador jogador1 = new Jogador();
	Jogador jogador2 = new Jogador();
	EscolhaJogador escolha = new EscolhaJogador();
	Partida partida = new Partida();
	
	public String partidaSolo() {
		
		System.out.println("Jogador 1");
		escolha.escolhaMao(jogador1);
		
		
		System.out.println("Jogador 2");
		escolha.maoAleatoria(jogador2);
		
		return partida.iniciarPartida(jogador1, jogador2);
	}
	
	public PartidaSolo() {}
}
