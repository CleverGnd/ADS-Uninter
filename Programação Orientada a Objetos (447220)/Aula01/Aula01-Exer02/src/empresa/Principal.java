package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int palpite, ValorCorreto = 10000;
		double altura;
		String msg;
		
		System.out.println("Digite seu palpite: ");
		palpite = teclado.nextInt();
		
		while (palpite != ValorCorreto) {
			
			msg = palpite > ValorCorreto? "Um pouco menos ...": "Um pouco mais ...";
			System.out.println(msg);
			/* if (palpite > ValorCorreto) {
				System.out.println("Um pouco menos ...");
			}
			else {
				System.out.println("Um pouco mais ...");
			} */
			System.out.println("Digite outro palpite: ");
			palpite = teclado.nextInt();
		}
		System.out.println("Parabéns, você acertou!");

	}

}
