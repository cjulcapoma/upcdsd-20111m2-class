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
		HorarioDoctorBean hdoctor;
		
		hdoctor = new HorarioDoctorBean();		
		hdoctor.setIdDoctor(1);
		hdoctor.setFecha("10/10/2011");
		hdoctor.setHora("10:00");
		hdoctor.setIndReserva(true);
		listaHorariosDoctor.add(hdoctor);
		
		hdoctor = new HorarioDoctorBean();
		hdoctor.setIdDoctor(1);
		hdoctor.setFecha("10/10/2011");
		hdoctor.setHora("10:30");
		hdoctor.setIndReserva(true);
		listaHorariosDoctor.add(hdoctor);
		
		hdoctor = new HorarioDoctorBean();
		hdoctor.setIdDoctor(1);
		hdoctor.setFecha("10/10/2011");
		hdoctor.setHora("11:00");
		hdoctor.setIndReserva(true);
		listaHorariosDoctor.add(hdoctor);
		
		hdoctor = new HorarioDoctorBean();
		hdoctor.setIdDoctor(1);
		hdoctor.setFecha("10/10/2011");
		hdoctor.setHora("11:30");
		hdoctor.setIndReserva(true);
		listaHorariosDoctor.add(hdoctor);


		hdoctor = new HorarioDoctorBean();		
		hdoctor.setIdDoctor(2);
		hdoctor.setFecha("11/10/2011");
		hdoctor.setHora("10:00");
		hdoctor.setIndReserva(true);
		listaHorariosDoctor.add(hdoctor);
		
		hdoctor = new HorarioDoctorBean();
		hdoctor.setIdDoctor(2);
		hdoctor.setFecha("11/10/2011");
		hdoctor.setHora("10:30");
		hdoctor.setIndReserva(true);
		listaHorariosDoctor.add(hdoctor);
		
		hdoctor = new HorarioDoctorBean();
		hdoctor.setIdDoctor(2);
		hdoctor.setFecha("11/10/2011");
		hdoctor.setHora("11:00");
		hdoctor.setIndReserva(true);
		listaHorariosDoctor.add(hdoctor);
		
		hdoctor = new HorarioDoctorBean();
		hdoctor.setIdDoctor(2);
		hdoctor.setFecha("11/10/2011");
		hdoctor.setHora("11:30");
		hdoctor.setIndReserva(true);
		listaHorariosDoctor.add(hdoctor);			
				
		return listaHorariosDoctor;
	}
		
}
