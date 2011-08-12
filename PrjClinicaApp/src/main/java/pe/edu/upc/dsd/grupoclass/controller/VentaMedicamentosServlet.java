package pe.edu.upc.dsd.grupoclass.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.jms.ConnectionFactory;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.client.RestTemplate;

import pe.edu.upc.dsd.grupoclass.bean.AfiliadoBean;
import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean;
import pe.edu.upc.dsd.grupoclass.bean.ReciboCobroBean;
import pe.edu.upc.dsd.grupoclass.client.ConsultaMedicaCliente;
import pe.edu.upc.dsd.grupoclass.dao.ConstantesDao;
import pe.edu.upc.dsd.grupoclass.jms.MessageProducer;

import com.google.gson.Gson;

/**
 * Servlet implementation class VentaMedicamentosServlet
 */
public class VentaMedicamentosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("en el do postt");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("en el do gettt");
		System.out.println("antess del metodoo");
		


		MessageProducer messageProducer = new MessageProducer();


		final RestTemplate restTemplate = new RestTemplate();
		Gson gson = new Gson();
		List<MedicamentoRecetaBean> medicamentos = new ArrayList<MedicamentoRecetaBean>();
		HttpSession session = request.getSession();
		
				
		ConsultaMedicaBean consultaMedicaBean = null;
		ConsultaMedicaCliente consultaMedicaCliente = new ConsultaMedicaCliente();
		ConstantesDao constantesDao = new ConstantesDao();
		Double monto = 0.00;

		session.setAttribute("afililiado", "No");
		session.setAttribute("porcentajeDescuento", "N/A");
		session.setAttribute("descuento", "N/A");
		session.setAttribute("monto", "N/A");
		session.setAttribute("montoT", "N/A");
		session.setAttribute("hdDni", "0");
		session.setAttribute("hdPaciente", "0");
		session.setAttribute("hdMontoT", "0");
		session.setAttribute("hdDescuento", "0");
		System.out.println(session.getAttribute("hdMontoT"));
		/*
		String dniC = request.getParameter("hdDni");
		String pacienteC = request.getParameter("hdPaciente");
		String montoPC = request.getParameter("hdMontoT");
		String descuentoC = request.getParameter("hdDescuento");
		*/
		
		
		String accion = request.getParameter("hdAccion").toString();

		if (accion.equals("obtenerDatosPaciente")) {
			String nroConsulta = request.getParameter("nroConsulta");
			if (nroConsulta != null) {
				if (nroConsulta != "") {
					System.out.println(nroConsulta);
					consultaMedicaBean = consultaMedicaCliente
							.obtenerConsultaMedica(Integer
									.parseInt(nroConsulta));

					if (consultaMedicaBean != null) {
						System.out.println(nroConsulta);

						session.setAttribute("nroConsulta", nroConsulta);
						session.setAttribute("consulta", consultaMedicaBean);
						MedicamentoRecetaBean[] listaMedicamentos = consultaMedicaBean
								.getListaMedicamentos();

						if (listaMedicamentos != null) {
							session.setAttribute("medicinas", listaMedicamentos);

							for (int i = 0; i < listaMedicamentos.length; i++) {
								monto = monto
										+ listaMedicamentos[i].getPrecio();
							}
							;
							session.setAttribute("monto", monto);

							System.out.println("not null");

							String result = restTemplate
									.getForObject(
											"http://localhost:8080/PrjPolizaSeguro/rest/Poliza/{dni}",
											String.class,
											consultaMedicaBean.getDniPaciente());
							System.out.println(result);
							/*
							 * session.setAttribute("afililiado", "No");
							 * session.setAttribute
							 * ("porcentajeDescuento","N/A");
							 * session.setAttribute ("descuento","N/A");
							 * session.setAttribute ("montoT",monto);
							 */

							if (result.equalsIgnoreCase("no")) {
								session.setAttribute("montoT", monto);
							} else {
							}
							AfiliadoBean afiliado = new AfiliadoBean();
							System.out.println("gson?");
							afiliado = gson
									.fromJson(result, AfiliadoBean.class);
							Double mDescuento = afiliado.desMedicina * monto;

							System.out.println(afiliado.nombre);
							session.setAttribute("afililiado", "Si");
							session.setAttribute("porcentajeDescuento",
									afiliado.desMedicina);
							session.setAttribute("descuento", mDescuento);
							session.setAttribute("montoT", monto - mDescuento);

						}
					}
				}
			}
		}

		if (accion.equals("enviarCola")) {
			
			
			
			/*
			String dniC = request.getParameter("hdDni");
			String pacienteC = request.getParameter("hdPaciente");
			String montoPC = request.getParameter("hdMontoT");
			String descuentoC = request.getParameter("hdDescuento");
			
*/
			
			System.out.println("cola");
			ReciboCobroBean reciboCobro = new ReciboCobroBean();

			/*if (montoPC.equalsIgnoreCase("0")) {}else{
				
				reciboCobro.setDniPaciente(dniC);			
				reciboCobro.setNoPaciente(pacienteC);
				reciboCobro.setMntPagado(Double.valueOf(montoPC) - Double.valueOf(descuentoC));
				 
				  */
			reciboCobro.setDniPaciente("43886126");			
			reciboCobro.setNoPaciente("Juan Diaz");
			reciboCobro.setMntPagado(200);
			

			ByteArrayOutputStream bs = new ByteArrayOutputStream();
			ObjectOutputStream os = new ObjectOutputStream(bs);
			os.writeObject(reciboCobro); // this es de tipo DatoUdp
			os.close();
			byte[] bytes = bs.toByteArray(); // devuelve byte[]

			System.out.println(reciboCobro.getDniPaciente());
			System.out.println("cola2");
		
			/*messageProducer.send("HHHH");*/
	        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");


			final JmsTemplate jmsTemplate;
			jmsTemplate = new JmsTemplate();
			jmsTemplate.setConnectionFactory(connectionFactory);
			jmsTemplate.convertAndSend("colaVentas",bytes);
			
//}
			System.out.println("cola3");
		}
		System.out.println("pasooo");

		request.getRequestDispatcher("frmVentaMedicamentos.jsp").forward(
				request, response);
	}
}