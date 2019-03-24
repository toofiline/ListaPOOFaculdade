package atividade02;

public class Operacao {
	protected double salario;
	
	
	protected double porcentagem() {
		if(salario <=300) {
			return salario * 0.15;
            }
        
        else if(salario >300 && salario <=600) {
        	return salario * 0.10;
        }
        
        else if(salario >600 && salario <=900) {
        	return salario * 0.05;
        }
        
        else {
            return 0;
        }
	}
	
	protected double novoSalario() {
		return salario + porcentagem() ;
	}
		
		
	}
