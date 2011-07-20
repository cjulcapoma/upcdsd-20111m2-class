package pe.edu.upc.dsd.grupoclass.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean;
import pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean;

@WebService
public interface ConsultaMedicaService {

	public boolean registrarConsultaMedica(@WebParam(name="consultaMedicaBean") ConsultaMedicaBean consultaMedicaBean);
	public ConsultaMedicaBean obtenerConsultaMedica(@WebParam(name="idConsultaMedica") int idConsultaMedica);
	public boolean registrarResultadoConsultaMedica(@WebParam(name="consultaMedicaBean") ConsultaMedicaBean consultaMedicaBean);
	
	public List<MedicamentoRecetaBean> obtenerRecetaMedicaPorConsulta(@WebParam(name="idConsultaMedica") int idConsultaMedica);
	public List<ExamenConsultaBean> obtenerExamenesPorConsulta(@WebParam(name="idConsultaMedica") int idConsultaMedica);
	public boolean registrarResultadoExamen(@WebParam(name="idConsultaMedica") int idConsultaMedica, 
			@WebParam(name="examenConsultaBean") ExamenConsultaBean examenConsultaBean);
		
	public List<ConsultaMedicaBean> obtenerHistorialConsultasPaciente(@WebParam(name="dniPaciente") String dniPaciente);	
}
