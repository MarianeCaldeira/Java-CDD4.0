package aula3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		int quantidadeAlunos = 5;
        double[] notas = new double[quantidadeAlunos];
        double soma = 0;
        double media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as notas dos alunos:");

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Aluno " + (i+1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        media = soma / quantidadeAlunos;

        System.out.println("A média da turma é: " + media);

        scanner.close();
	}

}
