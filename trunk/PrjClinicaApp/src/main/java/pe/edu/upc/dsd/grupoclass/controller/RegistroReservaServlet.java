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

import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean;
import pe.edu.upc.dsd.grupoclass.bean.HorarioDoctorBean;
import pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean;
import pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean;
import pe.edu.upc.dsd.grupoclass.client.ReservaMedicaCliente;
import pe.edu.upc.dsd.grupoclass.dao.ConstantesDao;

public class RegistroReservaServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("en el do postt");	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		ReservaMedicaCliente reservaMedicaCliente = new ReservaMedicaCliente();
		
		ConstantesDao constantesDao = new ConstantesDao();
		
		HttpSession session = request.getSession();	
		ReservaMedicaBean reservaMedicaBean = null;
		ReservaMedicaBean[] horariosServ = null;
		//HorarioDoctorBean[] horariosServ = null;		
		ArrayList<ReservaMedicaBean> horarios;
		//ArrayList<HorarioDoctorBean> horarios;
		String paginaDestino = "frmRegistroReservaMedica.jsp";
				
		String accion = request.getParameter("hdAccion").toString();
		System.out.println("entro al servlet");
		
		if(accion.equals("obtenerHorarios")){
			String noEspecialidad = request.getParameter("noEspecialidad");
			String noSucursal = request.getParameter("noSucursal");
			
			try{				
				horariosServ = reservaMedicaCliente.obtenerReservasMedicas();
				//horariosServ = reservaMedicaCliente.obtenerHorarios(noEspecialidad,noSucursal);
			}catch(Exception e){
				System.out.println("Consulta invalida");
			}	
				if(horariosServ==null){
					session.setAttribute("horarios", null);
				}else{
					horarios = new ArrayList<ReservaMedicaBean>();
					for(int i=0; i<horariosServ.length; i++){
						horarios.add(horariosServ[i]);
					}
					session.setAttribute("horarios", horarios);
				}			
				if(horariosServ==null){
					session.setAttribute("horarios", null);
				}else{
					horarios= new ArrayList<ReservaMedicaBean>();
					for(int i=0; i<horariosServ.length; i++){
						horarios.add(horariosServ[i]);
					}
					session.setAttribute("horarios", horarios);
				}
			
		
		}else if(accion.equals("reservarHorario")){
			
			String codMedicina = request.getParameter("codMedicina").toString();
			String nombreMedicina = constantesDao.obtenerNombreMedicamentoPorCodigo(codMedicina);
			
			request.setAttribute("codigoMedicina", codMedicina);
			request.setAttribute("nombreMedicina", nombreMedicina);
			
			reservaMedicaBean = (ReservaMedicaBean)session.getAttribute("reserva");
			
			session.setAttribute("consulta", reservaMedicaBean);
			
		}else if(accion.equals("registrarReservaMedica")){			
			
			reservaMedicaBean = (ReservaMedicaBean)session.getAttribute("reserva");			
			
			reservaMedicaBean.setDniPaciente(request.getParameter("dniPaciente").toString());
			reservaMedicaBean.setNoPaciente(request.getParameter("noPaciente").toString());
			
			reservaMedicaCliente.registrarResultadoReservaMedica(reservaMedicaBean);	
			
		}else if(accion.equals("cerrarRegistroReservaMedica")){
						
			session.setAttribute("reserva", null);			
			paginaDestino = "index.jsp";
		}
					
		request.getRequestDispatcher(paginaDestino).forward(request, response);		
	}

}
