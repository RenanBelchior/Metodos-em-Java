package CriandoMetodos;

public class Metodos1 {

	public static void main(String[] args) {
		
		// Calculadora
		System.out.println("Exercicio calculadora por metodos");
		Calculadora.soma(3, 6);
		Calculadora.subtracao(9, 1.8);
		Calculadora.multiplicacao(7, 8);
		Calculadora.divisao(5, 2.5);
		
		// Mensagem
		System.out.println("Exercicio de mensagens por m�todos");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);
		
		// Empr�stimo
		System.out.println("Exercicio empr�stimo por m�todos");
		Emprestimo.calcular( 1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular( 1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular( 1000, 5);
		}

}
