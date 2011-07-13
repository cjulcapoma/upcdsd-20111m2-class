package pe.edu.upc.dsd.grupoclass.service;

import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import javax.jws.WebService;

@WebService
public interface ConsultaMedicaService {

	public boolean registrarTratamiento(ConsultaMedicaBean objConsultaMedicaBean);
}
