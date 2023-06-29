package aula2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int num = entrada.nextInt();
		int cont = 0;
		while (cont <= num) {
			if (cont % 2 != 0) {
				System.out.print(cont);
			}
			cont++;
		}
		cont = 1;
		while(cont <= num) {
			if (cont % 2 == 0) {
				System.out.print(cont);
			}
		cont++;
		}
	}

}
