package pe.edu.upc.dsd.grupoclass.service.impl;

import java.util.ArrayList;
import java.util.List;

import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import pe.edu.upc.dsd.grupoclass.bean.DoctorBean;
import pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean;
import pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean;
import pe.edu.upc.dsd.grupoclass.data.DataClass;
import pe.edu.upc.dsd.grupoclass.service.ConsultaMedicaService;

import javax.jws.WebService;

@WebService(endpointInterface = "pe.edu.upc.dsd.grupoclass.service.ConsultaMedicaService")
public class ConsultaMedicaServiceImpl implements ConsultaMedicaService {
	
	public ArrayList<String[]> listaMedicamentos;
	public ArrayList<String[]> listaExamenesMedicos;

	public ArrayList<ConsultaMedicaBean> listaConsultasMedicas = new ArrayList<ConsultaMedicaBean>();

	public ConsultaMedicaServiceImpl(){
		listaMedicamentos = DataClass.listarMedicamentos();
		listaExamenesMedicos = DataClass.listaExamenesMedicos();
	}
	
	public boolean registrarConsultaMedica(ConsultaMedicaBean consultaMedicaBean) {	
		consultaMedicaBean.setIdConsultaMedica(listaConsultasMedicas.size()+1);
		listaConsultasMedicas.add(consultaMedicaBean);						
		return true;
	}

	public ConsultaMedicaBean obtenerConsultaMedica(int idConsultaMedica) {		
		ConsultaMedicaBean objConsultaMedicaBean = null;
		
		for(int i=0; i<listaConsultasMedicas.size(); i++){
			objConsultaMedicaBean = listaConsultasMedicas.get(i);
			if(objConsultaMedicaBean.getIdConsultaMedica()==idConsultaMedica){
				break;
			}
		}		
		return objConsultaMedicaBean;
	}

	public boolean registrarResultadoConsultaMedica(
			ConsultaMedicaBean consultaMedicaBean) {		
		boolean resultado = false;
		
		for(int i=0; i<listaConsultasMedicas.size(); i++){
			if(listaConsultasMedicas.get(i).getIdConsultaMedica()==consultaMedicaBean.getIdConsultaMedica()){				
				listaConsultasMedicas.set(i, consultaMedicaBean);
				resultado = true;
				break;
			}
		}				
		return resultado;
	}

	public List<MedicamentoRecetaBean> obtenerRecetaMedicaPorConsulta(
			int idConsultaMedica) {
		List<MedicamentoRecetaBean> medicamentosConsulta = null;
		
		for(int i=0; i<listaConsultasMedicas.size(); i++){
			if(listaConsultasMedicas.get(i).getIdConsultaMedica()==idConsultaMedica){	
				medicamentosConsulta = listaConsultasMedicas.get(i).getListaMedicamentos();
				break;
			}
		}		
		return medicamentosConsulta;
	}

	public List<ExamenConsultaBean> obtenerExamenesPorConsulta(int idConsultaMedica) {
		List<ExamenConsultaBean> examenesConsulta = null;
		
		for(int i=0; i<listaConsultasMedicas.size(); i++){
			if(listaConsultasMedicas.get(i).getIdConsultaMedica()==idConsultaMedica){	
				examenesConsulta = listaConsultasMedicas.get(i).getListaExamenes();
				break;
			}
		}		
		return examenesConsulta;
	}

	public boolean registrarResultadoExamen(int idConsulta, ExamenConsultaBean examenConsultaBean) {
		boolean resultado = false;
		List<ExamenConsultaBean> examenesConsulta = null;
		
		for(int i=0; i<listaConsultasMedicas.size(); i++){
			if(listaConsultasMedicas.get(i).getIdConsultaMedica()==idConsulta){	
				examenesConsulta = listaConsultasMedicas.get(i).getListaExamenes();	
				for(int j=0; j<examenesConsulta.size(); j++){
					if(examenesConsulta.get(j).getIdExamenMedico()==examenConsultaBean.getIdExamenMedico()){
						examenesConsulta.set(j, examenConsultaBean);
						resultado = true;
					}
				}				
				break;
			}
		}		
		return resultado;
	}

	public List<ConsultaMedicaBean> obtenerHistorialConsultasPaciente(
			String dniPaciente) {
		List<ConsultaMedicaBean> historialConsultas = new ArrayList<ConsultaMedicaBean>();
		for(int i=0; i<listaConsultasMedicas.size(); i++){
			if(listaConsultasMedicas.get(i).getDniPaciente().equals(dniPaciente)){
				historialConsultas.add(listaConsultasMedicas.get(i));
			}
		}
		return historialConsultas;
	}


}
