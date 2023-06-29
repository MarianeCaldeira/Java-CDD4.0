package aula2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos: ");
		int resp = entrada.nextInt();
		int total = resp;
		double nota = 0;
		double soma = 0;
		double media = 0;
		while (resp > 0) {
			System.out.print("Digite a nota: ");
			nota = entrada.nextDouble();
			soma = soma + nota;
			resp--;
		}
		media = soma/total;
		System.out.print("A media da turma é " + media);
	}
}
