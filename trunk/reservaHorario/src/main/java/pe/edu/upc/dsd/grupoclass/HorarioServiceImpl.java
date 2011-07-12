package pe.edu.upc.dsd.grupoclass;

import javax.jws.WebService;


@WebService(endpointInterface = "pe.edu.upc.dsd.grupoclass.HorarioService")
public class HorarioServiceImpl implements HorarioService{

			@Override
			public String consultaHorario(String nombre) {
				return "Horario " + nombre;
			}
			@Override
			public String realizarReserva(String nombre) {
				return "Se reservo " + nombre;
			}


		}


