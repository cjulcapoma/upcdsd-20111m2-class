/**
 * ConsultaMedicaServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.edu.upc.dsd.grupoclass.service.impl;

public class ConsultaMedicaServiceImplServiceLocator extends org.apache.axis.client.Service implements pe.edu.upc.dsd.grupoclass.service.impl.ConsultaMedicaServiceImplService {

    public ConsultaMedicaServiceImplServiceLocator() {
    }


    public ConsultaMedicaServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConsultaMedicaServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConsultaMedicaServiceImplPort
    private java.lang.String ConsultaMedicaServiceImplPort_address = "http://localhost:8080/PrjConsultaMedica/ConsultaMedica";

    public java.lang.String getConsultaMedicaServiceImplPortAddress() {
        return ConsultaMedicaServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConsultaMedicaServiceImplPortWSDDServiceName = "ConsultaMedicaServiceImplPort";

    public java.lang.String getConsultaMedicaServiceImplPortWSDDServiceName() {
        return ConsultaMedicaServiceImplPortWSDDServiceName;
    }

    public void setConsultaMedicaServiceImplPortWSDDServiceName(java.lang.String name) {
        ConsultaMedicaServiceImplPortWSDDServiceName = name;
    }

    public pe.edu.upc.dsd.grupoclass.service.ConsultaMedicaService getConsultaMedicaServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConsultaMedicaServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConsultaMedicaServiceImplPort(endpoint);
    }

    public pe.edu.upc.dsd.grupoclass.service.ConsultaMedicaService getConsultaMedicaServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pe.edu.upc.dsd.grupoclass.service.impl.ConsultaMedicaServiceImplServiceSoapBindingStub _stub = new pe.edu.upc.dsd.grupoclass.service.impl.ConsultaMedicaServiceImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getConsultaMedicaServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConsultaMedicaServiceImplPortEndpointAddress(java.lang.String address) {
        ConsultaMedicaServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pe.edu.upc.dsd.grupoclass.service.ConsultaMedicaService.class.isAssignableFrom(serviceEndpointInterface)) {
                pe.edu.upc.dsd.grupoclass.service.impl.ConsultaMedicaServiceImplServiceSoapBindingStub _stub = new pe.edu.upc.dsd.grupoclass.service.impl.ConsultaMedicaServiceImplServiceSoapBindingStub(new java.net.URL(ConsultaMedicaServiceImplPort_address), this);
                _stub.setPortName(getConsultaMedicaServiceImplPortWSDDServiceName());
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
        if ("ConsultaMedicaServiceImplPort".equals(inputPortName)) {
            return getConsultaMedicaServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.service.grupoclass.dsd.upc.edu.pe/", "ConsultaMedicaServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.service.grupoclass.dsd.upc.edu.pe/", "ConsultaMedicaServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConsultaMedicaServiceImplPort".equals(portName)) {
            setConsultaMedicaServiceImplPortEndpointAddress(address);
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
