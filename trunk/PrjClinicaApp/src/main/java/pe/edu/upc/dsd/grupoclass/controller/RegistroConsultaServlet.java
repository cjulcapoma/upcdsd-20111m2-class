package pe.edu.upc.dsd.grupoclass.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean;
import pe.edu.upc.dsd.grupoclass.client.ConsultaMedicaCliente;
import pe.edu.upc.dsd.grupoclass.client.ReservaMedicaCliente;
import pe.edu.upc.dsd.grupoclass.service.ConsultaMedicaService;
public class RegistroConsultaServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("en el do postt");	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("en el do gettt");
		String accion = request.getAttribute("hdAccion").toString();
		
		//Ejemplo para llamar 2 metodos desde un mismo jsp
		if(accion.equals("obtenerDatosConsulta")){
			request.setAttribute("nombrePaciente", "obtenerDatosConsulta");
			
		}else if(accion.equals("registrarConsultaMedica")){
			request.setAttribute("nombrePaciente", "registrarConsultaMedica");
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
