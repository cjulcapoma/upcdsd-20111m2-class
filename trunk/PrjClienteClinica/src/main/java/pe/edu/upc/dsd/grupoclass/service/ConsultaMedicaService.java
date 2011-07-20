package pe.edu.upc.dsd.grupoclass.service;

import java.util.List;

import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean;
import pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean;

import javax.jws.WebService;


@WebService
public interface ConsultaMedicaService {

	public boolean registrarConsultaMedica(ConsultaMedicaBean consultaMedicaBean);
	public ConsultaMedicaBean obtenerConsultaMedica(int idConsultaMedica);
	public boolean registrarResultadoConsultaMedica(ConsultaMedicaBean consultaMedicaBean);
	
	public List<MedicamentoRecetaBean> obtenerRecetaMedicaPorConsulta(int idConsulta);
	public List<ExamenConsultaBean> obtenerExamenesPorConsulta(int idConsulta);
	public boolean registrarResultadoExamen(int idConsulta, ExamenConsultaBean examenConsultaBean);
		
	public List<ConsultaMedicaBean> obtenerHistorialConsultasPaciente(String dniPaciente);	
}
