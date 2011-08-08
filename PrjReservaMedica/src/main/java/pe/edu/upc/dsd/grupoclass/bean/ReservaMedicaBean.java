package pe.edu.upc.dsd.grupoclass.bean;

import java.util.Date;

public class ReservaMedicaBean {

	private int idReservaMedica;
	private Date fechaHoraReserva;
	private DoctorBean doctor;
	private String dniPaciente;
	private String noPaciente;
	private boolean indReserva;
		
	public boolean isIndReserva() {
		return indReserva;
	}
	public void setIndReserva(boolean indReserva) {
		this.indReserva = indReserva;
	}	
	
	public int getIdReservaMedica() {
		return idReservaMedica;
	}
	public void setIdReservaMedica(int idReservaMedica) {
		this.idReservaMedica = idReservaMedica;
	}
	public Date getFechaHoraReserva() {
		return fechaHoraReserva;
	}
	public void setFechaHoraReserva(Date fechaHoraReserva) {
		this.fechaHoraReserva = fechaHoraReserva;
	}
	public DoctorBean getDoctor() {
		return doctor;
	}
	public void setDoctor(DoctorBean doctor) {
		this.doctor = doctor;
	}
	public String getDniPaciente() {
		return dniPaciente;
	}
	public void setDniPaciente(String dniPaciente) {
		this.dniPaciente = dniPaciente;
	}
	public String getNoPaciente() {
		return noPaciente;
	}
	public void setNoPaciente(String noPaciente) {
		this.noPaciente = noPaciente;
	}
}
