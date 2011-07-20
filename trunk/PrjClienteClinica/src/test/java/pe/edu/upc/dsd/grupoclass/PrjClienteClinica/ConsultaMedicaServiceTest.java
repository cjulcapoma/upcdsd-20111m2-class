package pe.edu.upc.dsd.grupoclass.PrjClienteClinica;

import java.util.List;

import junit.framework.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean;
import pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean;
import pe.edu.upc.dsd.grupoclass.service.ConsultaMedicaService;


@ContextConfiguration("/applicationContext-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ConsultaMedicaServiceTest {
	
	@Autowired
	private ConsultaMedicaService consultaMedicaService;
	
	
	private int numCons = 1;
	
	
	@Test
	public void registrarConsultaMedicaTest(){
		
		//Registra una nueva consulta
		ConsultaMedicaBean objConsultaMedicaBean = new ConsultaMedicaBean();
		objConsultaMedicaBean.setIdConsultaMedica(numCons);
		boolean resultado = consultaMedicaService.registrarConsultaMedica(objConsultaMedicaBean);
		Assert.assertTrue(resultado);
	
		//Buscar la consulta que se acaba de crear
		Assert.assertEquals(objConsultaMedicaBean.getIdConsultaMedica(), consultaMedicaService.obtenerConsultaMedica(numCons).getIdConsultaMedica());
		
		
	}
	
	/*registrarResultadoExamen*/


}
