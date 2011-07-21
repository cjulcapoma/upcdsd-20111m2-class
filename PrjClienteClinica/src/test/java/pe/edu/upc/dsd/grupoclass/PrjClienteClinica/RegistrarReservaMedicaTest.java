package pe.edu.upc.dsd.grupoclass.PrjClienteClinica;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dsd.grupoclass.bean.DoctorBean;
import pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean;
import pe.edu.upc.dsd.grupoclass.service.ReservaMedicaService;


@ContextConfiguration("/applicationContext-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class RegistrarReservaMedicaTest {
	@Autowired
	private ReservaMedicaService reservaMedicaService;
	private int numConst;
	
	@Test
	public void registrarReservaMedicaTest(){
		
		numConst = 1;
		//Doctor
		DoctorBean objDoctorBean = new DoctorBean();
		
		objDoctorBean.setIdDoctor(1);
		objDoctorBean.setNoDoctor("Rafael Juan");
		objDoctorBean.setNoEspecialidad("Medicina General");
		objDoctorBean.setNoSucursal("Sucursal San Borja");
		objDoctorBean.setDeHorario("Lunes y Miercoles de 10:00-12:00");
		//Fecha
		Date fechaHoraReserva = new Date();
		Calendar Calendario = GregorianCalendar.getInstance();
		Calendario.set(2011,07,17,8,0,0);
		fechaHoraReserva = Calendario.getTime();

		//Registra una reserva
		ReservaMedicaBean objReservaMedicaBean = new ReservaMedicaBean ();
		objReservaMedicaBean.setIdReservaMedica(numConst);
		objReservaMedicaBean.setDniPaciente("43434343");
		objReservaMedicaBean.setDoctor(objDoctorBean);
		objReservaMedicaBean.setFechaHoraReserva(fechaHoraReserva);		
		objReservaMedicaBean.setIndReserva(true);
		objReservaMedicaBean.setNoPaciente("Juan Perez Salas");
		
		
		boolean resultado = reservaMedicaService.registrarReservaMedica(objReservaMedicaBean);
		//El doctor se encuentra disponible en el horario seleccionado
		Assert.assertTrue(resultado);
	}
	
	@Test
	public void validarReservaMedicaTest(){
		
		numConst = 1;
		//Doctor
		DoctorBean objDoctorBean = new DoctorBean();
		
		objDoctorBean.setIdDoctor(1);
		objDoctorBean.setNoDoctor("Rafael Juan");
		objDoctorBean.setNoEspecialidad("Medicina General");
		objDoctorBean.setNoSucursal("Sucursal San Borja");
		objDoctorBean.setDeHorario("Lunes y Miercoles de 10:00-12:00");
		//Fecha
		Date fechaHoraReserva = new Date();
		Calendar Calendario = GregorianCalendar.getInstance();
		Calendario.set(2011,07,18,8,0,0);
		fechaHoraReserva = Calendario.getTime();

		//Registra una reserva
		ReservaMedicaBean objReservaMedicaBean = new ReservaMedicaBean ();
		objReservaMedicaBean.setIdReservaMedica(numConst);
		objReservaMedicaBean.setDniPaciente("12121212");
		objReservaMedicaBean.setDoctor(objDoctorBean);
		objReservaMedicaBean.setFechaHoraReserva(fechaHoraReserva);		
		objReservaMedicaBean.setIndReserva(true);
		objReservaMedicaBean.setNoPaciente("Karen Gamaniel");
		
		
		boolean resultado = reservaMedicaService.registrarReservaMedica(objReservaMedicaBean);
		
		//El doctor no se encuentra disponible en el horario seleccionado
		
		Assert.assertFalse(resultado);
	}
}
