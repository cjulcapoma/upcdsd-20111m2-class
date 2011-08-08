package pe.edu.upc.dsd.grupoclass.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import pe.edu.upc.dsd.grupoclass.bean.DoctorBean;

public class ConstantesDao {

	public static ArrayList<String[]> listarMedicamentos(){
		ArrayList<String[]> listaMedicamentos = new ArrayList();
		
		listaMedicamentos.add(new String[]{"M001","Panadol"});
		listaMedicamentos.add(new String[]{"M002","Clotrimazol"});
		listaMedicamentos.add(new String[]{"M003","Flumil"});
		
		return listaMedicamentos;
	}
	
	public static ArrayList<String[]> listaExamenesMedicos(){
		ArrayList<String[]> listaExamenesMedicos = new ArrayList();
		
		listaExamenesMedicos.add(new String[]{"E001","Radriografia"});
		listaExamenesMedicos.add(new String[]{"E002","Ecografia"});
		listaExamenesMedicos.add(new String[]{"E003","Tomografia"});
		
		return listaExamenesMedicos;
	}
	
	public static ArrayList<String> listarSucursales(){
		ArrayList<String> listaSucursales = new ArrayList();
		
		listaSucursales.add("Sucursal San Borja");
		
		return listaSucursales;
	}
	
	public static ArrayList<String> listarEspecialidades(){
		ArrayList<String> listaEspecialidades = new ArrayList();
		
		listaEspecialidades.add("Medicina General");		
		listaEspecialidades.add("Oftamología");
		listaEspecialidades.add("Traumatología");
		
		return listaEspecialidades;
	}
	
	public static ArrayList<DoctorBean> listarDoctores(){
		ArrayList<DoctorBean> listaDoctores = new ArrayList();
		DoctorBean doctor1 = new DoctorBean();
		
		doctor1.setIdDoctor(1);
		doctor1.setNoDoctor("Rafael Juan");
		doctor1.setNoEspecialidad("Medicina General");
		doctor1.setNoSucursal("Sucursal San Borja");
		doctor1.setDeHorario("Lunes y Miercoles de 10:00-12:00");
		
		DoctorBean doctor2 = new DoctorBean();
		
		doctor2.setIdDoctor(2);
		doctor2.setNoDoctor("Juan Luis");
		doctor2.setNoEspecialidad("Oftamología");
		doctor2.setNoSucursal("Sucursal San Borja");
		doctor2.setDeHorario("Martes y Jueves de 10:00-12:00");
		listaDoctores.add(doctor2);

		DoctorBean doctor3 = new DoctorBean();
		
		doctor3.setIdDoctor(3);
		doctor3.setNoDoctor("Juan Carlos");
		doctor3.setNoEspecialidad("Traumatología");
		doctor3.setNoSucursal("Sucursal San Borja");
		doctor3.setDeHorario("Viernes de 14:00-16:00");
		listaDoctores.add(doctor3);

		return listaDoctores;
	}
	
}
