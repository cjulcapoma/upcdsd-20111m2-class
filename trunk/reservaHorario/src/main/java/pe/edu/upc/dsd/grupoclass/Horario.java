package pe.edu.upc.dsd.grupoclass;

import javax.jws.WebService;


@WebService(endpointInterface = "pe.edu.upc.dsd.grupoclass.Horario")
public class Horario implements HorarioService{

			@Override
			public String hora(String nombre) {
				return "Hola " + nombre;
			}

		}


