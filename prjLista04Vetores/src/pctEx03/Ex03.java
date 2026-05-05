package pctEx03;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = {5, 12, 3, 9, 21, 7};
		int maior = vetor[0];
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				
			}
		}
		System.out.println("Maior valor: " + maior);
	}

}
