package Bootcamp1;

public class Emprestimo {
	
	public static double quantidadeParcelas(double quantidadeParcelas ) {
		return quantidadeParcelas;
	}
	
	public static double parcela(double parcelas) {
		return parcelas;
	}
   
	public static double taxas(double taxas) {
		return taxas;
	}
	
	
	
	public static void calculo(double taxas,double parcelas) {
	      double resultado = parcelas + parcelas * taxas;
	      
	      System.out.println("o valor da parcela do emprestimo é "  + "R$" +resultado);
	}
	
	public static void valorFinal(double quantidadeParcelas, double parcelas, double taxas) {
		double resultadoFinal = quantidadeParcelas * (parcelas * taxas);
		
		System.out.println("O valor final do emprestimo é   "  + "R$" + resultadoFinal);
	}
	  
}

