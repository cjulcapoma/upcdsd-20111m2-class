package pe.edu.upc.dsd.grupoclass.data;

import java.util.ArrayList;

import pe.edu.upc.dsd.grupoclass.bean.DoctorBean;
import pe.edu.upc.dsd.grupoclass.bean.HorarioDoctorBean;
import pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean;

public class DataClass {
	
	public static ArrayList<String> listarSucursales(){
		ArrayList<String> listaSucursales = new ArrayList();
		listaSucursales.add("Sucursal San Borja");
		
		return listaSucursales;
	}
	
	public static ArrayList<String> listarEspecialidades(){
		ArrayList<String> listaEspecialidades = new ArrayList();
		listaEspecialidades.add("Medicina General");
		
		return listaEspecialidades;
	}
	
	public static ArrayList<DoctorBean> listarDoctores(){
		ArrayList<DoctorBean> listaDoctores = new ArrayList();
		
		return listaDoctores;
	}
	
	public static ArrayList<HorarioDoctorBean> listarHorariosDoctor(){
		ArrayList<HorarioDoctorBean> listaHorariosDoctor = new ArrayList();
		
		return listaHorariosDoctor;
	}

	
}
