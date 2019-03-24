package atividade03;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

        float media, totalRep = 0, totalExa = 0 , totalApro = 0, totalMed = 0;

        // Declara e instancia de Aluno
        Aluno aluno01 = new Aluno();
        Aluno aluno02 = new Aluno();

        System.out.println("Digite a nota 1 do Aluno 1:");
        aluno01.Nota1 = ler.nextFloat();
        System.out.println("Digite a nota 2 do Aluno 1:");
        aluno01.Nota2 = ler.nextFloat();

        System.out.println("Digite a nota 1 do Aluno 2:");
        aluno02.Nota1 = ler.nextFloat();
        System.out.println("Digite a nota 2 do Aluno 2 :");
        aluno02.Nota2 = ler.nextFloat();
        
        ler.close();
        
        aluno01.imprimeNotas();
        media = (aluno01.Nota1 + aluno01.Nota2) / 2;
        totalMed = totalMed + media;
        System.out.println("Média do Aluno - " + media);
    
        if (media < 3) {
            System.out.println("*** Reprovado ***");
            totalRep++;
        } else if (media >= 3 && media < 7) {
            System.out.println("*** Exame ***");
            totalExa++;
        } else {
            System.out.println("*** Aprovado ***");
            totalApro++;
        }

        aluno02.imprimeNotas();
        media = (aluno02.Nota1 + aluno02.Nota2) / 2;
        totalMed = totalMed + media;
        System.out.println("Média do Aluno - " + media);

       if (media < 3) {
            System.out.println("*** Reprovado ***");
            totalRep++;
        } else if (media >= 3 && media < 7) {
            System.out.println("*** Exame ***");
            totalExa++;
        } else {
            System.out.println("*** Aprovado ***");
            totalApro++;
        }
       
        System.out.println("\n\n*** RESULTADO ***");
        System.out.println("Total de Aprovados: " + totalApro);    
        System.out.println("Total de Exame: " + totalExa);        
        System.out.println("Total de Reprovados: " + totalRep);
        System.out.println("Media da Classe: " + totalMed/2);
        
	}

}
