package arbolbinario;

public class Test {

	public static void main(String[] args) {
		AbInt arbol1 = new AbInt();
		
		arbol1.agregarNodo(4);
		arbol1.agregarNodo(5);
		arbol1.agregarNodo(4);
		arbol1.agregarNodo(5);
		arbol1.agregarNodo(4);
		arbol1.agregarNodo(5);
		arbol1.agregarNodo(8);
		
		System.out.println("cantidad de nodos:" + arbol1.cantNodos());
		System.out.println(arbol1.toString());
		System.out.println("altura:" + arbol1.altura());
		System.out.println(arbol1.algunoEs8());
		
	}

}
