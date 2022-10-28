
public class Auto {
	private String _patente;
	private Integer _horaEntrada;
	private Integer _horaSalida;
	
	
	//_matricula tiene que cumplir el formato de las matriculas argentinas

	public static boolean validarPatente(String s) {
		if (s.isEmpty() || s.length() != 6) {
			return false;
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!(c >= 'A' && c <= 'Z') && i < s.length() / 2) {
				return false;
			}
			if (!(c >= '0' && c <= '9') && i >= s.length() / 2) {
				return false;
			}
		}
		return true;
	}
	
	
	public static boolean rangoHorario(int horario) {
		return horario %1 == 0 && horario>=0 && horario <= 23; 
	}

	public Auto(String patente, Integer horaEntrada) {

		if(validarPatente(patente)) {
			_patente = patente;
		}else {
			throw new RuntimeException("Patente invalida");
		}
		if(!rangoHorario(horaEntrada)) {
			throw new RuntimeException("horario invalido");
		}
		_horaEntrada = horaEntrada;
		

	}

	public String get_patente() {
		return _patente;
	}

	public Integer get_horaEntrada() {
		return _horaEntrada;
	}

	public Integer get_horaSalida() {
		return _horaSalida;
	}

}
