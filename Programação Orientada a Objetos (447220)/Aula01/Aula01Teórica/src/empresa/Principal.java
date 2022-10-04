package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int idade = 10;
		
		idade = idade +2;
		double peso = 72.5;
		float peso2 = 85.20f;
		String nome = "Mario";
		// Float é mais leve mas menos preciso que o double
		
		System.out.println("Idade: " + idade);
		System.out.printf("Idade: %d\n", idade);
		System.out.printf("Peso: %.2f\n", peso);
		System.out.printf("Peso: %.3f\n", peso2);
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite Idade: ");
		idade = teclado.nextInt();
		System.out.println("Digite Peso: ");
		peso = teclado.nextDouble();
		System.out.println("Digite Nome: ");
		nome = teclado.next();
		
		System.out.println("Nome: " + nome);
		System.out.printf("Idade: %d\n", idade);
		System.out.printf("Peso: %.2f\n", peso);

		
		System.out.println("Alo, mundo!");
		System.out.println("Alo, mundão!");
		
		if (idade <18) {
			System.out.println("Acesso Bloqueado!");
		}
		else if (idade <65) {
			System.out.println("Adulto!");
		}
		else {
			System.out.println("Adulto Idoso!");
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("Valor: " + i);
		}
		
		// Array tipo uma Lista
		
		int megaSena[] = {11,14,21,30,37,56};
		
		megaSena[0] = 10;
	}

}
