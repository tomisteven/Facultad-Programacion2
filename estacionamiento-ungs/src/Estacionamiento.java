import java.util.ArrayList;

public class Estacionamiento {
	public static void main(String[] args) {
		
		Estacionamiento e = new Estacionamiento();
		e.agregarAuto("AAA111", "general");
		e.agregarAuto("AAA333", "general");
		e.agregarAuto("AAA222", "estudiante");
		e.agregarAuto("AAA333", "profesor");
		e.agregarAuto("AAA444", "estudiante");
		e.verEstacionamiento();
		e.buscarAuto("AAA111");
	}
	
	private void buscarAuto(String string) {
		
		
	}

	//array de estacionamiento 
	ArrayList<Object> general = new ArrayList<>();
	ArrayList<String> estudiantes = new ArrayList<>();
	ArrayList<String> profesores = new ArrayList<>();
		

	//private Auto auto;

	int capacidadMaxima;
	int total;
	

	public Estacionamiento() {
		
		this.capacidadMaxima = 200;
	}
	
	
	public void agregarAuto(String patente, String sector) {
		if(general.size() + profesores.size()  + estudiantes.size() > capacidadMaxima) {
			throw new RuntimeException("estacionamiento Lleno");
		}
		
		Auto a = new Auto(patente, 9);
		
		if(sector.equals("general")) {
			general.add(a);
		}
		if(sector.equals("profesor")) {
			profesores.add(a.get_patente());
		}
		if(sector.equals("estudiante")) {
			estudiantes.add(a.get_patente());
		}
	}
	
	public void verEstacionamiento() {
		for (int i = 0; i < general.size(); i++) {
			System.out.println("General: " + general.get(i));
		}
	for (int i = 0; i < profesores.size(); i++) {
			System.out.println("Profesores: " + profesores.get(i));
	}
		for (int i = 0; i < estudiantes.size(); i++) {
		System.out.println("Estudiantes: " + estudiantes.get(i));		}
	}
	
	
	
	public void salirAuto(String p, Sector tipo) {
		
	}
	public int totalRecaudado() {
		return total;
	}
	public boolean horarioEstacionado(String patente, Integer hora) {
		
		return true;
	}

}
