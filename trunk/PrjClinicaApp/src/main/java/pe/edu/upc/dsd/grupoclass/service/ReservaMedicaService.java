/**
 * ReservaMedicaService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.edu.upc.dsd.grupoclass.service;

public interface ReservaMedicaService extends java.rmi.Remote {
    public boolean registrarReservaMedica(pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean arg0) throws java.rmi.RemoteException;
    public pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean[] obtenerReservasMedicas() throws java.rmi.RemoteException;
    public boolean actualizarDisponibilidadDoctor(int idDoctor, java.lang.String fecha, java.lang.String hora) throws java.rmi.RemoteException;
    public boolean actualizarReservaAtendida(int arg0) throws java.rmi.RemoteException;
    public boolean verificarDisponibilidadDoctor(int idDoctor, java.lang.String fecha, java.lang.String hora) throws java.rmi.RemoteException;
    public pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean obtenerReservaPaciente(java.lang.String arg0) throws java.rmi.RemoteException;
}
