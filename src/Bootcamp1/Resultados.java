package Bootcamp1;

public class Resultados {

	public static void main(String[] args) {
		
	 System.out.println("Resultados Calculos");
	 Calcular.soma(12.90, 21.87);
	 Calcular.divisao(34.98, 43.00);
	 Calcular.multiplicacao(23.45, 36.78);
	 Calcular.subtracao(32.46, 28.98);
	 
	 System.out.println("Resultados Mensagem");
	 Mensagem.mostrarMensagem(09.00);
	 Mensagem.mostrarMensagem(12.00);
	 Mensagem.mostrarMensagem(21.00);
	 
	 System.out.println("Emprestimo");
	 Emprestimo.calculo(908.00, 1.88);
	 Emprestimo.valorFinal(989.00, 4, 1.99);
	}
	
	

}
