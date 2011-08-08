package pe.edu.upc.dsd.grupoclass.service.impl;

import java.text.SimpleDateFormat;
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
	
	SimpleDateFormat sdfFecha = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdfHora = new SimpleDateFormat("hh:MM");

	public ArrayList<HorarioDoctorBean> listaHorariosDoctor;
	public ArrayList<ReservaMedicaBean> listaReservasMedicas = new ArrayList();

	public ReservaMedicaServiceImpl() {
		listaHorariosDoctor = DataClass.listarHorariosDoctor();
	}

	public boolean registrarReservaMedica(ReservaMedicaBean reservaMedicaBean) {
		reservaMedicaBean.setIdReservaMedica(listaReservasMedicas.size()+1);
		listaReservasMedicas.add(reservaMedicaBean);
		return true;
	}

	public boolean verificarDisponibilidadDoctor(int idDoctor, 
			String fecha, String hora) {
		boolean resultado = false;
		for(HorarioDoctorBean horarioDoctor : listaHorariosDoctor){
			if(horarioDoctor.getIdDoctor()==idDoctor && 
					horarioDoctor.getFecha().equals(fecha) &&
					horarioDoctor.getHora().equals(hora) &&
					horarioDoctor.isIndReserva()){
				resultado = true;
				break;
			}
		}
		return resultado;
	}

	public boolean actualizarDisponibilidadDoctor(int idDoctor, 
			String fecha, String hora) {
		boolean resultado = false;
		for(HorarioDoctorBean horarioDoctor : listaHorariosDoctor){
			if(horarioDoctor.getIdDoctor()==idDoctor && 
					horarioDoctor.getFecha().equals(fecha) &&
					horarioDoctor.getHora().equals(hora) &&
					horarioDoctor.isIndReserva()){
				horarioDoctor.setIndReserva(false);
				resultado=true;
				break;
			}
		}
		return resultado;
	}

	public ReservaMedicaBean obtenerReservaPaciente(String dni) {
		for (ReservaMedicaBean reserva : listaReservasMedicas) {
			if (reserva.getDniPaciente().equals(dni) 
					&& reserva.isIndReserva()) {
				return reserva;
			}
		}
		return null;
	}

	@Override
	public boolean actualizarReservaAtendida(int idReserva) {
		for (ReservaMedicaBean reserva : listaReservasMedicas) {
			if (reserva.getIdReservaMedica()==idReserva) {
				reserva.setIndReserva(false);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<ReservaMedicaBean> obtenerReservasMedicas() {
		// TODO Auto-generated method stub
		return listaReservasMedicas;
	}

}
