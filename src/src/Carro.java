package src;
import java.util.Random;
public class Carro {

	private int velocidade;
	private int posicaoCarro;


	public Carro(int velocidade, int posicaoCarro) {
		this.velocidade = velocidade;
		this.posicaoCarro = posicaoCarro;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		Random rand = new Random ();
		velocidade = (rand.nextInt(3)) + 1;
		this.velocidade = velocidade;
	}
	public int getPosicaoCarro() {
		return posicaoCarro;
	}
	public void setPosicaoCarro(int posicaoCarro) {
		posicaoCarro = getVelocidade() + getPosicaoCarro();
		this.posicaoCarro = posicaoCarro;
	}

}
