package pe.edu.upc.dsd.grupoclass;

import javax.jws.WebService;

@WebService
public interface HorarioService {
	public String consultaHorario(String nombre);
	public String realizarReserva(String nombre);
	
}
