package pe.edu.upc.dsd.grupoclass.bean.test;

import junit.framework.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import pe.edu.upc.dsd.grupoclass.service.ConsultaMedicaService;


@ContextConfiguration("/applicationContext-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ConsultaMedicaServiceTest {
	
	@Autowired
	private ConsultaMedicaService consultaMedicaService;
	
	@Test
	public void registrarTratamientoTest(){
		ConsultaMedicaBean objConsultaMedicaBean = new ConsultaMedicaBean();
		boolean resultado = consultaMedicaService.registrarTratamiento(objConsultaMedicaBean);
		Assert.assertTrue(resultado);
	}

}
