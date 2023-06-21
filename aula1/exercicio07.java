package fundamentos;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double resp = entrada.nextDouble();
		System.out.println(resp);
		
		if(resp < 0)
			System.out.println("Número é negativo");
		else
			System.out.println("Número é positivo!");
	}

}
