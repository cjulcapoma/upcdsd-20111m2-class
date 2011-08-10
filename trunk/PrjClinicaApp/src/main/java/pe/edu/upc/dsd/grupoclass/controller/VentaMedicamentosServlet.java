package pe.edu.upc.dsd.grupoclass.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pe.edu.upc.dsd.grupoclass.bean.AfiliadoBean;
import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean;
import pe.edu.upc.dsd.grupoclass.client.ConsultaMedicaCliente;
import pe.edu.upc.dsd.grupoclass.dao.ConstantesDao;
import org.springframework.web.client.RestTemplate;
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

		final RestTemplate restTemplate = new RestTemplate();
		Gson gson = new Gson();
		List<MedicamentoRecetaBean> medicamentos = new ArrayList<MedicamentoRecetaBean>();
		HttpSession session = request.getSession();
		ConsultaMedicaBean consultaMedicaBean = null;
		ConsultaMedicaCliente consultaMedicaCliente = new ConsultaMedicaCliente();
		ConstantesDao constantesDao = new ConstantesDao();
		Double monto = 0.00;

		String accion = request.getParameter("hdAccion").toString();

		if (accion.equals("obtenerDatosPaciente")) {
			String nroConsulta = request.getParameter("nroConsulta");
			if (nroConsulta != null) {
				if (nroConsulta != "") {
					System.out.println(nroConsulta);
					consultaMedicaBean = consultaMedicaCliente
							.obtenerConsultaMedica(Integer
									.parseInt(nroConsulta));

					String result = restTemplate.getForObject("http://localhost:8080/PrjPolizaSeguro/rest/Poliza/{dni}",String.class,nroConsulta);
					System.out.println(result);
					
					AfiliadoBean afiliado = new AfiliadoBean();
					afiliado = gson.fromJson(result,AfiliadoBean.class);
					System.out.println(afiliado.nombre);
					
					
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
						}
					}
				}
			}
		}

		System.out.println("pasooo");

		request.getRequestDispatcher("frmVentaMedicamentos.jsp").forward(
				request, response);
	}
}