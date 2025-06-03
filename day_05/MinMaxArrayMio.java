package day_05;

public class MinMaxArrayMio {

	public static void main(String[] args) {
		int[] numeri = { 27, 5, 18, 20, 3, 7, 11, 4 };

		if (numeri.length == 0) {
			System.out.println("L'array è vuoto!");
			return;
		}

		int massimo = numeri[0];
		int minimo = numeri[0];

		for (int i = 1; i < numeri.length; i++) {
			if (numeri[i] > massimo) {
				massimo = numeri[i];
			}

			if (numeri[i] < minimo) {
				minimo = numeri[i];
			}
		}

		System.out.println("Array: ");
		for (int i = 0; i < numeri.length; i++) {
			System.out.print(numeri[i] + " ");
		}
		System.out.println();
		System.out.println("Valore massimo: " + massimo);
		System.out.println("Valore minimo: " + minimo);
	}

	public static void trovaMaxMin(int[] array) {
		if (array.length == 0) {
			System.out.println("Array vuoto!");
			return;
		}

		int max = array[0];
		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}

		System.out.println("Massimo: " + max + ", Minimo: " + min);
	}
}