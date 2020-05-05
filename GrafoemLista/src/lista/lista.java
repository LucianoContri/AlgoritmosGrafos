package lista;

import java.util.ArrayList;
import java.util.List;

public class lista {

	List<Integer> vetor = new ArrayList<>();
	int iniciado;

	public lista() {
		iniciado = 0;

	}

	public int QUEUEinit(Integer v) {
		if (iniciado == 0) {
			iniciado = 1;

		}

		return 1;
	}

	public int QUEUEput(Integer v) {
		if (iniciado == 0) {
			iniciado = 1;
		}
		vetor.add(v);

		return 1;

	}

	public Integer QUEUEget() {
		Integer v;

		v = vetor.remove(0);

		return v;
	}

	public int QUEUEempty() {
		int i = 1;
		if (vetor.isEmpty()) {
			i = 0;
		}
		return i;

	}

	public int QUEUEfree() {
		vetor.clear();

		return 1;
	}

}
