package atividade05;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Random sortNum = new Random();

        int[][] matriz = new int[3][4];

        int total = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = sortNum.nextInt(21);
                if (matriz[i][j] >= 15 && matriz[i][j] <= 21) {
                    System.out.println("matriz[" + i + "][" + j + "]=" + matriz[i][j]);
                    total++;
                }
            }
        }

        System.out.println("Quantidade de números entre 15 e 20: " + total);

    

	}

}
