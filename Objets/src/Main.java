import java.util.ArrayList;

public class Main {

		Atencion[] atenciones;
	
	//clase veterinaria
	
	public ArrayList <Atencion> atencionesMasCostosas(double costoMin){
		ArrayList<Atencion> lst = new ArrayList<Atencion>();
		int cont =0;
		for(Atencion a : atenciones) {
			cont++;
			for(Medicamento m : a.medicamentos) {
				if(m.costoMayor(m.precio, costoMin)){
					//agregamos a la lista
				}
			}			
		}		
		return lst;		
	}

	
	//clase medicamentos
	public boolean costoMayor(double precio, double costomin) {
		if(precio > costomin) {
			return true;
		}
		return false;
	}
	
	
	
	
//clase Atencion
	
	public int atencionesCriticas(int antiguedadMinima) {
		ArrayList<Atencion> lstAntiguedad = new ArrayList<Atencion>();
		Veterinario[] veterinarios = null;
		
		int cont = 0;
		for(Atencion a : atenciones) {
		for(Veterinario v : veterinarios ) {
			if(antiguedadMayor(v.antiguedad, antiguedadMinima)) {
					//lstAngiguedad.add(v);
				}
			}
		}
	}	
	//clase veterinario
	
	public boolean antiguedadMayor(int a, int m) {
		if(a>m) {
			return true;
		}
		return false;
	}
	
	
	

	
	
	
	
	
	
	
	
	
}
