package tads;

public class Historial {
	
	public static void main(String[] args) {
		
		StackStr<String> urls = new StackStr<>();
		urls.push("google");
		System.out.println(urls.peek());
		urls.push("fb");
		System.out.println(urls.peek());
	
	}
	private StackStr<String> urls;
	
	public Historial() {
		urls = new StackStr<>();
	}
	
	public String actual() {
		return urls.peek();
	}
	
	public void atras() {
		urls.pop();
	}
	
	public void navegar(String url) {
		urls.push(url);
	}
	


}
