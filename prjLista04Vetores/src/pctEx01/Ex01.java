package pctEx01;
import java.util.Scanner;


public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
        int[] vetor = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = receba.nextInt();
        }

        System.out.println("Valores digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
        }


	}

}
