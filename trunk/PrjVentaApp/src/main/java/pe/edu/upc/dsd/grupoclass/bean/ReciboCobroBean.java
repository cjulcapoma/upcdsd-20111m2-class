package pe.edu.upc.dsd.grupoclass.bean;

import java.io.Serializable;

public class ReciboCobroBean implements Serializable{
	
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dniPaciente;
	private String noPaciente;
	private String noSucursal;
	private String noEspecialidad;
	private String noDoctor;
	private String indSeguro;
	private String porDescuento;
	private double mntPagar;	
	private double mntDescuento;
	private double mntTotPagar;
	private double mntPagado;
	private double mntVuelto;
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
	public String getNoDoctor() {
		return noDoctor;
	}
	public void setNoDoctor(String noDoctor) {
		this.noDoctor = noDoctor;
	}
	public String getIndSeguro() {
		return indSeguro;
	}
	public void setIndSeguro(String indSeguro) {
		this.indSeguro = indSeguro;
	}
	public String getPorDescuento() {
		return porDescuento;
	}
	public void setPorDescuento(String porDescuento) {
		this.porDescuento = porDescuento;
	}
	public double getMntPagar() {
		return mntPagar;
	}
	public void setMntPagar(double mntPagar) {
		this.mntPagar = mntPagar;
	}
	public double getMntDescuento() {
		return mntDescuento;
	}
	public void setMntDescuento(double mntDescuento) {
		this.mntDescuento = mntDescuento;
	}
	public double getMntTotPagar() {
		return mntTotPagar;
	}
	public void setMntTotPagar(double mntTotPagar) {
		this.mntTotPagar = mntTotPagar;
	}
	public double getMntPagado() {
		return mntPagado;
	}
	public void setMntPagado(double mntPagado) {
		this.mntPagado = mntPagado;
	}
	public double getMntVuelto() {
		return mntVuelto;
	}
	public void setMntVuelto(double mntVuelto) {
		this.mntVuelto = mntVuelto;
	}
		
}
