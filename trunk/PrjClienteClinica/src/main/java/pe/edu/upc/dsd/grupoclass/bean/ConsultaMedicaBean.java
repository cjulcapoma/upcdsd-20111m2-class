package pe.edu.upc.dsd.grupoclass.bean;

import java.util.Date;
import java.util.List;

public class ConsultaMedicaBean {

	private int idConsultaMedica;
	private Date fechaHoraConsulta;
	
	private int idReservaMedica;
	private DoctorBean doctor;
	private String dniPaciente;
	private String noPaciente;
	
	private String diagnostico;
	private String tratamiento;
	
	private List<MedicamentoRecetaBean> listaMedicamentos;
	private List<ExamenConsultaBean> listaExamenes;
	
	public List<MedicamentoRecetaBean> getListaMedicamentos() {
		return listaMedicamentos;
	}
	public void setListaMedicamentos(List<MedicamentoRecetaBean> listaMedicamentos) {
		this.listaMedicamentos = listaMedicamentos;
	}
	public List<ExamenConsultaBean> getListaExamenes() {
		return listaExamenes;
	}
	public void setListaExamenes(List<ExamenConsultaBean> listaExamenes) {
		this.listaExamenes = listaExamenes;
	}	
	
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	public int getIdConsultaMedica() {
		return idConsultaMedica;
	}
	public void setIdConsultaMedica(int idConsultaMedica) {
		this.idConsultaMedica = idConsultaMedica;
	}
	public Date getFechaHoraConsulta() {
		return fechaHoraConsulta;
	}
	public void setFechaHoraConsulta(Date fechaHoraConsulta) {
		this.fechaHoraConsulta = fechaHoraConsulta;
	}
	public int getIdReservaMedica() {
		return idReservaMedica;
	}
	public void setIdReservaMedica(int idReservaMedica) {
		this.idReservaMedica = idReservaMedica;
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
