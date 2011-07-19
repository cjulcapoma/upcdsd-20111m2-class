package pe.edu.upc.dsd.grupoclass.bean;

public class DoctorBean {
	
	private int idDoctor;
	private String noDoctor;
	private String noSucursal;
	private String noEspecialidad;
	private String deHorario;
	
	public String getDeHorario() {
		return deHorario;
	}
	public void setDeHorario(String deHorario) {
		this.deHorario = deHorario;
	}
	public int getIdDoctor() {
		return idDoctor;
	}
	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}
	public String getNoDoctor() {
		return noDoctor;
	}
	public void setNoDoctor(String noDoctor) {
		this.noDoctor = noDoctor;
	}
	public String getNoSucursal() {
		return noSucursal;
	}
	public void setNoSucursal(String noSucursal) {
		this.noSucursal = noSucursal;
	}
	public String getNoEspecialidad() {
		return noEspecialidad;
	}
	public void setNoEspecialidad(String noEspecialidad) {
		this.noEspecialidad = noEspecialidad;
	}
	
}
