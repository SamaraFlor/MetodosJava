package Bootcamp1;

public class Mensagem {

	
	public static void mostrarMensagem(double hora) {
		
		if (hora < 12.00) {
		  System.out.println("Bom dia");
		}
		if (hora > 12.00) {
			  System.out.println("Boa Tarde");
			}
		if (hora > 19.00) {
			  System.out.println("Boa Noite");
			}
		
	}
}
