package aula3;

public class exercicio4 {

	public static void main(String[] args) {
	//A)

		int[] arrayA = new int[10];
		int count = 10;

		for (int i = 0; i < arrayA.length; i++) {
		    arrayA[i] = count;
		    count--;
		}

		for (int i = 0; i < arrayA.length; i++) {
		    System.out.print(arrayA[i] + " ");
		}
		System.out.println();

	//b)

		int[] arrayB = new int[11];
	
		for (int i = 0; i < arrayB.length; i++) {
		    arrayB[i] = i * i;
		}
	
		for (int i = 0; i < arrayB.length; i++) {
		    System.out.print(arrayB[i] + " ");
		}
		System.out.println();

	//c)

		int[] arrayC = new int[10];
		int conta = 1;

		for (int i = 0; i < arrayC.length; i++) {
		    if (i < 5) {
		        arrayC[i] = count;
		        count++;
		    } else {
		        arrayC[i] = count * 10;
		        count++;
		    }
		}

		for (int i = 0; i < arrayC.length; i++) {
		    System.out.print(arrayC[i] + " ");
		}
		System.out.println();

	//d)

		int tamanho = 10;
		int[] array = new int[tamanho];

		int valorInicial = 3;
		array[0] = valorInicial;

		for (int i = 1; i < tamanho; i++) {
		array[i] = array[i-1] + (i+1);
		}

		for (int i = 0; i < tamanho; i++) {
		System.out.print(array[i] + " ");
		}
	}

}
