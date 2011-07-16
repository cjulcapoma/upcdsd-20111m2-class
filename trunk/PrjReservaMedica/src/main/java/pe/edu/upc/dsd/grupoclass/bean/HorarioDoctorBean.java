package pe.edu.upc.dsd.grupoclass.bean;

import java.util.Date;

public class HorarioDoctorBean {

	public int idDoctor;
	public Date fechaHora;
	public boolean indReserva;
	
	public int getIdDoctor() {
		return idDoctor;
	}
	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}
	public Date getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
	public boolean isIndReserva() {
		return indReserva;
	}
	public void setIndReserva(boolean indReserva) {
		this.indReserva = indReserva;
	}
}
