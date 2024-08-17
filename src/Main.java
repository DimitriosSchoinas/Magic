import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		char[] nipes;

		int k = 0;

		nipes = in.nextLine().toCharArray();

		int salto = in.nextInt();
		in.nextLine();

		Magia magia = new Magia(salto, nipes);

		do {
			int v = in.nextInt();
			if (v == 0) {
				in.close();
				return;
			}
			char[] n;
			n = in.next().toCharArray();
			in.nextLine();

			System.out.println(magia.numCartaAnterior(v) + " " + magia.nipeAnterior(n));
			k++;
		} while (k < 20);

	}

}
