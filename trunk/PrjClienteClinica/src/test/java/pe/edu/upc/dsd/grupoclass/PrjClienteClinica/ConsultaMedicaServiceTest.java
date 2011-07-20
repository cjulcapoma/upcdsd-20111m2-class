package pe.edu.upc.dsd.grupoclass.PrjClienteClinica;

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
	public void registrarConsultaMedicaTest(){
		ConsultaMedicaBean objConsultaMedicaBean = new ConsultaMedicaBean();
		boolean resultado = consultaMedicaService.registrarConsultaMedica(objConsultaMedicaBean);
		Assert.assertTrue(resultado);
	}

}
