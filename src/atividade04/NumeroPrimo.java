package atividade04;

public class NumeroPrimo {
	
	int[] vetor = {1,2,3,4,5,7,8,9,10,
    		11,12,13,14,15};
	protected boolean NPrimo(int numero){

        boolean NPrimo = false;
        int contador=0;

        for(int i=1; i<=numero; i++){
            if(numero%i==0){
                contador++;
            }
        }

        if(contador == 2){
            NPrimo = true;
        }

        return NPrimo;
    }
}

