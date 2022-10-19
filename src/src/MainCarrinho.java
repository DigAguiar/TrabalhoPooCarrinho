package src;

public class MainCarrinho {

	public static void main(String[] args) {

		String [] vetor1 = new String [50];
		String [] vetor2 = new String [50];
		
		Carro carrinho1 = new Carro (0,0);
		Carro carrinho2 = new Carro (0,0);


		
		
		boolean controlador = false;
		
		do {
			
			for (int i = 0; i < 50; i++) {
				vetor1[i] = "";
				vetor2[i] = "";
			}
			
			
			carrinho1.setVelocidade(0);
			carrinho1.setPosicaoCarro(0);
			carrinho2.setVelocidade(0);
			carrinho2.setPosicaoCarro(0);
			
			
			
			vetor1[carrinho1.getPosicaoCarro()] = "@";
			vetor2[carrinho2.getPosicaoCarro()] = "#";
			
			System.out.println("----------------------------------------");
			System.out.println(vetor1[0] + " " + vetor1[1] + " " + vetor1[2] + " " + vetor1[3] + " " + vetor1[4] + " " + vetor1[5] + " " + vetor1[6] + " " + vetor1[7] + " " + vetor1[8] + " " + vetor1[9] + " " + vetor1[10] + " " + vetor1[11] + " " + vetor1[12] + " " + vetor1[13] + " " + vetor1[14] + " " + vetor1[15] +" " + vetor1[16] + " " + vetor1[17] + " " + vetor1[18] + " " + vetor1[19] + " " + vetor1[20] + " " + vetor1[21] + " " + vetor1[22] + " " + vetor1[23] + " " + vetor1[24] + " " + vetor1[25] + " " + vetor1[26] + " " + vetor1[27] + " " + vetor1[28] + " " + vetor1[29] + " " + vetor1[30] + " " + vetor1[31] + " " + vetor1[32] + " " + vetor1[33] + " " + vetor1[34] + " " + vetor1[35] + " " + vetor1[36] + " " + vetor1[37] + " " + vetor1[38] + " " + vetor1[39] + " " + vetor1[40] + " " + vetor1[41] + " " + vetor1[42] + " " + vetor1[43] + " " + vetor1[44]);                                                                                                                                                                                                                  
			System.out.println(vetor2[0] + " " + vetor2[1] + " " + vetor2[2] + " " + vetor2[3] + " " + vetor2[4] + " " + vetor2[5] + " " + vetor2[6] + " " + vetor2[7] + " " + vetor2[8] + " " + vetor2[9] + " " + vetor2[10] + " " + vetor2[11] + " " + vetor2[12] + " " + vetor2[13] + " " + vetor2[14] + " " + vetor2[15] +" " + vetor2[16] + " " + vetor2[17] + " " + vetor2[18] + " " + vetor2[19] + " " + vetor2[20] + " " + vetor2[21] + " " + vetor2[22] + " " + vetor2[23] + " " + vetor2[24] + " " + vetor2[25] + " " + vetor2[26] + " " + vetor2[27] + " " + vetor2[28] + " " + vetor2[29] + " " + vetor2[30] + " " + vetor2[31] + " " + vetor2[32] + " " + vetor2[33] + " " + vetor2[34] + " " + vetor2[35] + " " + vetor2[36] + " " + vetor2[37] + " " + vetor2[38] + " " + vetor2[39] + " " + vetor2[40] + " " + vetor2[41] + " " + vetor2[42] + " " + vetor2[43] + " " + vetor2[44]);
			System.out.println("----------------------------------------");

			controlador = verificador(carrinho1,carrinho2);
		} while (controlador == false);





	}
	public static boolean verificador (Carro carrinho1,Carro carrinho2) {
		boolean control = false;
		if (carrinho1.getPosicaoCarro() > carrinho2.getPosicaoCarro() && carrinho1.getPosicaoCarro() >= 40) { //Vitoria do primeiro carro
			System.out.println("O primeiro carro (@) ganhou!");
			control = true;
		}else if (carrinho2.getPosicaoCarro() > carrinho1.getPosicaoCarro()  && carrinho2.getPosicaoCarro() >= 40) { //vitoria para o segundo carro
			System.out.println("O segundo carro (#) ganhou!");
			control = true;
		}else if (carrinho1.getPosicaoCarro() == carrinho2.getPosicaoCarro() && carrinho1.getPosicaoCarro() == 40 && carrinho2.getPosicaoCarro() == 40) { //empate
			System.out.println("Aconteceu um empate");
			control = true;
		}
		return control;
		
		
		
		
		
	}
}
