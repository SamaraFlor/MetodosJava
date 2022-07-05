package BootCamp2;

public class Quadrilatero {

	//Área = base × altura
	//Área = (diagonal 1 × diagonal 2)/2 
	
	public static double area(double lado) {
		 return lado* lado;
      
	}
	
	 public static double area(double lado1, double lado2) {
		 	return lado1*lado2;
	    
	    }

	    public static double area(double baseMaior, double baseMenor, double altura) {
	    	return ((baseMaior+baseMenor) * altura)/2;
	     
	    }

	    public static void area(float diagonal1, float diagonal2) {
	        System.out.println("Área do losango:" + (diagonal1 * diagonal2)/2);
	    }

	

}
