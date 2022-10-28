package arbolbinario;

import java.lang.ProcessHandle.Info;

public class AbInt {
	
	private Nodo raiz;
	
	public class Nodo{
		
		private Integer info;
		private Nodo izquierda;
		private Nodo derecha;
		public Nodo(Integer info) {
			this.info = info;
		}
		@Override
		public String toString() {
			return info.toString();
		}	
	}

	
	//--------------- METODOS DE ARBOL RAIZ --------------
	
	public boolean algunoEs8() {
		return algunoEs8(raiz);
	}
	
	
	
	private boolean algunoEs8(Nodo raiz) {
		if(raiz == null) return false;
		return algunoEs8(raiz.derecha);
	}



	public int altura() {
		return altura(raiz);
	}
	
	public int altura(Nodo n) {
		//si es nulo..
		if (n == null) return 0;
		//sino.. 
		return 1 + Math.max(altura(n.derecha), altura(n.izquierda));
	}
	
	
	public int cantNodos() {
		return cantNodos(raiz);
	}
	
	public int cantNodos(Nodo n) {
		if(n == null) return 0;
		else return 1 + cantNodos(n.izquierda) + cantNodos(n.derecha);
	}
	
	public void agregarNodo(int valor) {
		if(raiz == null) raiz = new Nodo(valor);
		else agregarNodo(raiz, valor);
	}
	
	public void agregarNodo(Nodo n, int valor) {
		//asuminos que n no es null
		if(n.derecha == null) n.derecha = new Nodo(valor);
		else agregarNodo(n.derecha, valor);
	}
	@Override
	public String toString() {
		return toString(raiz);
	}
	
	
	String toString(Nodo n) {
		String ret = "";
		if(n != null) {
			ret = ret + n.info + ",";
			ret = ret + toString(n.derecha);
			ret = ret + toString(n.izquierda);
		}
		return ret;
	}
	
	

}
