package pe.edu.upc.dsd.grupoclass.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean;
import pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean;
import pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean;
import pe.edu.upc.dsd.grupoclass.client.ConsultaMedicaCliente;
import pe.edu.upc.dsd.grupoclass.client.ReservaMedicaCliente;
import pe.edu.upc.dsd.grupoclass.service.ConsultaMedicaService;
public class RegistroConsultaServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("en el do postt");	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		ConsultaMedicaCliente consultaMedicaCliente = new ConsultaMedicaCliente();	
		List<MedicamentoRecetaBean> medicamentos = new ArrayList<MedicamentoRecetaBean>();
		List<ExamenConsultaBean> examenes = new ArrayList<ExamenConsultaBean>();
		
		String accion = request.getParameter("hdAccion").toString();
		
		if(accion.equals("obtenerDatosConsulta")){
			String nroConsulta = request.getParameter("nroConsulta");
			if(nroConsulta!=null){
				ConsultaMedicaBean consultaMedicaBean = consultaMedicaCliente.obtenerConsultaMedica(
						Integer.parseInt(nroConsulta));
				request.setAttribute("nombrePaciente", consultaMedicaBean.getNoPaciente());
				request.setAttribute("dniPaciente", consultaMedicaBean.getDniPaciente());
			}			
		}else if(accion.equals("agregarMedicina")){
			
			
		}else if(accion.equals("agregarExamen")){
			
		}else if(accion.equals("registrarConsultaMedica")){
			
		}
					
		//Ejemplo para llamar un metodo de ConsultaMedicaCliente
		/*ConsultaMedicaCliente consultaMedicaCliente = new ConsultaMedicaCliente();		
		ConsultaMedicaBean consultaMedicaBean = consultaMedicaCliente.registrarConsultaMedica();		
		request.setAttribute("nombrePaciente", consultaMedicaBean.getNoPaciente());*/
		
		//Ejemplo para llamar un metodo de ReservaMedicaCliente
		/*ReservaMedicaCliente reservaMedicaCliente = new ReservaMedicaCliente();		
		ReservaMedicaBean reservaMedicaBean = reservaMedicaCliente.registrarReservaMedica();		
		request.setAttribute("nombrePaciente", reservaMedicaBean.getNoPaciente());*/
		
		request.getRequestDispatcher("frmRegistroConsultaMedica.jsp").forward(request, response);
		
	}
}
