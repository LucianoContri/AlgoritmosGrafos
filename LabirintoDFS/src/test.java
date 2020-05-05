
public class test {
	
	
	 public static void DfsRecursivo(int [][] matriz , int v){
		 int w;
		 profundidade++; 
		 pre[v]=cont++;
		 Pilha.push(v);
		 for(w=0;w < (matriz.length - 1);w++) {
			 if(w==y && matriz[v][w] !=0) {
				QtdCaminhos++;
			 }
			 
			 if(w==y && profundidadeMinima==0){
				 PilhaFinal.addAll(Pilha);
				 profundidadeMinima=profundidade;
			 }
			 if(w==y && profundidadeMinima>profundidade) {
				 while(!PilhaFinal.empty()) {
					 PilhaFinal.pop();
				 }
				 PilhaFinal.addAll(Pilha);
			 }
			 if(matriz[v][w] !=0 && pre[w]==-1){
				 DfsRecursivo(matriz, w);
			     }
			 } 
		 Pilha.pop();
		 profundidade--;
		 }

}
