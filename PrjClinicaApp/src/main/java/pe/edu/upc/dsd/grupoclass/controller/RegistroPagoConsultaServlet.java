package pe.edu.upc.dsd.grupoclass.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import pe.edu.upc.dsd.grupoclass.bean.AfiliadoBean;
import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import pe.edu.upc.dsd.grupoclass.bean.DoctorBean;
import pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean;
import pe.edu.upc.dsd.grupoclass.bean.ReciboCobroBean;
import pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean;
import pe.edu.upc.dsd.grupoclass.client.ConsultaMedicaCliente;
import pe.edu.upc.dsd.grupoclass.client.ReservaMedicaCliente;
import pe.edu.upc.dsd.grupoclass.dao.ConstantesDao;
import pe.edu.upc.dsd.grupoclass.jms.MessageProducer;

import com.google.gson.Gson;

public class RegistroPagoConsultaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		final RestTemplate restTemplate = new RestTemplate();
		Gson gson = new Gson();

		Double montoPago = 70.00;
		String paginaDestino = "frmRegistroPagoConsulta.jsp";
		ReservaMedicaCliente reservaMedicaCliente = new ReservaMedicaCliente();
		ConstantesDao constantesDao = new ConstantesDao();

		String accion = request.getParameter("hdAccion").toString();
		String numdni = request.getParameter("numdni").toString();

		ServletContext context = getServletContext();
		WebApplicationContext applicationContext = WebApplicationContextUtils
				.getWebApplicationContext(context);

		MessageProducer messageProducer = (MessageProducer) applicationContext
				.getBean("messageProducer");

	
		
		// System.out.println(numdni);
		// System.out.println(accion);

		HttpSession session = request.getSession();
		ReservaMedicaBean reservaMedicaBean = null;
		ReservaMedicaBean[] reservas = null;

		
		
		//Limpiadatos

		session.removeValue("reserva");
		session.setAttribute("monto1", "0");
		session.setAttribute("descuento1", "0");
		session.setAttribute("vuelto1", "0");
		session.setAttribute("montoT1", "0");
		session.setAttribute("afililiado1", "No");
		session.setAttribute("porcentajeDescuento1","0");

		if (accion.equals("carga")) {
			// carga de datos ficticia


			ReservaMedicaCliente resMed = new ReservaMedicaCliente();
			ReservaMedicaBean rmb = new ReservaMedicaBean();
			// for(int i=0; i<listaMedicamentostt.length; i++){
			// listaMedicamentos9[i].add(listaMedicamentos[i]);

			DoctorBean db = new DoctorBean();
			
			db.setNoDoctor("Doc1");
			db.setIdDoctor(8);
			db.setNoEspecialidad("esp");
			db.setNoSucursal("scucur");
			
			rmb.setDniPaciente("11111111");
			rmb.setNoPaciente("Hola Hola");
			rmb.setIdReservaMedica(1);
			rmb.setDoctor(db);


			System.out.println("222222222222");
			/*
			 * consultaMedicaBean.setListaMedicamentos(listaMedicamentos);
			 * consultaMedicaBean.setNoPaciente("Luis Kina");
			 */
			resMed.registrarResultadoReservaMedica(rmb);

			System.out.println(rmb.getDniPaciente());

		}
		
		
		if (accion.equals("obtenerDatosConsulta")) {

			reservas = reservaMedicaCliente.obtenerReservasMedicas();

			session.setAttribute("monto1", 0);
			for (ReservaMedicaBean n : reservas) {
				if (n.getDniPaciente().equals(numdni)) {
					System.out.println("HOLA" + n.getDniPaciente());
					session.setAttribute("reserva", n);
					session.setAttribute("monto1", montoPago);

					String result = restTemplate
							.getForObject(
									"http://localhost:8080/PrjPolizaSeguro/rest/Poliza/{dni}",
									String.class, n.getDniPaciente());
					System.out.println(result);

					if (result.equalsIgnoreCase("no")) {
						session.setAttribute("montoT1", montoPago);
						session.setAttribute("hdDni1", "0");
						session.setAttribute("hdPaciente1", "0");
						session.setAttribute("hdMontoT1", "0");
						session.setAttribute("hdDescuento1", "0");
						session.setAttribute("afililiado", "No");
						session.setAttribute("porcentajeDescuento``", "N/A");
						session.setAttribute("descuento", "N/A");

					} else {

						AfiliadoBean afiliado1 = new AfiliadoBean();
						System.out.println("gson?");
						afiliado1 = gson.fromJson(result, AfiliadoBean.class);
						Double mDescuento = afiliado1.desConsulta * montoPago;

						System.out.println(afiliado1.nombre);
						session.setAttribute("afililiado1", "Si");
						session.setAttribute("porcentajeDescuento1",
								afiliado1.desConsulta);
						session.setAttribute("descuento1", mDescuento);
						session.setAttribute("montoT1", montoPago - mDescuento);
						session.setAttribute("hdDni1", afiliado1.dni);
						session.setAttribute("hdPaciente1", afiliado1.nombre);
						session.setAttribute("hdMontoT1", montoPago - mDescuento);
						// session.setAttribute("hdDescuento", mDescuento);
						System.out.println(afiliado1.nombre);
						System.out.println(montoPago - mDescuento);
						System.out.println(session.getAttribute("hdDni1"));
					}
				}
			}
		}
		if (accion.equals("enviarCola")) {

			System.out.println(session.getAttribute("hdDni1"));
			// System.out.println(session.getAttribute("hdPaciente"));
			// System.out.println(session.getAttribute("hdDni"));
			// System.out.println(session.getAttribute("efectivo"));

			String dniC = session.getAttribute("hdDni1").toString();
			String pacienteC = session.getAttribute("hdPaciente1")
					.toString();
			String montoPC = session.getAttribute("hdMontoT1").toString();
			String efectivoC = request.getParameter("efectivo1");
			System.out.println("Strings");
			

			System.out.println("cola");
			ReciboCobroBean reciboCobro = new ReciboCobroBean();

			if (montoPC.equalsIgnoreCase("0")) {
			} else {
				System.out.println("cola double");
				// System.out.println(dniC);
				System.out.println(pacienteC);
				System.out.println(montoPC);
				System.out.println(efectivoC);
				reciboCobro.setDniPaciente(dniC);
				reciboCobro.setNoPaciente(pacienteC);
				reciboCobro.setMntPagado(Double.parseDouble(montoPC));
				session.setAttribute("vuelto1", Double.parseDouble(efectivoC)
						- Double.parseDouble(montoPC));

				// */
				// reciboCobro.setDniPaciente("12312312");
				// reciboCobro.setNoPaciente("Juan Diaz");
				// reciboCobro.setMntPagado(666);

				ByteArrayOutputStream bs = new ByteArrayOutputStream();
				ObjectOutputStream os = new ObjectOutputStream(bs);
				os.writeObject(reciboCobro); // this es de tipo DatoUdp
				os.close();
				byte[] bytes = bs.toByteArray(); // devuelve byte[]

				System.out.println(reciboCobro.getDniPaciente());
				System.out.println("cola2");

				/* messageProducer.send("HHHH"); */
				// ConnectionFactory connectionFactory = new
				// ActiveMQConnectionFactory(
				// "tcp://localhost:61616");

				/*
				 * final JmsTemplate jmsTemplate; jmsTemplate = new
				 * JmsTemplate();
				 * jmsTemplate.setConnectionFactory(connectionFactory);
				 * jmsTemplate.convertAndSend("colaVentas", bytes);
				 */
				messageProducer.send(bytes);
			}
			System.out.println("cola3");
		}
		request.getRequestDispatcher(paginaDestino).forward(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("en el do postt");
	}

}
