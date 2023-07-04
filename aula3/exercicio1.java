package aula3;

public class exercicio1 {

	public static void main(String[] args) {
		int soma = 0;
		for(int i = 1; i < 20; i++) {
			if (i % 3 == 0){
				System.out.println("Multiplos de 3: " + i);
				soma = i + soma;
				System.out.println("Soma" + soma);
			}
			if (i % 5 == 0) {
				System.out.println("Multiplos de 5: " + i);
			}
		}
	}

}
