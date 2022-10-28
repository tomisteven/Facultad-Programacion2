import java.util.ArrayList;

public class Sector {
	ArrayList<Auto> _estacionados;
	Integer _capacidad;
	Integer _costoXHora;
	String _tipo;

	Sector(Integer c, String t, Integer costo) {
		_capacidad = c;
		_estacionados = new ArrayList<Auto>();
		_costoXHora = costo;
		_tipo = t;
	}
	public void agregarAuto(Auto a) {
//		auto = new Auto(p);
		if(!validar(a)) {
			_estacionados.add(a);
		}
		else {
			throw new RuntimeException("Ingreso invalido");
		}
	}

	private boolean validar(Auto a) {
		for(int i = 0 ; i<tamanio();i++) {
			if(inesimo(i).get_patente().equals(a.get_patente()) || estaLleno()) {
				return true;
			}
		}
		return false;
	}
	private boolean estaLleno() {
		return tamanio() > _capacidad;
	}
	private int tamanio() {
		return _estacionados.size();
	}
	public Auto inesimo(int elem) {
		return _estacionados.get(elem);
	}

//	private boolean pertenece(Auto a) {
//		return _estacionados.contains(a);
//	}
	public int get_capacidad() {
		return _capacidad;
	}

	public void set_capacidad(Integer _capacidad) {
		this._capacidad = _capacidad;
	}

}
