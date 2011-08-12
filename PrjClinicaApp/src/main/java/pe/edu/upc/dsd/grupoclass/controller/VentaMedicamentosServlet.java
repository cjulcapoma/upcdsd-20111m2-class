package pe.edu.upc.dsd.grupoclass.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.jms.ConnectionFactory;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

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

		//System.out.println("despues de carga");
		//Configuracion para colas
		ServletContext context = getServletContext();
		WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(context);

		MessageProducer messageProducer = (MessageProducer) applicationContext.getBean("messageProducer");

		final RestTemplate restTemplate = new RestTemplate();
		Gson gson = new Gson();
		List<MedicamentoRecetaBean> medicamentos = new ArrayList<MedicamentoRecetaBean>();
		HttpSession session = request.getSession();

		ConsultaMedicaBean consultaMedicaBean = null;
		ConsultaMedicaCliente consultaMedicaCliente = new ConsultaMedicaCliente();
		ConstantesDao constantesDao = new ConstantesDao();
		Double monto = 0.00;

		// session.setAttribute("medicinas","");
		System.out.println(session.getAttribute("hdMontoT"));
		/*
		 * String dniC = request.getParameter("hdDni"); String pacienteC =
		 * request.getParameter("hdPaciente"); String montoPC =
		 * request.getParameter("hdMontoT"); String descuentoC =
		 * request.getParameter("hdDescuento");
		 */

		String accion = request.getParameter("hdAccion").toString();

		if (accion.equals("carga")) {
			// carga de datos ficticia

			MedicamentoRecetaBean medicamentoRecetaBean = new MedicamentoRecetaBean();
			ArrayList<MedicamentoRecetaBean> listaMedicamentostt = new ArrayList<MedicamentoRecetaBean>();

			// for(int i=0; i<listaMedicamentostt.length; i++){
			// listaMedicamentos9[i].add(listaMedicamentos[i]);

			medicamentoRecetaBean.setCantidad(1);
			medicamentoRecetaBean.setCoMedicamento("2");
			medicamentoRecetaBean.setPrecio(100);
			medicamentoRecetaBean.setNoMedicamento("veneno");
			medicamentoRecetaBean.setIdMedicamento(5);
			// listaMedicamentostt.add(medicamentoRecetaBean);

			System.out.println("antes de []");
			MedicamentoRecetaBean[] listaMedicamentos9 = new MedicamentoRecetaBean[] { medicamentoRecetaBean };

			//listaMedicamentos9[0].setCantidad(1);
			//listaMedicamentos9[0].setCoMedicamento("2");
			//listaMedicamentos9[0].setPrecio(100);
			//listaMedicamentos9[0].setNoMedicamento("veneno");
			//listaMedicamentos9[0].setIdMedicamento(5);
			// listaMedicamentostt.add(medicamentoRecetaBean);
			// listaMedicamentostt.add(listaMedicamentos9[0]);

			ConsultaMedicaBean consultaMedicaBeantt = new ConsultaMedicaBean();

			consultaMedicaBeantt.setListaMedicamentos(listaMedicamentos9);
			consultaMedicaBeantt.setNoPaciente("Luis Kina");
			consultaMedicaBeantt.setDniPaciente("12345678");
			System.out.println("222222222222");
			/*
			 * consultaMedicaBean.setListaMedicamentos(listaMedicamentos);
			 * consultaMedicaBean.setNoPaciente("Luis Kina");
			 */
			consultaMedicaCliente.registrarConsultaMedica(consultaMedicaBeantt);

			System.out.println("3333333333");

			System.out.println("listaaaa::::"
					+ consultaMedicaCliente.obtenerConsultaMedica(3)
							.getNoPaciente());
			System.out.println("listaaaa::::"
					+ consultaMedicaCliente.obtenerConsultaMedica(3)
							.getListaMedicamentos(0).getNoMedicamento());

		}

		if (accion.equals("obtenerDatosPaciente")) {
			String nroConsulta = request.getParameter("nroConsulta");
			if (nroConsulta == null){
				
				MedicamentoRecetaBean medicamentoRecetaBean3 = new MedicamentoRecetaBean();
				// for(int i=0; i<listaMedicamentostt.length; i++){
				// listaMedicamentos9[i].add(listaMedicamentos[i]);

				medicamentoRecetaBean3.setCantidad(0);
				medicamentoRecetaBean3.setCoMedicamento("");
				medicamentoRecetaBean3.setPrecio(0);
				medicamentoRecetaBean3.setNoMedicamento("");
				medicamentoRecetaBean3.setIdMedicamento(0);
				// listaMedicamentostt.add(medicamentoRecetaBean);

				System.out.println("limpia med1");
				MedicamentoRecetaBean[] listaMedicamentos10 = new MedicamentoRecetaBean[] { medicamentoRecetaBean3 };
				session.setAttribute("medicinas", listaMedicamentos10);
				
				
				
				session.removeValue("consulta");
				session.setAttribute("montoT", "0");;
				session.setAttribute("afililiado", "No");
				session.setAttribute("porcentajeDescuento","0");
				session.setAttribute("consulta.noPaciente","");
				session.setAttribute("consulta.dniPaciente","");
				session.setAttribute("medicina", "");
				//session.setAttribute("medicina.coMedicamento", "");
				//session.setAttribute("medicina.noMedicamento", "");
				//session.setAttribute("medicina.cantidad", "");
				//session.setAttribute("medicina.precio", "");
				session.setAttribute("afililiado", "No");
				session.setAttribute("descuento", "N/A");
				session.setAttribute("hdDni", "0");
				session.setAttribute("hdPaciente", "0");
				session.setAttribute("hdMontoT", "0");
				session.setAttribute("vuelto","0");
				//session.setAttribute("consulta","");
				
			} else{
				if (nroConsulta == "") {
					
					MedicamentoRecetaBean medicamentoRecetaBean3 = new MedicamentoRecetaBean();
					
					medicamentoRecetaBean3.setCantidad(0);
					medicamentoRecetaBean3.setCoMedicamento("");
					medicamentoRecetaBean3.setPrecio(0);
					medicamentoRecetaBean3.setNoMedicamento("");
					medicamentoRecetaBean3.setIdMedicamento(0);
					// listaMedicamentostt.add(medicamentoRecetaBean);

					System.out.println("limpia med1");
					MedicamentoRecetaBean[] listaMedicamentos10 = new MedicamentoRecetaBean[] { medicamentoRecetaBean3 };
					session.setAttribute("medicinas", listaMedicamentos10);
					

					session.removeValue("consulta");
					session.setAttribute("montoT", "0");;
					session.setAttribute("afililiado", "No");
					session.setAttribute("porcentajeDescuento","0");
					//session.setAttribute("consulta","");
					session.setAttribute("consulta.noPaciente","");
					session.setAttribute("consulta.dniPaciente","");
					//session.setAttribute("medicina", "");
					//session.setAttribute("medicina.coMedicamento", "");
					//session.setAttribute("medicina.noMedicamento", "");
					//session.setAttribute("medicina.cantidad", "");
					//session.setAttribute("medicina.precio", "");
					session.setAttribute("afililiado", "No");
					session.setAttribute("descuento", "N/A");
					session.setAttribute("hdDni", "0");
					session.setAttribute("hdPaciente", "0");
					session.setAttribute("hdMontoT", "0");
					session.setAttribute("vuelto","0");
				}else
				{
					System.out.println(nroConsulta);
					consultaMedicaBean = consultaMedicaCliente
							.obtenerConsultaMedica(Integer
									.parseInt(nroConsulta));

					if (consultaMedicaBean != null) {
						System.out.println(nroConsulta + "session");

						session.setAttribute("nroConsulta", nroConsulta);
						session.setAttribute("consulta", consultaMedicaBean);
						MedicamentoRecetaBean[] listaMedicamentos = consultaMedicaBean
								.getListaMedicamentos();

						System.out.println("antes de lista med");
						System.out.println(listaMedicamentos.length);
						if (listaMedicamentos != null) {
							session.setAttribute("medicinas", listaMedicamentos);

							System.out.println(listaMedicamentos.length);
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
								session.setAttribute("hdDni", "0");
								session.setAttribute("hdPaciente", "0");
								session.setAttribute("hdMontoT", "0");
								session.setAttribute("hdDescuento", "0");
								session.setAttribute("afililiado", "No");
								session.setAttribute("porcentajeDescuento",
										"N/A");
								session.setAttribute("descuento", "N/A");
								// session.setAttribute("monto", "N/A");
								// session.setAttribute("montoT", "N/A");
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
							session.setAttribute("hdDni", afiliado.dni);
							session.setAttribute("hdPaciente", afiliado.nombre);
							session.setAttribute("hdMontoT", monto - mDescuento);
							//session.setAttribute("hdDescuento", mDescuento);
							System.out.println(afiliado.nombre);
							System.out.println( monto - mDescuento);
							System.out.println(session.getAttribute("hdDni"));
							

						}
					}
				}
			}
		}

		if (accion.equals("enviarCola")) {

			System.out.println(session.getAttribute("hdMontoT"));
			System.out.println(session.getAttribute("hdPaciente"));
			System.out.println(session.getAttribute("hdDni"));
			System.out.println(session.getAttribute("efectivo"));
			
			
			
			
			String dniC =  session.getAttribute("hdDni").toString();
			String pacienteC =  session.getAttribute("hdPaciente").toString();
			String montoPC = session.getAttribute("hdMontoT").toString();
			String efectivoC =  request.getParameter("efectivo");
			// */

			System.out.println("cola");
			ReciboCobroBean reciboCobro = new ReciboCobroBean();

			if (montoPC.equalsIgnoreCase("0")) {
			} else {
				System.out.println("cola double");
				//System.out.println(dniC);
				System.out.println(pacienteC);
				System.out.println(montoPC);
				System.out.println(efectivoC );
				reciboCobro.setDniPaciente(dniC);
				reciboCobro.setNoPaciente(pacienteC);
				reciboCobro.setMntPagado(Double.parseDouble(montoPC));
				session.setAttribute("vuelto",Double.parseDouble(efectivoC) -Double.parseDouble(montoPC));

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
				//ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
				//		"tcp://localhost:61616");

				/* 
				final JmsTemplate jmsTemplate;
				jmsTemplate = new JmsTemplate();
				jmsTemplate.setConnectionFactory(connectionFactory);
				jmsTemplate.convertAndSend("colaVentas", bytes);
				*/
				messageProducer.send(bytes);
			}
			System.out.println("cola3");
		}
		System.out.println("pasooo");

		request.getRequestDispatcher("frmVentaMedicamentos.jsp").forward(
				request, response);

	}
}