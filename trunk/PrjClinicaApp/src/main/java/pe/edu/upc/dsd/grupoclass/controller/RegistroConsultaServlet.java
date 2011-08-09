package pe.edu.upc.dsd.grupoclass.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean;
import pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean;
import pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean;
import pe.edu.upc.dsd.grupoclass.client.ConsultaMedicaCliente;
import pe.edu.upc.dsd.grupoclass.client.ReservaMedicaCliente;
import pe.edu.upc.dsd.grupoclass.dao.ConstantesDao;
import pe.edu.upc.dsd.grupoclass.service.ConsultaMedicaService;
public class RegistroConsultaServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("en el do postt");	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		ConsultaMedicaCliente consultaMedicaCliente = new ConsultaMedicaCliente();
		ConstantesDao constantesDao = new ConstantesDao();
		
		HttpSession session = request.getSession();	
		ConsultaMedicaBean consultaMedicaBean = null;
		List<MedicamentoRecetaBean> medicamentos = null;
		List<ExamenConsultaBean> examenes = null;
				
		String accion = request.getParameter("hdAccion").toString();
		
		if(accion.equals("obtenerDatosConsulta")){
			String nroConsulta = request.getParameter("nroConsulta");
			if(nroConsulta!=null){
				consultaMedicaBean = consultaMedicaCliente.obtenerConsultaMedica(
						Integer.parseInt(nroConsulta));
				
				session.setAttribute("consulta", consultaMedicaBean);
				session.setAttribute("medicinas", null);
				session.setAttribute("examenes", null);
			}			
		}else if(accion.equals("agregarMedicina")){					
			
			consultaMedicaBean = (ConsultaMedicaBean)session.getAttribute("consulta");
			medicamentos = (List<MedicamentoRecetaBean>)session.getAttribute("medicinas");	
						
			String codMedicina = request.getParameter("codMedicina").toString();
			int cantidad = Integer.parseInt(request.getParameter("cantMedicina").toString());
			if(medicamentos==null)	medicamentos = new ArrayList<MedicamentoRecetaBean>();
						
			MedicamentoRecetaBean medicamentoRecetaBean = new MedicamentoRecetaBean();
			medicamentoRecetaBean.setIdMedicamento(medicamentos.size()+1);
			medicamentoRecetaBean.setCoMedicamento(codMedicina);
			medicamentoRecetaBean.setNoMedicamento(
					constantesDao.obtenerNombreMedicamentoPorCodigo(codMedicina));
			medicamentoRecetaBean.setCantidad(cantidad);
			medicamentos.add(medicamentoRecetaBean);
			
			consultaMedicaBean.setDiagnostico(request.getParameter("diagnostico").toString());
			consultaMedicaBean.setTratamiento(request.getParameter("tratamiento").toString());
			
			session.setAttribute("medicinas", medicamentos);
			session.setAttribute("consulta", consultaMedicaBean);	
			
		}else if(accion.equals("agregarExamen")){			
			
			consultaMedicaBean = (ConsultaMedicaBean)session.getAttribute("consulta");
			examenes = (List<ExamenConsultaBean>)session.getAttribute("examenes");
			
			String codExamen = request.getParameter("codExamen").toString();
			int cantidad = Integer.parseInt(request.getParameter("cantExamen").toString());
			if(examenes==null)	examenes = new ArrayList<ExamenConsultaBean>();
									
			ExamenConsultaBean examenConsultaBean = new ExamenConsultaBean();
			examenConsultaBean.setIdExamenMedico(examenes.size()+1);
			examenConsultaBean.setCoExamenMedico(codExamen);
			examenConsultaBean.setNoExamen(
					constantesDao.obtenerNombreExamenPorCodigo(codExamen));
			examenConsultaBean.setCantidad(cantidad);
			examenes.add(examenConsultaBean);
			
			consultaMedicaBean.setDiagnostico(request.getParameter("diagnostico").toString());
			consultaMedicaBean.setTratamiento(request.getParameter("tratamiento").toString());
			
			session.setAttribute("examenes", examenes);
			session.setAttribute("consulta", consultaMedicaBean);
			
		}else if(accion.equals("registrarConsultaMedica")){
			
			consultaMedicaBean = (ConsultaMedicaBean)session.getAttribute("consulta");
			medicamentos = (List<MedicamentoRecetaBean>)session.getAttribute("medicinas");	
			examenes = (List<ExamenConsultaBean>)session.getAttribute("examenes");
			
			MedicamentoRecetaBean[] listaMedicamentos = new MedicamentoRecetaBean[medicamentos.size()]; 
			for(int i=0; i<medicamentos.size(); i++){
				listaMedicamentos[0] = medicamentos.get(i);
			}
			consultaMedicaBean.setListaMedicamentos(listaMedicamentos);

			ExamenConsultaBean[] listaExamenes = new ExamenConsultaBean[examenes.size()]; 
			for(int i=0; i<examenes.size(); i++){
				listaExamenes[0] = examenes.get(i);
			}
			consultaMedicaBean.setListaExamenes(listaExamenes);
			
			consultaMedicaCliente.registrarConsultaMedica(consultaMedicaBean);			
		}
		
		request.getRequestDispatcher("frmRegistroConsultaMedica.jsp").forward(request, response);		
	}
}
