package pe.edu.upc.dsd.grupoclass.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean;
import pe.edu.upc.dsd.grupoclass.service.ConsultaMedicaService;
import pe.edu.upc.dsd.grupoclass.service.ReservaMedicaService;
import pe.edu.upc.dsd.grupoclass.service.impl.ReservaMedicaServiceImplServiceLocator;

public class ReservaMedicaCliente {

	public ReservaMedicaBean registrarReservaMedica() throws RemoteException{
		ReservaMedicaServiceImplServiceLocator reservaMedicaServiceLocator =
			new ReservaMedicaServiceImplServiceLocator();
		ReservaMedicaBean reservaMedicaBean2 = new ReservaMedicaBean();
		try {
			ReservaMedicaService reservaMedicaWS =
				reservaMedicaServiceLocator.getReservaMedicaServiceImplPort();
			
			ReservaMedicaBean reservaMedicaBean = new ReservaMedicaBean();
			reservaMedicaBean.setNoPaciente("Luis Kina");
			reservaMedicaBean.setDniPaciente("45477388");
			reservaMedicaBean.setIndReserva(true);
			
			reservaMedicaWS.registrarReservaMedica(reservaMedicaBean);
						
			reservaMedicaBean2 = reservaMedicaWS.obtenerReservaPaciente("45477388");
					
			System.out.println("listaaaa::::"+reservaMedicaWS.obtenerReservasMedicas().length);
			
		} catch (ServiceException e) {
			System.out.println("errorrr");
			e.printStackTrace();
		}
		
		return reservaMedicaBean2;
	}
	public ReservaMedicaBean[] obtenerReservasMedicas() throws RemoteException{
		ReservaMedicaServiceImplServiceLocator reservaMedicaServiceLocator =
			new ReservaMedicaServiceImplServiceLocator();
		ReservaMedicaBean reservaMedicaBean2 = new ReservaMedicaBean();
		try {
			ReservaMedicaService reservaMedicaWS =
				reservaMedicaServiceLocator.getReservaMedicaServiceImplPort();
			
			ReservaMedicaBean reservaMedicaBean = new ReservaMedicaBean();
			reservaMedicaBean.setNoPaciente("Luis Kina");
			reservaMedicaBean.setDniPaciente("45477388");
			reservaMedicaBean.setIndReserva(true);
			
			reservaMedicaWS.registrarReservaMedica(reservaMedicaBean);
						
			return reservaMedicaWS.obtenerReservasMedicas();
			
		} catch (ServiceException e) {
			System.out.println("errorrr");
			e.printStackTrace();
		}
		return null;
		
	}
	public boolean registrarResultadoReservaMedica(ReservaMedicaBean reservaMedicaBean) throws RemoteException{		
		boolean resultado = false;
		ReservaMedicaServiceImplServiceLocator reservaMedicaServiceLocator =
			new ReservaMedicaServiceImplServiceLocator();
		try {
			ReservaMedicaService reservaMedicaWS =
				reservaMedicaServiceLocator.getReservaMedicaServiceImplPort();
						
			resultado = reservaMedicaWS.registrarReservaMedica(reservaMedicaBean);
			
			System.out.println("listaReserva: "+reservaMedicaWS.obtenerReservasMedicas().length);
			
		} catch (ServiceException e) {
			System.out.println("errorrr");
			e.printStackTrace();
		}		
		return resultado;
	}
}
