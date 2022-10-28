package tads;

import java.util.ArrayList;

public class StackStr<T> {
	
	ArrayList<T> datos;
	
	public StackStr() {
		datos = new ArrayList<>();
		
	}
	
	public void push (T dato) {
		datos.add(dato);
	}
	
	public T pop() {
		if(!isEmpty()) {	
			return datos.remove(datos.size()-1);
		}else {
			return null;
		}		
	}
	
	public int size() {
		return datos.size();
	}
	
	public T peek() {
		return datos.get(datos.size() - 1);
	}
	
	public Boolean isEmpty() {
		return this.size() < 0;
 	}
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		

	}

}
