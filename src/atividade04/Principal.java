package atividade04;



public class Principal {

	public static void main(String[] args) {
	        
	        
	        NumeroPrimo primo = new NumeroPrimo();
	        
	        System.out.println("Os números primos são:");
	        for(int i=0; i<primo.vetor.length; i++){
	            if(primo.NPrimo(primo.vetor[i])){
	                System.out.printf("[%d] ",primo.vetor[i]);
	            } else {
	                
	            }
	        }

	}
}
	