package pe.edu.upc.dsd.grupoclass.bean;

public class AfiliadoBean {
	public String nombre;
	public String apellido;
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int dni;
	public double desConsulta;
	public double desMedicina;
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getDesConsulta() {
		return desConsulta;
	}

	public void setDesConsulta(double desConsulta) {
		this.desConsulta = desConsulta;
	}

	public double getDesMedicina() {
		return desMedicina;
	}

	public void setDesMedicina(double desMedicina) {
		this.desMedicina = desMedicina;
	}

}
