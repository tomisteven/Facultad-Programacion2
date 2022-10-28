package recursion;

public class Recursividad {
	
	//Escribir una funcion recursiva int log(int n, int b) que calcule la cantidad de veces que se puede
	//dividir sucesivamente (con division entera) el n´umero n por b hasta obtener 0. Se puede suponer
	//que n y b son positivos. Por ejemplo:
	
	//n=8 y b=2 debe devolver 4, ya que 8 /2 → 4/2→ 2/2→ 1/2→ 0
	
	public static int log(int n, int b) {
		if(n / b == 0) {
			return 1;
		}
		
		return 1 + log(n/b ,b);
		
	}
	
	public static String guiones(int n) {
		String s = "";
		for(int i = 0; i < n; i++) {
			s+= "-";
		}
		return s;
	}
	
	public static void escalones(int n) {
			if(n == 0) {
				System.out.println(guiones(n));
				return;
			}
			
			escalones(n-1);			
			System.out.println(guiones(n));
			return;			
	}
	
	
	//Escribir una funci´on recursiva String letrasMayores(String s1, String s2) que toma dos Strings s1 y s2 y retorna
	//una nueva cadena que en cada posici´on tiene el caracter de esa posici´on de s1 o de s2 que sea mayor en el
	//orden del diccionario. Si uno de los Strings es m´as largo que el otro, al final aparecer´an los caracteres del
	//String m´as largo. Por ejemplo:
	
	//letrasMayores(”aazz”, ”bubu”) debe devolver ”buzz”.
	
	public static String resto(String palabra) {
		String s = "";
		
		for(int i = 1; i < palabra.length(); i++) {
			s += palabra.charAt(i)+ "";
		}
		return s;
		
	}

	public static String letrasMayores(String s1, String s2) {
		if(s1.isEmpty() || s2.isEmpty()) {
			return s1+s2;
		}		
		if(s1.charAt(0) >= s2.charAt(0)) {
			return "" + s1.charAt(0)+ letrasMayores(resto(s1), resto(s2));
		}		
		return s2.charAt(0) + "" + letrasMayores(resto(s1), resto(s2));				
	}
	
	
	//Escribir una funci´on recursiva public static String intercalarDespuesDe(String s, char c, String t)
	//que devuelve un String igual a s en el cual por cada aparici´on de la letra c se incorpor´o una letra del String t. 
	//Por ejemplo:
	
	//intercalarDespuesDe("banana”, ’a’, ”ooo”) debe devolver ”baonaonao”
	//intercalarDespuesDe(””, ’h’, ”luz”) debe devolver ” ”.
	//intercalarDespuesDe(”perro”, ’r’, ”x”) debe devolver ”perxro”.
	
	public static String intercalarDespuesDe(String s, char c, String t) {
		if(s.isEmpty() || t.isEmpty()) {
			return s;
		}
		
		if(s.charAt(0) == c ) {
			return ""+ s.charAt(0) + intercalarDespuesDe(resto(s), c, resto(t))+ t.charAt(0);
		}
		
		return "" + s.charAt(0) +  t.charAt(0) +intercalarDespuesDe(resto(s), c, resto(t)) ;
	
			
	}
	
		
	public static void imprimirN(int x, int i) {
		if(i <= x) {
			System.out.print(x + " ");
			imprimirN(x - 1, i);
		}
		
	}
	
	public static String invertirPalabra(String palabra, int i) {
		
		if(i == 0) {
			return invertirPalabra(palabra, i - 1)  + palabra.charAt(i) ;
		}
		else {
			return palabra.charAt(i) + "";
		}
		
	}
	
	
	public static void main(String[] args) {
		//System.out.println(log(5,6));
		//escalones(5);
		//System.out.println(resto("tomas"));
		
//		System.out.println(letrasMayores("tomas", "steven"));
//		
//		System.out.println(intercalarDespuesDe("perro", 'r', "x"));
//		
//		imprimirN(5,1);
		System.out.println(invertirPalabra("tomas", 1));
		
	}

	
	
	
}
