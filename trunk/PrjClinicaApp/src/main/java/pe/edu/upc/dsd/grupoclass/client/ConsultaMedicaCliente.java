package pe.edu.upc.dsd.grupoclass.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import pe.edu.upc.dsd.grupoclass.service.ConsultaMedicaService;
import pe.edu.upc.dsd.grupoclass.service.impl.ConsultaMedicaServiceImplServiceLocator;

public class ConsultaMedicaCliente {

	public ConsultaMedicaBean registrarConsultaMedica() throws RemoteException{
		ConsultaMedicaServiceImplServiceLocator consultaMedicaServiceLocator =
			new ConsultaMedicaServiceImplServiceLocator();
		ConsultaMedicaBean consultaMedicaBean2 = new ConsultaMedicaBean();
		try {
			ConsultaMedicaService consultaMedicaWS =
				consultaMedicaServiceLocator.getConsultaMedicaServiceImplPort();
			
			ConsultaMedicaBean consultaMedicaBean = new ConsultaMedicaBean();
			consultaMedicaBean.setNoPaciente("Luis Kina");
			
			consultaMedicaWS.registrarConsultaMedica(consultaMedicaBean);
						
			consultaMedicaBean2 = consultaMedicaWS.obtenerConsultaMedica(1);
					
			System.out.println("listaaaa::::"+consultaMedicaWS.obtenerConsultasMedicas().length);
			
		} catch (ServiceException e) {
			System.out.println("errorrr");
			e.printStackTrace();
		}
		
		return consultaMedicaBean2;
	}

}
 