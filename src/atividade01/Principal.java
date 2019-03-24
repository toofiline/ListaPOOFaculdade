package atividade01;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import atividade01.Operacao;

public class Principal {
	public static void main(String[] args) {
		Locale ptBr = new Locale("pt", "BR");
		Scanner sc = new Scanner(System.in);
		
		Operacao operacao = new Operacao();
		
		System.out.println("Valor do Salário Mínimo: ");
        operacao.salarioMin = sc.nextFloat();
                             
        System.out.println("Horas Trabalhadas no Mês: ");
        operacao.horasTrab = sc.nextFloat();
        
        System.out.println("Número de Dependentes: ");
        operacao.numDep = sc.nextInt();
        
        System.out.println("Quantidade de Horas Extras: ");
        operacao.qtdHorasExt = sc.nextFloat();
        
        
        
        double valorHoraExt = operacao.valorHoraExt();
        double enviaBonus = operacao.enviaBonus();
        double salarioBruto = operacao.salarioBruto();
        double bolsaDepend = operacao.bolsaDepend();
        double impostoRenda = operacao.impostoRenda();
        double salarioLiq = operacao.salarioLiq();
        
        String fHoraExt = NumberFormat.getCurrencyInstance(ptBr).format(valorHoraExt);
        String fEnviaBonus = NumberFormat.getCurrencyInstance(ptBr).format(enviaBonus);
        String fSalarioBruto = NumberFormat.getCurrencyInstance(ptBr).format(salarioBruto);
        String fBolsaDepend = NumberFormat.getCurrencyInstance(ptBr).format(bolsaDepend);
        String fIRenda = NumberFormat.getCurrencyInstance(ptBr).format(impostoRenda);
        String fSalarioLiq = NumberFormat.getCurrencyInstance(ptBr).format(salarioLiq);
        
        System.out.println("");
        System.out.println("***** RESULTADO *****");
		System.out.println("Valor Horas Extras: "+ fHoraExt);
		System.out.println("Bolsa Dependente: " +fBolsaDepend);
		System.out.println("Seu bônus é de: " +fEnviaBonus);
		System.out.println("Salário Total Bruto: " +fSalarioBruto);
		System.out.println("Valor do IR: - " +fIRenda);
        System.out.println("Salário Total Liquido: " +fSalarioLiq );
        
        sc.close();
	}
	

}
