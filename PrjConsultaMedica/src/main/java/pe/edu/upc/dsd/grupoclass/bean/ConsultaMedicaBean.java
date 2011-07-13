package pe.edu.upc.dsd.grupoclass.bean;

import java.util.Date;

public class ConsultaMedicaBean {

	private int idConsultaMedica;
	private Date fechaConsulta;
	private String nombrePaciente;
	private String detalleConsulta;
	
	public int getIdConsultaMedica() {
		return idConsultaMedica;
	}
	public void setIdConsultaMedica(int idConsultaMedica) {
		this.idConsultaMedica = idConsultaMedica;
	}
	public Date getFechaConsulta() {
		return fechaConsulta;
	}
	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
	public String getNombrePaciente() {
		return nombrePaciente;
	}
	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	public String getDetalleConsulta() {
		return detalleConsulta;
	}
	public void setDetalleConsulta(String detalleConsulta) {
		this.detalleConsulta = detalleConsulta;
	}
}
