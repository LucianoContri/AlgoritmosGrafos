package lista;

import lista.matriz;
import lista.lista;

public class main {
	public static void main(String[] args) {
		matriz a = new matriz();
		int j;
		j = a.criaArco(0, 2);
		j = a.criaArco(0, 3);
		j = a.criaArco(0, 4);
		j = a.criaArco(1, 2);
		j = a.criaArco(1, 4);
		j = a.criaArco(2, 4);
		j = a.criaArco(3, 4);
		j = a.criaArco(3, 5);
		j = a.criaArco(4, 5);
		j = a.criaArco(5, 1);
		j = a.mostra(1);
		System.out.printf("\nnumero de arcos=%d", a.a);
		lista d = new lista();
		Integer visit[] = new Integer[6];
		Integer cont = 0;
		Integer v;
		int pa;
		for (int i = 0; i < 6; i++) {
			visit[i] = -1;

		}
		int r;
		r = d.QUEUEinit(0);
		visit[0] = cont++;
		d.QUEUEput(0);
		while (d.QUEUEempty() != 0) {

			v = d.QUEUEget();
			pa = v;
			for (int x = 0; x < 6; x++) {
				if (a.matriz[pa][x] == 1) {
					if (visit[x] == -1) {
						
						visit[x] = cont++;
						
					
						
						d.QUEUEput(x);
					}
				}
			}

		}
		for(int i=0;i<6;i++) {
		System.out.printf(" %d : %d   ",i,visit[i]);	
			
		}

	}
}
