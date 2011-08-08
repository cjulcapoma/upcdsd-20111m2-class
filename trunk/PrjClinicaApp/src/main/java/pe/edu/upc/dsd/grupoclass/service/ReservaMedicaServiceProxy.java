package pe.edu.upc.dsd.grupoclass.service;

import java.rmi.RemoteException;

import pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean;

public class ReservaMedicaServiceProxy implements pe.edu.upc.dsd.grupoclass.service.ReservaMedicaService {
  private String _endpoint = null;
  private pe.edu.upc.dsd.grupoclass.service.ReservaMedicaService reservaMedicaService = null;
  
  public ReservaMedicaServiceProxy() {
    _initReservaMedicaServiceProxy();
  }
  
  public ReservaMedicaServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initReservaMedicaServiceProxy();
  }
  
  private void _initReservaMedicaServiceProxy() {
    try {
      reservaMedicaService = (new pe.edu.upc.dsd.grupoclass.service.impl.ReservaMedicaServiceImplServiceLocator()).getReservaMedicaServiceImplPort();
      if (reservaMedicaService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)reservaMedicaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)reservaMedicaService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (reservaMedicaService != null)
      ((javax.xml.rpc.Stub)reservaMedicaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pe.edu.upc.dsd.grupoclass.service.ReservaMedicaService getReservaMedicaService() {
    if (reservaMedicaService == null)
      _initReservaMedicaServiceProxy();
    return reservaMedicaService;
  }
  
  public boolean registrarReservaMedica(pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean arg0) throws java.rmi.RemoteException{
    if (reservaMedicaService == null)
      _initReservaMedicaServiceProxy();
    return reservaMedicaService.registrarReservaMedica(arg0);
  }
  
  public boolean actualizarDisponibilidadDoctor(int idDoctor, java.lang.String fecha, java.lang.String hora) throws java.rmi.RemoteException{
    if (reservaMedicaService == null)
      _initReservaMedicaServiceProxy();
    return reservaMedicaService.actualizarDisponibilidadDoctor(idDoctor, fecha, hora);
  }
  
  public boolean actualizarReservaAtendida(int arg0) throws java.rmi.RemoteException{
    if (reservaMedicaService == null)
      _initReservaMedicaServiceProxy();
    return reservaMedicaService.actualizarReservaAtendida(arg0);
  }
  
  public boolean verificarDisponibilidadDoctor(int idDoctor, java.lang.String fecha, java.lang.String hora) throws java.rmi.RemoteException{
    if (reservaMedicaService == null)
      _initReservaMedicaServiceProxy();
    return reservaMedicaService.verificarDisponibilidadDoctor(idDoctor, fecha, hora);
  }
  
  public pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean obtenerReservaPaciente(java.lang.String arg0) throws java.rmi.RemoteException{
    if (reservaMedicaService == null)
      _initReservaMedicaServiceProxy();
    return reservaMedicaService.obtenerReservaPaciente(arg0);
  }

  public ReservaMedicaBean[] obtenerReservasMedicas() throws RemoteException {
	if (reservaMedicaService == null)
	      _initReservaMedicaServiceProxy();
	return reservaMedicaService.obtenerReservasMedicas();	    
  }
  
  
}