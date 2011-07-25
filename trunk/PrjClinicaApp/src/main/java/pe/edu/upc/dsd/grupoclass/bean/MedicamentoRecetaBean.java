package pe.edu.upc.dsd.grupoclass.bean;

public class MedicamentoRecetaBean {

	private int idMedicamento;
	private String coMedicamento;
	private String noMedicamento;
	private int cantidad;
	private double precio;
	
	public int getIdMedicamento() {
		return idMedicamento;
	}
	public void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
	}
	public String getCoMedicamento() {
		return coMedicamento;
	}
	public void setCoMedicamento(String coMedicamento) {
		this.coMedicamento = coMedicamento;
	}
	public String getNoMedicamento() {
		return noMedicamento;
	}
	public void setNoMedicamento(String noMedicamento) {
		this.noMedicamento = noMedicamento;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
