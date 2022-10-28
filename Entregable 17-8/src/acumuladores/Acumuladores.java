package acumuladores;

public class Acumuladores {

	public static void main(String[] args) {
		
//		int[][] aux = { 
//				{  1,  9,  6,  31 }, 
//				{  9, 12, 18, 18 }, // todos multiplos de 3
//				{ 15, 14,  9, 30 } };

	}
	
	//EJERCICIO 1
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int i) {
		//si la matriz ezta vacia o el numero no es positivo devuelve false
		if( mat.length == 0 || i <= 0) {
			System.out.println("vacio y negativo");
			return false;
		}
		boolean esMul = false; 
		for (int f = 0; f < mat.length; f++) {
			esMul = esMul || filaEsMultiplo(mat, f, i);
		}
		System.out.println("multiplo: " + esMul);
		return esMul;
	}

	//FUNCIONES AUXILIARES EJERCICIO 1
	public boolean filaEsMultiplo(int [][] mat, int f, int i) {
		boolean ret = true;
		for (int j = 0; j < mat[0].length; j++) {
			ret = ret && esMultiplo(mat[f][j], i);
		}	
		return ret;
	}
	public boolean esMultiplo(int i, int i2) {	
		return i%i2 == 0;		
	}

	//EJERCICIO 2
	public boolean hayInterseccionPorFila(int[][] mat1, int[][] mat2) {
		//verificar si estan vacias las atrices
		if(mat1.length == 0 || mat2.length == 0 || mat1.length != mat2.length) return false;
		
		boolean hayInter = true; 
		
		for (int f = 0; f < mat1.length; f++) {
			hayInter = hayInter && hayInterseccion(mat1, mat2, f);
		}
		
		
		System.out.println(hayInter);
		return hayInter;
	}
	//FUNCIONES AUXILIARES EJERCICIO 2
	public boolean hayInterseccion(int[][] mat1, int[][] mat2, int fila) {
		boolean ret = false;
		
		for (int col = 0; col < mat1[0].length; col++) {
			ret = ret || estaEnFila(mat2, mat1[fila][col], fila);
		}		
		return ret;		
	}	
	public boolean estaEnFila(int[][] mat1, int valor, int fila) {
		boolean ret = false;
		for (int col = 0; col < mat1[0].length; col++) {
			ret = ret || mat1[fila][col] == valor;
		}
		return ret;

	}

	//EJERCICIO 3
	public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) {
		
		if(mat.length < nColum || mat.length == 0 || nColum < 0) return false;
		
		boolean sumaMas = false;
		int suma = sumaColumna(mat , nColum);
		for (int f = 0; f < mat.length; f++) {
			sumaMas = sumaMas || sumaFila(mat, f) > suma;
		}
		
		return sumaMas;
	}
	
	//FUNCIONES AUXILIARES EJERCICIO 3

	private int sumaFila(int[][] mat, int fila) {
		int sumF = 0;		
		for (int c= 0; c < mat[0].length; c++) {
			sumF = sumF + mat[fila][c];
		}				
		return sumF;
	}
	

	public int sumaColumna(int[][] mat, int c) {		
		int n = 0;		
		for (int fila = 0; fila < mat.length; fila++) {
			n = n + mat[fila][c];
		}			
		return n;
	}

	
	//EJERCICIO 4
	public boolean hayInterseccionPorColumna(int[][] mat1, int[][] mat2) {
		if(mat1.length == 0 || mat2.length == 0 || mat1[0].length != mat2[0].length) return false;
		boolean hayInter = true;
			
		for (int colMat1 = 0; colMat1 < mat2[0].length; colMat1++) {
			hayInter = hayInter && recorrerColum(colMat1, mat1, mat2);
		}
		
		return hayInter;
	}
	//FUNCIONES AUXILIARES EJERCICIO 4

	public boolean recorrerColum(int col, int[][] mat1, int[][] mat2) {
		
		boolean ret = false; 
		
		for (int fila = 0; fila < mat1.length; fila++) {
			ret = ret || hayInterseccion(col, mat2, mat1[fila][col]);
		}
		
		return ret;
	}

	private boolean hayInterseccion(int num, int[][] mat2, int valor) {
		boolean ret = false;
		
		for (int f = 0; f < mat2.length; f++) {
			ret = ret || mat2[f][num] == valor;
		}
		
		
		return ret;
	}

	
	

}
