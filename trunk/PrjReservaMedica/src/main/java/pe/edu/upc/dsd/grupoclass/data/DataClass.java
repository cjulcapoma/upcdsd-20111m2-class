package pe.edu.upc.dsd.grupoclass.data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import pe.edu.upc.dsd.grupoclass.bean.DoctorBean;
import pe.edu.upc.dsd.grupoclass.bean.HorarioDoctorBean;

public class DataClass {
		
	public static ArrayList<HorarioDoctorBean> listarHorariosDoctor(){
		ArrayList<HorarioDoctorBean> listaHorariosDoctor = new ArrayList();
		HorarioDoctorBean hdoctor1_h1 = new HorarioDoctorBean();
		Date fecha1 = new Date();
		Calendar cal = GregorianCalendar.getInstance();
		cal.set(2011,07,17,8,0,0);
		fecha1 = cal.getTime();
		hdoctor1_h1.setIdDoctor(1);
		hdoctor1_h1.setFechaHora(fecha1);
		hdoctor1_h1.setIndReserva(false);
		listaHorariosDoctor.add(hdoctor1_h1);
		
		return listaHorariosDoctor;
	}

	
}
