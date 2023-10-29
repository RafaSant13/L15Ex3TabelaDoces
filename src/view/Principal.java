package view;

import javax.swing.JOptionPane;

import controller.DocesControle;
import model.Doces;

public class Principal {

	public static void main(String[] args) {
		DocesControle d = new DocesControle();
		
		try {
			Doces doce1 = new Doces(5, 5, 2);
			d.add(doce1);
			Doces doce2 = new Doces(10, 6, 1);
			d.add(doce2);
			Doces doce3 = new Doces(10, 5, 2);
			d.add(doce3);
			Doces doce4 = new Doces(7, 5, 3);
			d.add(doce4);
			Doces doce5 = new Doces(10, 5, 3);
			d.add(doce5);
			Doces doce6 = new Doces(11, 5, 3);
			d.add(doce6);
			Doces doce7 = new Doces(20, 5, 2);
			d.add(doce7);
			Doces doce8 = new Doces(10, 11, 2);
			d.add(doce8);
			Doces doce9 = new Doces(26, 5, 2);
			d.add(doce9);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int x = 0;
		while (x != 9) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1 - Adicionar doce\n2 - Contar doces\n9 - Fim"));
			switch(x) {
			case 1:
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Insira a altura: "));
				int largura = Integer.parseInt(JOptionPane.showInputDialog("Insira a largura: "));
				int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o comprimento: "));
				Doces doce = new Doces(altura, largura, comprimento);
				try {
					d.add(doce);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				d.count();
				break;
			case 9:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Valor Inválido");
				break;
			}
		}
		
	}

}
