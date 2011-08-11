package pe.edu.upc.dsd.grupoclass.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import pe.edu.upc.dsd.grupoclass.service.ConsultaMedicaService;
import pe.edu.upc.dsd.grupoclass.service.impl.ConsultaMedicaServiceImplServiceLocator;

public class ConsultaMedicaCliente {

	ConsultaMedicaServiceImplServiceLocator consultaMedicaServiceLocator =
		new ConsultaMedicaServiceImplServiceLocator();	
	
	public boolean registrarConsultaMedica(ConsultaMedicaBean consultaMedicaBean) throws RemoteException{		
		boolean resultado = false;
		try {
			ConsultaMedicaService consultaMedicaWS =
				consultaMedicaServiceLocator.getConsultaMedicaServiceImplPort();
						
			resultado = consultaMedicaWS.registrarConsultaMedica(consultaMedicaBean);					
			System.out.println("listaConsulta: "+consultaMedicaWS.obtenerConsultasMedicas().length);
			
		} catch (ServiceException e) {
			System.out.println("errorrr");
			e.printStackTrace();
		}		
		return resultado;
	}
	
	public boolean registrarResultadoConsultaMedica(ConsultaMedicaBean consultaMedicaBean) throws RemoteException{		
		boolean resultado = false;
		try {
			ConsultaMedicaService consultaMedicaWS =
				consultaMedicaServiceLocator.getConsultaMedicaServiceImplPort();
						
			resultado = consultaMedicaWS.registrarResultadoConsultaMedica(consultaMedicaBean);
			
			System.out.println("listaConsulta: "+consultaMedicaWS.obtenerConsultasMedicas().length);
			
		} catch (ServiceException e) {
			System.out.println("errorrr");
			e.printStackTrace();
		}		
		return resultado;
	}
	
	
	public ConsultaMedicaBean obtenerConsultaMedica(int idConsultaMedica) throws RemoteException{		
		ConsultaMedicaBean consultaMedicaBean = null;
		try {
			ConsultaMedicaService consultaMedicaWS =
				consultaMedicaServiceLocator.getConsultaMedicaServiceImplPort();
						
			consultaMedicaBean = consultaMedicaWS.obtenerConsultaMedica(idConsultaMedica);
			
		} catch (ServiceException e) {
			System.out.println("errorrr");
			e.printStackTrace();
		}		
		return consultaMedicaBean;
	}
}
 