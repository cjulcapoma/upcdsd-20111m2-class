package pe.edu.upc.dsd.grupoclass.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
		String paginaDestino = "frmRegistroConsultaMedica.jsp";
				
		String accion = request.getParameter("hdAccion").toString();
		System.out.println("entro al servlet");
		
		if(accion.equals("obtenerDatosConsulta")){
			String nroConsulta = request.getParameter("nroConsulta");
			
			try{				
				consultaMedicaBean = consultaMedicaCliente.obtenerConsultaMedica(
					Integer.parseInt(nroConsulta));
			}catch(Exception e){
				System.out.println("nroConsulta invalida");
			}
				
			if(consultaMedicaBean!=null){
				session.setAttribute("consulta", consultaMedicaBean);
				
				MedicamentoRecetaBean[] listaMedicamentos = consultaMedicaBean.getListaMedicamentos();
				if(listaMedicamentos==null){
					session.setAttribute("medicinas", null);
				}else{
					medicamentos = new ArrayList<MedicamentoRecetaBean>();
					for(int i=0; i<listaMedicamentos.length; i++){
						medicamentos.add(listaMedicamentos[i]);
					}
					session.setAttribute("medicinas", medicamentos);
				}				
				
				ExamenConsultaBean[] listaExamenes = consultaMedicaBean.getListaExamenes();
				if(listaExamenes==null){
					session.setAttribute("examenes", null);
				}else{
					examenes = new ArrayList<ExamenConsultaBean>();
					for(int i=0; i<listaExamenes.length; i++){
						examenes.add(listaExamenes[i]);
					}
					session.setAttribute("examenes", examenes);
				}
				
				//consultasMedicas
				ConsultaMedicaBean[] listaConsultas = 
					consultaMedicaCliente.obtenerHistorialConsultasPaciente(consultaMedicaBean.getDniPaciente());
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				ConsultaMedicaBean consulta;
				for(int i=0; i<listaConsultas.length; i++){					
					consulta = (ConsultaMedicaBean)listaConsultas[i];
					Date dia = consulta.getFechaHoraConsulta().getTime();
					consulta.setFechaConsulta(sdf.format(dia));	
				}
				session.setAttribute("consultasMedicas", listaConsultas);
				
			}else{
				session.setAttribute("consulta", null);
				session.setAttribute("medicamentos", null);
				session.setAttribute("examenes", null);
			}
						
		}else if(accion.equals("agregarMedicina")){					
			
			boolean validacion = true;
			consultaMedicaBean = (ConsultaMedicaBean)session.getAttribute("consulta");
			medicamentos = (List<MedicamentoRecetaBean>)session.getAttribute("medicinas");
			if(medicamentos==null)	medicamentos = new ArrayList<MedicamentoRecetaBean>();
			
			String codMedicina="", noMedicina="";  int cantidad=0;
			try{
				codMedicina = request.getParameter("codMedicina").toString();
				cantidad = Integer.parseInt(request.getParameter("cantMedicina").toString());
				noMedicina = constantesDao.obtenerNombreMedicamentoPorCodigo(codMedicina);
				if(noMedicina.equals("")){
					validacion = false;
				}
			}catch(Exception e){
				validacion = false;
			}
			
			if(validacion){
				MedicamentoRecetaBean medicamentoRecetaBean = new MedicamentoRecetaBean();
				medicamentoRecetaBean.setIdMedicamento(medicamentos.size()+1);
				medicamentoRecetaBean.setCoMedicamento(codMedicina);
				medicamentoRecetaBean.setNoMedicamento(noMedicina);
				medicamentoRecetaBean.setCantidad(cantidad);
				medicamentos.add(medicamentoRecetaBean);
				session.setAttribute("medicinas", medicamentos);				
			}
			
			consultaMedicaBean.setDiagnostico(request.getParameter("diagnostico").toString());
			consultaMedicaBean.setTratamiento(request.getParameter("tratamiento").toString());
			session.setAttribute("consulta", consultaMedicaBean);				
			
		}else if(accion.equals("agregarExamen")){			
			
			boolean validacion = true;
			consultaMedicaBean = (ConsultaMedicaBean)session.getAttribute("consulta");
			examenes = (List<ExamenConsultaBean>)session.getAttribute("examenes");
			if(examenes==null)	examenes = new ArrayList<ExamenConsultaBean>();
												
			String codExamen="", noExamen="";  int cantidad=0;
			try{
				codExamen = request.getParameter("codExamen").toString();
				cantidad = Integer.parseInt(request.getParameter("cantExamen").toString());
				noExamen = constantesDao.obtenerNombreExamenPorCodigo(codExamen);
				if(noExamen.equals("")){
					validacion = false;
				}
			}catch(Exception e){
				validacion = false;
			}
			
			if(validacion){
				ExamenConsultaBean examenConsultaBean = new ExamenConsultaBean();
				examenConsultaBean.setIdExamenMedico(examenes.size()+1);
				examenConsultaBean.setCoExamenMedico(codExamen);
				examenConsultaBean.setNoExamen(noExamen);
				examenConsultaBean.setCantidad(cantidad);
				examenes.add(examenConsultaBean);
				session.setAttribute("examenes", examenes);
			}			
			
			consultaMedicaBean.setDiagnostico(request.getParameter("diagnostico").toString());
			consultaMedicaBean.setTratamiento(request.getParameter("tratamiento").toString());
			session.setAttribute("consulta", consultaMedicaBean);
			
		}else if(accion.equals("eliminarMedicina")){
			
			consultaMedicaBean = (ConsultaMedicaBean)session.getAttribute("consulta");
			medicamentos = (List<MedicamentoRecetaBean>)session.getAttribute("medicinas");
			
			int idMedicamento = Integer.parseInt(request.getParameter("hdIdMedicina").toString());
			for(int i=0; i<medicamentos.size(); i++){
				if(medicamentos.get(i).getIdMedicamento()==idMedicamento){
					medicamentos.remove(i);
				}
			}			
			session.setAttribute("medicinas", medicamentos);
			session.setAttribute("consulta", consultaMedicaBean);
			
		}else if(accion.equals("eliminarExamen")){	

			consultaMedicaBean = (ConsultaMedicaBean)session.getAttribute("consulta");
			examenes = (List<ExamenConsultaBean>)session.getAttribute("examenes");
			
			int idExamen = Integer.parseInt(request.getParameter("hdIdExamen").toString());
			for(int i=0; i<examenes.size(); i++){
				if(examenes.get(i).getIdExamenMedico()==idExamen){
					examenes.remove(i);
				}
			}			
			session.setAttribute("medicinas", medicamentos);
			session.setAttribute("consulta", consultaMedicaBean);
		
		}else if(accion.equals("obtenerNombreMedicina")){
			
			String codMedicina = request.getParameter("codMedicina").toString();
			String nombreMedicina = constantesDao.obtenerNombreMedicamentoPorCodigo(codMedicina);
			
			request.setAttribute("codigoMedicina", codMedicina);
			request.setAttribute("nombreMedicina", nombreMedicina);
			
			consultaMedicaBean = (ConsultaMedicaBean)session.getAttribute("consulta");
			consultaMedicaBean.setDiagnostico(request.getParameter("diagnostico").toString());
			consultaMedicaBean.setTratamiento(request.getParameter("tratamiento").toString());
			session.setAttribute("consulta", consultaMedicaBean);
			
		}else if(accion.equals("registrarConsultaMedica")){
			
			consultaMedicaBean = (ConsultaMedicaBean)session.getAttribute("consulta");
			medicamentos = (List<MedicamentoRecetaBean>)session.getAttribute("medicinas");	
			examenes = (List<ExamenConsultaBean>)session.getAttribute("examenes");
			
			if(medicamentos!=null){
				MedicamentoRecetaBean[] listaMedicamentos = new MedicamentoRecetaBean[medicamentos.size()]; 
				for(int i=0; i<medicamentos.size(); i++){
					listaMedicamentos[0] = medicamentos.get(i);
				}
				consultaMedicaBean.setListaMedicamentos(listaMedicamentos);
			}			
			
			if(examenes!=null){
				ExamenConsultaBean[] listaExamenes = new ExamenConsultaBean[examenes.size()]; 
				for(int i=0; i<examenes.size(); i++){
					listaExamenes[0] = examenes.get(i);
				}
				consultaMedicaBean.setListaExamenes(listaExamenes);
			}			
			
			consultaMedicaCliente.registrarResultadoConsultaMedica(consultaMedicaBean);	
			
		}else if(accion.equals("cerrarRegistroConsultaMedica")){
						
			session.setAttribute("consulta", null);
			session.setAttribute("medicinas", null);
			session.setAttribute("examenes", null);
			paginaDestino = "index.jsp";
		}
					
		request.getRequestDispatcher(paginaDestino).forward(request, response);		
	}
}
