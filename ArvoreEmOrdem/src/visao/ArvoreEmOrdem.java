package visao;

import javax.swing.JOptionPane;

import modelagem.Numero;
import negocio.Arvore;

public class ArvoreEmOrdem {

	public static void main(String[] args) {

		Arvore arvore = new Arvore();

		Numero primeiroNumero = new Numero();
		int numeroUm = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		primeiroNumero.setDado(numeroUm);

		Numero segundoNumero = new Numero();
		int numeroDois = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		segundoNumero.setDado(numeroDois);

		Numero terceiroNumero = new Numero();
		int numeroTres = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		terceiroNumero.setDado(numeroTres);

		Numero quartoNumero = new Numero();
		int numeroQuatro = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		quartoNumero.setDado(numeroQuatro);

		Numero quintoNumero = new Numero();
		int numeroCinco = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		quintoNumero.setDado(numeroCinco);

		arvore.adicionar(primeiroNumero);
		arvore.adicionar(segundoNumero);
		arvore.adicionar(terceiroNumero);
		arvore.adicionar(quartoNumero);
		arvore.adicionar(quartoNumero);
		arvore.adicionar(quintoNumero);

		JOptionPane.showMessageDialog(null, "\n EM ORDEM");
		arvore.exibirOrdemArvore(arvore);

	}

}
