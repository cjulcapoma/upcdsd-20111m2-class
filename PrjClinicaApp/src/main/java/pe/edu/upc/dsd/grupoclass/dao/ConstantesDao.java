package pe.edu.upc.dsd.grupoclass.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import pe.edu.upc.dsd.grupoclass.bean.DoctorBean;

public class ConstantesDao {
	
	static ArrayList<String[]> listaMedicamentos = new ArrayList<String[]>();
	static ArrayList<String[]> listaExamenesMedicos = new ArrayList<String[]>();
	static ArrayList<String> listaSucursales = new ArrayList<String>();
	static ArrayList<String> listaEspecialidades = new ArrayList<String>();
	static ArrayList<DoctorBean> listaDoctores = new ArrayList<DoctorBean>();

	public ConstantesDao(){
		//Inicializar Medicamentos
		listaMedicamentos.add(new String[]{"M001","Panadol"});
		listaMedicamentos.add(new String[]{"M002","Clotrimazol"});
		listaMedicamentos.add(new String[]{"M003","Flumil"});
		
		//Inicializar Examenes
		listaExamenesMedicos.add(new String[]{"E001","Radriografia"});
		listaExamenesMedicos.add(new String[]{"E002","Ecografia"});
		listaExamenesMedicos.add(new String[]{"E003","Tomografia"});
		
		//Inicializar Sucursales
		listaSucursales.add("Sucursal San Borja");
		listaSucursales.add("Sucursal Los Olivos");
		listaSucursales.add("Sucursal San Isidro");
		
		//Inicializar Especialidades
		listaEspecialidades.add("Medicina General");		
		listaEspecialidades.add("Oftamolog�a");
		listaEspecialidades.add("Traumatolog�a");
		
		//Inicializar Doctores
		DoctorBean doctor1 = new DoctorBean();		
		doctor1.setIdDoctor(1);
		doctor1.setNoDoctor("Rafael Juan");
		doctor1.setNoEspecialidad("Medicina General");
		doctor1.setNoSucursal("Sucursal San Borja");
		doctor1.setDeHorario("Lunes y Miercoles de 10:00-12:00");
		listaDoctores.add(doctor1);
		
		DoctorBean doctor2 = new DoctorBean();		
		doctor2.setIdDoctor(2);
		doctor2.setNoDoctor("Juan Luis");
		doctor2.setNoEspecialidad("Oftamolog�a");
		doctor2.setNoSucursal("Sucursal San Borja");
		doctor2.setDeHorario("Martes y Jueves de 10:00-12:00");
		listaDoctores.add(doctor2);

		DoctorBean doctor3 = new DoctorBean();		
		doctor3.setIdDoctor(3);
		doctor3.setNoDoctor("Juan Carlos");
		doctor3.setNoEspecialidad("Traumatolog�a");
		doctor3.setNoSucursal("Sucursal San Borja");
		doctor3.setDeHorario("Viernes de 14:00-16:00");
		listaDoctores.add(doctor3);		
	}
	
 	public ArrayList<String[]> listarMedicamentos(){		
		return listaMedicamentos;
	}
	
	public ArrayList<String[]> listaExamenesMedicos(){
		return listaExamenesMedicos;
	}
	
	public ArrayList<String> listarSucursales(){			
		return listaSucursales;
	}
	
	public ArrayList<String> listarEspecialidades(){	
		return listaEspecialidades;
	}
	
	public ArrayList<DoctorBean> listarDoctores(){
		return listaDoctores;
	}

	public String obtenerNombreMedicamentoPorCodigo(String codMedicamento){
		String noMedicamento=" ";
		for(String medicina[] : listaMedicamentos){
			if(medicina[0].equals(codMedicamento)){
				noMedicamento = medicina[1];
				break;
			}
		}		
		return noMedicamento;
	}

	public String obtenerNombreExamenPorCodigo(String codExamen){
		String noExamen=" ";
		for(String examen[] : listaExamenesMedicos){
			if(examen[0].equals(codExamen)){
				noExamen = examen[1];
				break;
			}
		}		
		return noExamen;
	}
}
