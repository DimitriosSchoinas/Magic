
public class Magia {
	private int valorSalto;
	private char[] nipe;

	public Magia(int valorSalto, char[] nipe) {
		this.valorSalto = valorSalto;
		this.nipe = nipe;
	}

	public void setNipe(char[] nipe) {
		this.nipe = nipe;
	}

	public char[] getNipe() {
		return nipe;
	}

	public void setValorSalto(int numCarta) {
		this.valorSalto = numCarta;
	}

	public int getValorSalto() {
		return valorSalto;
	}

	public int numCartaAnterior(int numCartaAtual) {
		int valorFinal = 0;
		if (numCartaAtual - valorSalto > 0) {
			valorFinal = numCartaAtual - valorSalto;
		} else {
			valorFinal = 13 + (numCartaAtual - valorSalto);
		}
		return valorFinal;
	}

	public char nipeAnterior(char[] vetorNipes) {
		char nipeAnterior = 0;

		if (vetorNipes[0] == nipe[0]) {
			nipeAnterior = nipe[3];
		} else {
			for (int i = 1; i < 4; i++) {
				if (vetorNipes[0] == nipe[i]) {
					nipeAnterior = nipe[i - 1];
				}
			}
		}
		return nipeAnterior;

	}

}
