package pe.edu.upc.dsd.grupoclass.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.edu.upc.dsd.grupoclass.bean.DoctorBean;
import pe.edu.upc.dsd.grupoclass.bean.HorarioDoctorBean;
import pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean;
import pe.edu.upc.dsd.grupoclass.data.DataClass;
import pe.edu.upc.dsd.grupoclass.service.ReservaMedicaService;

@WebService(endpointInterface = "pe.edu.upc.dsd.grupoclass.service.ReservaMedicaService")
public class ReservaMedicaServiceImpl implements ReservaMedicaService {

	public ArrayList<String> listaSucursales;
	public ArrayList<String> listaEspecialidades;
	public ArrayList<DoctorBean> listaDoctores;
	public ArrayList<HorarioDoctorBean> listaHorariosDoctor;

	public ArrayList<ReservaMedicaBean> listaReservasMedicas = new ArrayList();

	public ReservaMedicaServiceImpl() {
		listaSucursales = DataClass.listarSucursales();
		listaEspecialidades = DataClass.listarEspecialidades();
		listaDoctores = DataClass.listarDoctores();
		listaHorariosDoctor = DataClass.listarHorariosDoctor();
	}

	public boolean registrarReservaMedica(ReservaMedicaBean reservaMedicaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verificarDisponibilidadDoctor(int idDoctor, Date fechaHora) {
		// TODO Auto-generated method stub
		// Revisar horario Doctor
		for (HorarioDoctorBean horario : listaHorariosDoctor) {
			if (horario.getIdDoctor() == idDoctor
					&& horario.getFechaHora().equals(fechaHora)) {
				return false;
			}
		}
		// Revisar reservas realizadas
		for (ReservaMedicaBean reserva : listaReservasMedicas) {
			if (reserva.getDoctor().getIdDoctor() == idDoctor
					&& reserva.getFechaHoraReserva().equals(fechaHora)
					&& reserva.isIndReserva()) {
				return false;
			}
		}
		return true;
	}

	public boolean actualizarDisponibilidadDoctor(int idDoctor, Date fechaHora) {
		// TODO Auto-generated method stub
		for (ReservaMedicaBean reserva : listaReservasMedicas) {
			if (reserva.getDoctor().getIdDoctor()== idDoctor
					&& reserva.getFechaHoraReserva().equals(fechaHora)) {
				reserva.setIdReservaMedica(1);
				return true;
			}
		}
		return false;
	}

	public ReservaMedicaBean obtenerReservaPaciente(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean actualizarReservaAtendida(int idReserva) {
		// TODO Auto-generated method stub
		return false;
	}

}
