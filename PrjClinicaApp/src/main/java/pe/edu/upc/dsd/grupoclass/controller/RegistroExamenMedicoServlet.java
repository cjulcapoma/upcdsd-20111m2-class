package pe.edu.upc.dsd.grupoclass.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean;
import pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean;
import pe.edu.upc.dsd.grupoclass.client.ConsultaMedicaCliente;
import pe.edu.upc.dsd.grupoclass.dao.ConstantesDao;

public class RegistroExamenMedicoServlet extends HttpServlet {
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
		String paginaDestino = "frmRegistroExamenMedico.jsp";
				
		String accion = request.getParameter("hdAccion").toString();
		
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
			}else{
				session.setAttribute("consulta", null);				
				session.setAttribute("examenes", null);
			}
		}else if(accion.equals("seleccionarExamenMedico")){

			consultaMedicaBean = (ConsultaMedicaBean)session.getAttribute("consulta");
			examenes = (List<ExamenConsultaBean>)session.getAttribute("examenes");
			ExamenConsultaBean examenSeleccionado = new ExamenConsultaBean();
			
			int idExamen = Integer.parseInt(request.getParameter("hdIdExamen").toString());
			for(int i=0; i<examenes.size(); i++){
				if(examenes.get(i).getIdExamenMedico()==idExamen){
					examenSeleccionado = examenes.get(i);
				}
			}			
			session.setAttribute("examenSeleccionado", examenSeleccionado);
			session.setAttribute("consulta", consultaMedicaBean);
				
		}else if(accion.equals("registrarExamenMedico")){
			
			consultaMedicaBean = (ConsultaMedicaBean)session.getAttribute("consulta");			
			examenes = (List<ExamenConsultaBean>)session.getAttribute("examenes");
			
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
			session.setAttribute("examenes", null);
			paginaDestino = "index.jsp";
		}
					
		request.getRequestDispatcher(paginaDestino).forward(request, response);		
	}
}
