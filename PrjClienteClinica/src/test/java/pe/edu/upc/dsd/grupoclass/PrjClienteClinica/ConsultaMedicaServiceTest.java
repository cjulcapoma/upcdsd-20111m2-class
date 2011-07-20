package pe.edu.upc.dsd.grupoclass.PrjClienteClinica;

import java.util.ArrayList;
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
		
		public ArrayList<MedicamentoRecetaBean> listaMedicamentos = new ArrayList<MedicamentoRecetaBean>();
		public ArrayList<ExamenConsultaBean> listaExamenes = new ArrayList<ExamenConsultaBean>();
		
	/**/
	
		// Este test cubre la regla de negocio RN7
	@Test
	public void registrarConsultaMedicaTest(){
		
		//Registra una nueva consulta
		ConsultaMedicaBean objConsultaMedicaBean = new ConsultaMedicaBean();
		objConsultaMedicaBean.setIdConsultaMedica(numCons);
		boolean resultado = consultaMedicaService.registrarConsultaMedica(objConsultaMedicaBean);
		Assert.assertTrue(resultado);
	
		//Buscar la consulta que se acaba de crear
		Assert.assertEquals(objConsultaMedicaBean.getIdConsultaMedica(), consultaMedicaService.obtenerConsultaMedica(numCons).getIdConsultaMedica());
		
		//Registra el resultado de la consulta con sus examenes y medicamentos
		ConsultaMedicaBean objConsultaMedicaBeanResult = new ConsultaMedicaBean();
		ExamenConsultaBean examen = new ExamenConsultaBean();
		//Agregamos el examen complementario
		examen.setIdExamenMedico(2);
		examen.setCoExamenMedico("coExamenMedico");
		examen.setCantidad(1);
		examen.setNoExamen("noExamen");
		examen.setResultado("resultado");
		listaExamenes.add(examen);				
		//Agregamos las medicinas
		MedicamentoRecetaBean medicina = new MedicamentoRecetaBean(); 
		medicina.setIdMedicamento(3);
		medicina.setCantidad(1);
		medicina.setCoMedicamento("coMedicamento");
		medicina.setNoMedicamento("noMedicamento");
		medicina.setPrecio(100) ;
		objConsultaMedicaBeanResult.setListaExamenes(listaExamenes);
		objConsultaMedicaBeanResult.setListaMedicamentos(listaMedicamentos);
		objConsultaMedicaBeanResult.setIdConsultaMedica(numCons);
		//Grabamos el resultado la consulta
	    boolean resultado2 = consultaMedicaService.registrarResultadoConsultaMedica(objConsultaMedicaBeanResult);
		Assert.assertTrue(resultado2);
		
	}
	

}
