package main.services;

import main.entities.Jogador;
import main.entities.Mao;
import main.entities.Resultado;

public class Partida {

	
	public String iniciarPartida(Jogador p1,Jogador p2) {
		
		if (p1.getMao().equals(p2.getMao())) {
			p1.setResultado(Resultado.EMPATA);
			p2.setResultado(Resultado.EMPATA);
		}
		else if(p1.getMao().equals(Mao.PEDRA) && p2.getMao().equals(Mao.TESOURA)) {
			p1.setResultado(Resultado.GANHA);
			p2.setResultado(Resultado.PERDE);
		}else if(p1.getMao().equals(Mao.PEDRA) && p2.getMao().equals(Mao.PAPEL)) {
			p1.setResultado(Resultado.PERDE);
			p2.setResultado(Resultado.GANHA);
		}else if(p1.getMao().equals(Mao.PAPEL) && p2.getMao().equals(Mao.PEDRA)) {
			p1.setResultado(Resultado.GANHA);
			p2.setResultado(Resultado.PERDE);
		}else if(p1.getMao().equals(Mao.PAPEL) && p2.getMao().equals(Mao.TESOURA)) {
			p1.setResultado(Resultado.PERDE);
			p2.setResultado(Resultado.GANHA);
		}else if(p1.getMao().equals(Mao.TESOURA) && p2.getMao().equals(Mao.PAPEL)) {
			p1.setResultado(Resultado.GANHA);
			p2.setResultado(Resultado.PERDE);
		}else if(p1.getMao().equals(Mao.TESOURA) && p2.getMao().equals(Mao.PEDRA)) {
			p1.setResultado(Resultado.PERDE);
			p2.setResultado(Resultado.GANHA);
		}
		
		
		if(p1.getResultado().equals(Resultado.GANHA)) {
			return "----  Vitoria do Jogador 1  ----";
		}else if(p1.getResultado().equals(Resultado.PERDE)) {
			return "----  Vitoria do Jogador 2  ----";
		}else {
			return "----  Empate  ----";
		}
		
	}
	
	public Partida() {}
	
}
