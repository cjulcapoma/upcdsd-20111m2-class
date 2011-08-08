/**
 * ConsultaMedicaService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.edu.upc.dsd.grupoclass.service;

public interface ConsultaMedicaService extends java.rmi.Remote {
    public pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean obtenerConsultaMedica(int idConsultaMedica) throws java.rmi.RemoteException;
    public pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean[] obtenerRecetaMedicaPorConsulta(int idConsultaMedica) throws java.rmi.RemoteException;
    public boolean registrarResultadoExamen(int idConsultaMedica, pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean examenConsultaBean) throws java.rmi.RemoteException;
    public pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean[] obtenerHistorialConsultasPaciente(java.lang.String dniPaciente) throws java.rmi.RemoteException;
    public pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean[] obtenerConsultasMedicas() throws java.rmi.RemoteException;
    public boolean registrarResultadoConsultaMedica(pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean consultaMedicaBean) throws java.rmi.RemoteException;
    public boolean registrarConsultaMedica(pe.edu.upc.dsd.grupoclass.bean.ConsultaMedicaBean consultaMedicaBean) throws java.rmi.RemoteException;
    public pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean[] obtenerExamenesPorConsulta(int idConsultaMedica) throws java.rmi.RemoteException;
}
