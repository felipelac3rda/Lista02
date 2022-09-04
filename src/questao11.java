import java.util.Scanner;

public class questao11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i = 0;
		int j = 0;
		int a = 3;
		int b = 3;
		int cont = 0;
		int cont2 = 0;

		for (int c = 0; c <= 0;) {
			System.out.print(i + " - " + j + "\n");
			if (j != 2) {
				j++;
			}

			if (j == 2) {
				j = 0;
			}

			cont2++;
			if (cont2 == 4) {
				j = 2;
				cont2 = -1;

			}
			cont++;
			if (cont == 5) {
				i++;
				cont = 0;
			}
			if (i == a + 1) {
				i = 0;
				c++;
			}
		}
	}
}