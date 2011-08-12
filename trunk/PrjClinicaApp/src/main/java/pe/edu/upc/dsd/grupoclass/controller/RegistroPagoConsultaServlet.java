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

public class RegistroPagoConsultaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paginaDestino = "frmRegistroPagoConsulta.jsp";
		ReservaMedicaCliente reservaMedicaCliente = new ReservaMedicaCliente();
		ConstantesDao constantesDao = new ConstantesDao();
		
		String accion = request.getParameter("hdAccion").toString();
		String numdni = request.getParameter("numdni").toString();
		
		HttpSession session = request.getSession();	
		ReservaMedicaBean reservaMedicaBean = null;
		ReservaMedicaBean[] reservas = null;
		
		
		if(accion.equals("obtenerDatosConsulta")){
			
			reservas = reservaMedicaCliente.obtenerReservasMedicas();
			
			for(ReservaMedicaBean n : reservas){
				if(n.getDniPaciente().equals(numdni)){
					session.setAttribute("consulta", null);
					session.setAttribute("consulta", null);
					session.setAttribute("consulta", null);
				}
			}
			request.getRequestDispatcher(paginaDestino).forward(request, response);		

		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("en el do postt");	
	}

}
