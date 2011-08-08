package pe.edu.upc.dsd.grupoclass.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
			@WebParam(name = "fecha") String fecha, 
			@WebParam(name = "hora") String hora);
	public boolean actualizarDisponibilidadDoctor(
			@WebParam(name = "idDoctor") int idDoctor, 
			@WebParam(name = "fecha") String fecha, 
			@WebParam(name = "hora") String hora);
	public ReservaMedicaBean obtenerReservaPaciente(String dni);	
	public boolean actualizarReservaAtendida(int idReserva);
	public List<ReservaMedicaBean> obtenerReservasMedicas();
}
