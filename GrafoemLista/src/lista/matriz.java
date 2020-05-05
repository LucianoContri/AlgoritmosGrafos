package lista;

public class matriz {
	Integer v;
	Integer a;
	Integer matriz[][] = new Integer[6][6];

	public matriz() {
		v = 6;
		a = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				matriz[i][j] = 0;

			}

		}

	}

	public int criaArco(int i, int j) {
		matriz[i][j] = 1;
		
		if (i != j) {
			a++;
		}

		return 1;

	}

	public int mostra(int i) {

		for (int j = 0; j < 6; j++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d \n", matriz[j][0], matriz[j][1], matriz[j][2], matriz[j][3],
					matriz[j][4], matriz[j][5]);
		}

		return 1;
	}
}
