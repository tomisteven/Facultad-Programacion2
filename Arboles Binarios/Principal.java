package ler;

public class Principal {

	public static void main(String[] args) {
		
		/*
		 * Probamos agregar(..)
		 */

		ListaR<Integer> l1 = new ListaR<Integer>();
		ListaR<Integer> l2 = new ListaR<Integer>();	
		
		System.out.println(l2);
		
		l2.agregarR(3);  // agregar recursivo
		l2.agregarR(2);
		l2.agregarR(3);
		l2.agregarR(4);
		l2.agregarRP(8,1); // agregar P recursivo
		l2.agregarRP(9,3); // agregar P recursivo
		
		System.out.println(l2);

		/*
		 * Probamos eliminar(..)
		 */		

		ListaEnlazada<Integer> lista1 = new ListaEnlazada<Integer>();
		ListaEnlazada<Integer> lista2 = new ListaEnlazada<Integer>();
		

		for(int i = 0; i < 10; i++) {
			lista1.agregar(i);
			lista2.agregar(i);
			if(i == 5) {
				lista1.agregar(1);
				lista2.agregar(1);
			}
		}
		lista1.agregar(1);
		lista2.agregar(1);
		
		System.out.println(lista);
		lista.eliminarRecursivo(1);
		System.out.println(lista);

	}

}
