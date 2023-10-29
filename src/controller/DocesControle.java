package controller;

import model.Doces;
import model.Lista;

@SuppressWarnings("unchecked")
public class DocesControle {
	
	
	Lista<Doces>[] doc = new Lista[5];
	

	public DocesControle() {
		int tamanho = doc.length;
		for (int i = 0;i<tamanho;i++) {
			doc[i] = new Lista<Doces>();
		}
	}
	
	public void add(Doces doce) throws Exception {
		int hash = doce.hashCode();
		if (hash == 5) {
			throw new Exception("Volume Inválido");
		}
		Lista<Doces> l = doc[hash];
		l.addLast(doce);
	}
	
	public void count() {
		int tamanho = doc.length;
		int qtd;
		String categoria = null;
		for (int i = 0; i < tamanho; i++) {
			switch (i) {
			case 0:
				categoria = "Bombons";
				break;
			case 1:
				categoria = "Pavês";
				break;
			case 2:
				categoria = "Brigadeiros";
				break;
			case 3:
				categoria = "Bolos";
				break;
			case 4:
				categoria = "Ovos de Páscoa";
				break;
			}
			Lista<Doces> l = doc[i];
			qtd = l.size()-1;
			System.out.println("Quantidade de chocolates para "+categoria+": "+qtd);
		}
	}

}
