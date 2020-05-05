import java.util.Stack;

public class Main {
	public static int [] pre= new int[7];
	public static int profundidade = 0;
	public static int QtdCaminhos = 0;
	public static int x,y,cont = 0;
	public static int profundidadeMinima = 0;
    public static Stack<Integer> Pilha = new Stack<Integer>();
	public static Stack<Integer> PilhaFinal = new Stack<Integer>();
	
	
	
	public static void main(String[] args) {
		   int [][] matriz= new int [7][7]; 
		   x=0;
		   y=5;
		  
		   inicializarmatriz(matriz, 5);
		   addaresta(matriz,0,2);
		   addaresta(matriz,1,2);
		   addaresta(matriz,1,3);
		   addaresta(matriz,2,3);
		   addaresta(matriz,2,5);
		   addaresta(matriz,3,4);
		   addaresta(matriz,4,5);
		   printar(matriz, 6);
		   Dfs(matriz,0);
		   System.out.println( "quantidade de caminhos possíveis:" + QtdCaminhos );
		   System.out.print( "melhor caminho:" );
		   while(!PilhaFinal.empty()) {
		     System.out.print( PilhaFinal.pop() + " ");
		   }
		 
		   
		   
		   
		  }
		  public static void inicializarmatriz(int[][] matriz,int v){
		    int i ,j;
		    for(i=0;i <v ;i++){
		      for(j=0;j <v ;j++){
		        matriz[i][j]=0;
		      }
		    }
		  }

		  public static void printar(int[][] matriz , int v){
		    int i ,j;
		     System.out.println( "  0 1 2 3 4 5");
		    for(i=0;i<v ;i++){
		      System.out.print(i + " ");
		      for(j=0;j<v ;j++){

		        System.out.print( matriz[i][j] + " ");

		  }
		  System.out.print("\n");
		  }
		}
		 public static void addaresta(int[][] matriz , int v , int w)
		 {
		if(v!=w && matriz[v][w] == 0){
		  matriz[v][w] = 1;
		}

		 }
		 
		 public static void Dfs(int [][] matriz, int x) {
		    int v;
			for(v=0;v<matriz.length;v++) {
			pre[v] = -1;
		}
		DfsRecursivo(matriz,x);
		 }
		 
		 public static void DfsRecursivo(int [][] matriz , int v){
			 System.out.println("entro recursivo, V="+ v);
			 int w;
			 profundidade++; 
			 pre[v]=cont++;
			 
			 System.out.println("entro for, profundidade"+ profundidade);
			 Pilha.push(v);
			 for(w=0;w < (matriz.length - 1);w++) {
				 System.out.println("entro for, w="+ w);
				  if(w==y && matriz[v][w] !=0) {
					QtdCaminhos++;
				 }
				 
				 if(w==y && profundidadeMinima==0){
					 System.out.println("entrou if primeira profundidade");
					 PilhaFinal.addAll(Pilha);
					 profundidadeMinima=profundidade;
				 }
				 if(w==y && profundidadeMinima>profundidade) {
					 System.out.println("entrou segundo if");
					 while(!PilhaFinal.empty()) {
						 PilhaFinal.pop();
					 }
					 PilhaFinal.addAll(Pilha);
					 profundidadeMinima=profundidade;
				 }
				 if(matriz[v][w] !=0 && pre[w]==-1){
					
					 System.out.println("saindo");
					 DfsRecursivo(matriz, w);
				     }
				 } 
			 Pilha.pop();
			 profundidade--;
			 }
			
			 
        }
		 
		 
		 
		 
		 
		 
		 
		 
	