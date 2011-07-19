package pe.edu.upc.dsd.grupoclass.data;

import java.util.ArrayList;

public class DataClass {

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
	
}
