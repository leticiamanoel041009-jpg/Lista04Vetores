package pctEx04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int[] vetor = {2, 5, 8, 11, 16, 19, 22};
		int contador = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Insira um valor: ");
			vetor[i] = receba.nextInt();
			
		}
        System.out.println("Quantidade de números pares: " + contador);


	}

}
