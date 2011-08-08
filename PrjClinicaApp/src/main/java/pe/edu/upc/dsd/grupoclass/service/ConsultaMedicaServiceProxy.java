package pe.edu.upc.dsd.grupoclass.service;

import java.rmi.RemoteException;

import pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean;

public class ConsultaMedicaServiceProxy implements pe.edu.upc.dsd.grupoclass.service.ConsultaMedicaService {
  private String _endpoint = null;
  private pe.edu.upc.dsd.grupoclass.service.ConsultaMedicaService consultaMedicaService = null;
  
  public ConsultaMedicaServiceProxy() {
    _initConsultaMedicaServiceProxy();
  }
  
  public ConsultaMedicaServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initConsultaMedicaServiceProxy();
  }
  
  private void _initConsultaMedicaServiceProxy() {
    try {
      consultaMedicaService = (new pe.edu.upc.dsd.grupoclass.service.impl.ConsultaMedicaServiceImplServiceLocator()).getConsultaMedicaServiceImplPort();
      if (consultaMedicaService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)consultaMedicaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)consultaMedicaService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (consultaMedicaService != null)
      ((javax.xml.rpc.Stub)consultaMedicaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pe.edu.upc.dsd.grupoclass.service.ConsultaMedicaService getConsultaMedicaService() {
    if (consultaMedicaService == null)
      _initConsultaMedicaServiceProxy();
    return consultaMedicaService;
  }
  
  public pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean obtenerConsultaMedica(int idConsultaMedica) throws java.rmi.RemoteException{
    if (consultaMedicaService == null)
      _initConsultaMedicaServiceProxy();
    return consultaMedicaService.obtenerConsultaMedica(idConsultaMedica);
  }
  
  public pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean[] obtenerRecetaMedicaPorConsulta(int idConsultaMedica) throws java.rmi.RemoteException{
    if (consultaMedicaService == null)
      _initConsultaMedicaServiceProxy();
    return consultaMedicaService.obtenerRecetaMedicaPorConsulta(idConsultaMedica);
  }
  
  public boolean registrarResultadoExamen(int idConsultaMedica, pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean examenConsultaBean) throws java.rmi.RemoteException{
    if (consultaMedicaService == null)
      _initConsultaMedicaServiceProxy();
    return consultaMedicaService.registrarResultadoExamen(idConsultaMedica, examenConsultaBean);
  }
  
  public pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean[] obtenerHistorialConsultasPaciente(java.lang.String dniPaciente) throws java.rmi.RemoteException{
    if (consultaMedicaService == null)
      _initConsultaMedicaServiceProxy();
    return consultaMedicaService.obtenerHistorialConsultasPaciente(dniPaciente);
  }
  
  public boolean registrarResultadoConsultaMedica(pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean consultaMedicaBean) throws java.rmi.RemoteException{
    if (consultaMedicaService == null)
      _initConsultaMedicaServiceProxy();
    return consultaMedicaService.registrarResultadoConsultaMedica(consultaMedicaBean);
  }
  
  public boolean registrarConsultaMedica(pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean consultaMedicaBean) throws java.rmi.RemoteException{
    if (consultaMedicaService == null)
      _initConsultaMedicaServiceProxy();
    return consultaMedicaService.registrarConsultaMedica(consultaMedicaBean);
  }
  
  public pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean[] obtenerExamenesPorConsulta(int idConsultaMedica) throws java.rmi.RemoteException{
    if (consultaMedicaService == null)
      _initConsultaMedicaServiceProxy();
    return consultaMedicaService.obtenerExamenesPorConsulta(idConsultaMedica);
  }

	public ConsultaMedicaBean[] obtenerConsultasMedicas() throws RemoteException {
		if (consultaMedicaService == null)
		      _initConsultaMedicaServiceProxy();
		return consultaMedicaService.obtenerConsultasMedicas();
	}
  
  
}