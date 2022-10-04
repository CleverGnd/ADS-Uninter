package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int peso;
		double altura;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite peso: ");
		peso = teclado.nextInt();
		System.out.println("Digite altura: ");
		altura = teclado.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("IMC = %.2f", imc);

	}

}
