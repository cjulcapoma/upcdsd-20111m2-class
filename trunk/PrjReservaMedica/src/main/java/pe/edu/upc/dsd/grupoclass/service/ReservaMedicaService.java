package pe.edu.upc.dsd.grupoclass.service;

import java.util.ArrayList;
import java.util.Date;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.edu.upc.dsd.grupoclass.bean.DoctorBean;
import pe.edu.upc.dsd.grupoclass.bean.HorarioDoctorBean;
import pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean;

@WebService
public interface ReservaMedicaService {

	public boolean registrarReservaMedica(ReservaMedicaBean reservaMedicaBean);

	public boolean verificarDisponibilidadDoctor(
			@WebParam(name = "idDoctor") int idDoctor,
			@WebParam(name = "fechaHora") Date fechaHora);

	public boolean actualizarDisponibilidadDoctor(int idDoctor, Date fechaHora);

	public ReservaMedicaBean obtenerReservaPaciente(String dni);

}
