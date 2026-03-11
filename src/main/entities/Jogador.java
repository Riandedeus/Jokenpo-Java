package main.entities;

public class Jogador {
	private Mao mao;
	private Resultado resultado;
	
	public Jogador() {}
	
	public Jogador(Mao mao) {
		this.mao = mao;
	}
	
	public void setMao(Mao mao) {
		this.mao = mao;
	}
	
	public Mao getMao() {
		return mao;
	}
	
	public void setResultado(Resultado result) {
		this.resultado = result;
	}
	
	public Resultado getResultado() {
		return resultado;
	}
}
