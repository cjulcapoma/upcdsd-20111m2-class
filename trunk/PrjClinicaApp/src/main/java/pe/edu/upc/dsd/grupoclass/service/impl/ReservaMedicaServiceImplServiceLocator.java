/**
 * ReservaMedicaServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.edu.upc.dsd.grupoclass.service.impl;

public class ReservaMedicaServiceImplServiceLocator extends org.apache.axis.client.Service implements pe.edu.upc.dsd.grupoclass.service.impl.ReservaMedicaServiceImplService {

    public ReservaMedicaServiceImplServiceLocator() {
    }


    public ReservaMedicaServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReservaMedicaServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReservaMedicaServiceImplPort
    private java.lang.String ReservaMedicaServiceImplPort_address = "http://localhost:8080/PrjReservaMedica/ReservaMedica";

    public java.lang.String getReservaMedicaServiceImplPortAddress() {
        return ReservaMedicaServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ReservaMedicaServiceImplPortWSDDServiceName = "ReservaMedicaServiceImplPort";

    public java.lang.String getReservaMedicaServiceImplPortWSDDServiceName() {
        return ReservaMedicaServiceImplPortWSDDServiceName;
    }

    public void setReservaMedicaServiceImplPortWSDDServiceName(java.lang.String name) {
        ReservaMedicaServiceImplPortWSDDServiceName = name;
    }

    public pe.edu.upc.dsd.grupoclass.service.ReservaMedicaService getReservaMedicaServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReservaMedicaServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReservaMedicaServiceImplPort(endpoint);
    }

    public pe.edu.upc.dsd.grupoclass.service.ReservaMedicaService getReservaMedicaServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pe.edu.upc.dsd.grupoclass.service.impl.ReservaMedicaServiceImplServiceSoapBindingStub _stub = new pe.edu.upc.dsd.grupoclass.service.impl.ReservaMedicaServiceImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getReservaMedicaServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReservaMedicaServiceImplPortEndpointAddress(java.lang.String address) {
        ReservaMedicaServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pe.edu.upc.dsd.grupoclass.service.ReservaMedicaService.class.isAssignableFrom(serviceEndpointInterface)) {
                pe.edu.upc.dsd.grupoclass.service.impl.ReservaMedicaServiceImplServiceSoapBindingStub _stub = new pe.edu.upc.dsd.grupoclass.service.impl.ReservaMedicaServiceImplServiceSoapBindingStub(new java.net.URL(ReservaMedicaServiceImplPort_address), this);
                _stub.setPortName(getReservaMedicaServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ReservaMedicaServiceImplPort".equals(inputPortName)) {
            return getReservaMedicaServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.service.grupoclass.dsd.upc.edu.pe/", "ReservaMedicaServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.service.grupoclass.dsd.upc.edu.pe/", "ReservaMedicaServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ReservaMedicaServiceImplPort".equals(portName)) {
            setReservaMedicaServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
