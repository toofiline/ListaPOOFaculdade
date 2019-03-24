package atividade02;

import java.util.Scanner;

import atividade02.Operacao;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Operacao calc = new Operacao();
		
		System.out.println("Digite o seu Salario:");
        calc.salario = sc.nextDouble();
        
        double porcent = calc.porcentagem();
        double novoSal = calc.novoSalario();
        
        
        System.out.printf("Valor do aumento foi de: %.2f%n", porcent);
        System.out.printf("Com o aumento o salário foi para: %.2f%n", novoSal);
        sc.close();
		
	}

}
