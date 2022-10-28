package ler;




/*
 
Integer dato;
Integer dato2;

Nodo nodo1 = new Nodo(dato);
Nodo nodo2 = new Nodo(dato2);
 
nodo1.siguiente = nodo2

Lista lista = new Lista()
lista.primero = nodo1

aux = Lista.primero

Nodo nodo3 = Nodo(dato)
while aux.siguiente != null
	aux = aux.siguiente

aux.siguiente = nodo3
 
 
 */
public class ListaR<T> {
	private Nodo<T> _primero;
	private int _tamano;  // lo tenemos precalculado
	
	public ListaR() {	
		_tamano=0;
	}
	
	public int tamano() {
		return _tamano;
	}
	
	public void agregar(T valor) {
		Nodo<T> nuevo = new Nodo<T>(valor);
		_tamano++;
		if (_primero == null) {
			_primero = nuevo;
		}else {
			Nodo<T> aux = _primero;
			
			while (aux.siguiente != null) {
				aux = aux.siguiente;
			}
			aux.siguiente = nuevo;
		}
	}


	public void agregarR(T valor) {
		_tamano++;
		Nodo<T> nuevo = new Nodo<T>(valor);
		if (_primero == null) {
			_primero = nuevo;
		}else {
			agregarR(_primero, nuevo);
		}
	}
	
	public void agregarR(Nodo<T> padre, Nodo<T> nuevo) {
		if (padre.siguiente == null) {
			padre.siguiente = nuevo;
		}else {
			agregarR(padre.siguiente, nuevo);
		}
	}
	
	//pre:  pos < _tamano
	// al menos hay un nodo!
	public void agregarRP(T valor, int pos) {
		if (pos >= _tamano) {
			throw new RuntimeException("posicion invalida");
		}
		_tamano++;
		Nodo<T> nuevo = new Nodo<T>(valor);	
		
		if (pos == 0) {
			nuevo.siguiente = _primero;
			_primero = nuevo;
		}else {
			agregarRP(_primero, nuevo, pos-1);
		}		
	}

	public void agregarRP(Nodo<T> padre, Nodo<T> nuevo, int pos) {
		if (pos == 0) {
			nuevo.siguiente = padre.siguiente;
			padre.siguiente = nuevo;		
		}else {
			agregarRP(padre.siguiente, nuevo, pos-1);
		}
			
	}

	public void eliminar(T value) {
		Nodo<T> actual = _primero;
		while(actual != null) {
			if(actual.siguiente != null && actual.siguiente._valor.equals(value)) {
				actual.siguiente = actual.siguiente.siguiente;
			} else {
				actual = actual.siguiente;
			}
		}

		/*
		 * Verifica el primer elemento, que no es checkeado antes
		 */
		if(_primero._valor.equals(value))
			_primero = _primero.siguiente;
	}
	
	public void eliminarRecursivo(T value) {
		eliminarRecursivo(_primero, value);

		/*
		 * Verifica el primer elemento, que no es checkeado antes
		 */
		if(_primero._valor.equals(value))
			_primero = _primero.siguiente;
	}
	
	
	private void eliminarRecursivo(Nodo<T> nodo, T value) {
		if(nodo != null) {
			/*
			 * Si esto no esta arriba y tenemos una lista de todos elementos iguales,
			 * va a pasar lo mismo con el primero. el nodo actual no se verifica, y quedan
			 * elementos sin eliminar
			 */
			eliminarRecursivo(nodo.siguiente, value);
											
			if(nodo.siguiente != null && nodo.siguiente._valor.equals(value)) {
				nodo.siguiente = nodo.siguiente.siguiente;
			}
		}
	}
	
	
	@Override
	public String toString() {
		Nodo<T> aux = _primero;
		StringBuilder sb = new StringBuilder();
		
		while (aux != null) {
			sb.append(aux._valor.toString() + ",");
			aux = aux.siguiente;
		}
		
		return  _tamano + ":" + sb.toString();
	}
}
