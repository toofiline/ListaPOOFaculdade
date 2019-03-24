package atividade07;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[15];
		int i;

		
		for (i = 0; i < num.length; i++) {
			System.out.printf("Informe o %2d° número de %d: ", (i+1), num.length);
			num[i] = sc.nextInt();

		}
		System.out.println("");
		System.out.println("São pares:");
		Arrays.sort(num);
		for(i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
				System.out.printf("[%d] ",num[i]);
                
            }
        }


		sc.close();
	}

}
