package pe.edu.upc.dsd.grupoclass.client;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.rpc.ServiceException;

import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;
import pe.edu.upc.dsd.grupoclass.bean.DoctorBean;
import pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean;
import pe.edu.upc.dsd.grupoclass.dao.ConstantesDao;
import pe.edu.upc.dsd.grupoclass.service.ConsultaMedicaService;
import pe.edu.upc.dsd.grupoclass.service.ReservaMedicaService;
import pe.edu.upc.dsd.grupoclass.service.impl.ReservaMedicaServiceImplServiceLocator;

public class ReservaMedicaCliente {

	ConstantesDao constantesDao = new ConstantesDao();
	ReservaMedicaServiceImplServiceLocator reservaMedicaServiceLocator =
			new ReservaMedicaServiceImplServiceLocator();
		
	public boolean registrarReservaMedica(ReservaMedicaBean reservaMedicaBean) throws RemoteException{		
		boolean resultado = false;
		try {
			ReservaMedicaService reservaMedicaWS =
				reservaMedicaServiceLocator.getReservaMedicaServiceImplPort();
			
			resultado = reservaMedicaWS.registrarReservaMedica(reservaMedicaBean);
			System.out.println("listaaaa::::"+reservaMedicaWS.obtenerReservasMedicas().length);
			
		} catch (ServiceException e) {
			System.out.println("errorrr");
			e.printStackTrace();
		}		
		return resultado;
	}

    public boolean verificarDisponibilidadDoctor(int idDoctor, java.lang.String fecha, java.lang.String hora) throws RemoteException{
    	boolean resultado = false;
		try {
			ReservaMedicaService reservaMedicaWS =
				reservaMedicaServiceLocator.getReservaMedicaServiceImplPort();
			
			resultado = reservaMedicaWS.verificarDisponibilidadDoctor(idDoctor, fecha, hora);
			
		} catch (ServiceException e) {
			System.out.println("errorrr");
			e.printStackTrace();
		}	    	
    	return resultado;
    }

    public List<DoctorBean> obtenerHorariosDoctor(String noEspecialidad, String noSucursal){    	
    	List<DoctorBean> horariosDoctor = new ArrayList<DoctorBean>();
    	List<DoctorBean> doctores = constantesDao.listarDoctores();
    	System.out.println("datos consulta "+noEspecialidad+"-"+noSucursal);
    	System.out.println("doctoresss"+doctores.size());
    	
    	for(DoctorBean doctor : doctores){
    		System.out.println("doctor: "+doctor.getNoDoctor()+" "+doctor.getNoEspecialidad());
    	}
    	
    	for(DoctorBean doctor : doctores){
    		if(doctor.getNoEspecialidad().equals(noEspecialidad) &&
    				doctor.getNoSucursal().equals(noSucursal)){
    			System.out.println("datos:"+doctor.getNoEspecialidad()+"-"+doctor.getNoSucursal());
    			horariosDoctor.add(doctor);
    			System.out.println("agregoo");
    		}
    	}    	
    	System.out.println("lista> "+horariosDoctor.size());
    	System.out.println("saliooo");
    	return horariosDoctor;
    }
        
	public ReservaMedicaBean[] obtenerReservasMedicas() throws RemoteException{	
		try {
			ReservaMedicaService reservaMedicaWS =
				reservaMedicaServiceLocator.getReservaMedicaServiceImplPort();												
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
