package pe.edu.upc.dsd.grupoclass.bean;

public class ExamenConsultaBean {

	private int idExamenMedico;
	private String coExamenMedico;
	private String noExamen;
	private int cantidad;
	private String resultado;
	
	public int getIdExamenMedico() {
		return idExamenMedico;
	}
	public void setIdExamenMedico(int idExamenMedico) {
		this.idExamenMedico = idExamenMedico;
	}
	public String getCoExamenMedico() {
		return coExamenMedico;
	}
	public void setCoExamenMedico(String coExamenMedico) {
		this.coExamenMedico = coExamenMedico;
	}
	public String getNoExamen() {
		return noExamen;
	}
	public void setNoExamen(String noExamen) {
		this.noExamen = noExamen;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}	
}
