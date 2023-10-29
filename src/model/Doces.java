package model;

public class Doces {
	
	public int altura;
	public int largura;
	public int comprimento;

	public Doces() {
		super();
	}
	
	public Doces(int altura, int largura, int comprimento) {
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
	}

	@Override
	public int hashCode() {
		int volume = altura * largura * comprimento;
		if (volume>=50 && volume <=60) {
			return 0;
		}
		else if (volume>=100 && volume <=110) {
			return 1;
		}
		else if (volume>=150 && volume <=165) {
			return 2;
		}
		else if (volume>=200 && volume <=220) {
			return 3;
		}
		else if (volume>=260 && volume <=280) {
			return 4;
		}
		else {
			return 5;
		}

	}

	
}
