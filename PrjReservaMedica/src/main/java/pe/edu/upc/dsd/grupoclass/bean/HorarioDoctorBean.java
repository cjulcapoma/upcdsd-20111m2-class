package pe.edu.upc.dsd.grupoclass.bean;

import java.util.Date;

public class HorarioDoctorBean {

	private int idDoctor;  
	private String fecha;
	private String hora;
	private boolean indReserva;
	
	public int getIdDoctor() {
		return idDoctor;
	}
	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public boolean isIndReserva() {
		return indReserva;
	}
	public void setIndReserva(boolean indReserva) {
		this.indReserva = indReserva;
	}
	

}
