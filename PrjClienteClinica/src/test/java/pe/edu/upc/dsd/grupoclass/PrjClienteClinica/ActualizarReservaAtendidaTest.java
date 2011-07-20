package pe.edu.upc.dsd.grupoclass.PrjClienteClinica;

import junit.framework.Assert;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dsd.grupoclass.service.ReservaMedicaService;


@ContextConfiguration("/applicationContext-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ActualizarReservaAtendidaTest {
	@Autowired
	private ReservaMedicaService reservaMedicaService;
	
	@Test
	public void registrarConsultaMedicaTest(){
		boolean resultado = reservaMedicaService.actualizarReservaAtendida(1);
		Assert.assertFalse(resultado);
	}
}
