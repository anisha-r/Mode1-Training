/**
 * AnishaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.anisha;

public class AnishaServiceLocator extends org.apache.axis.client.Service implements com.anisha.AnishaService {

    public AnishaServiceLocator() {
    }


    public AnishaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AnishaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Anisha
    private java.lang.String Anisha_address = "http://192.168.1.25:8191/SOAPWebServiceXML/services/Anisha";

    public java.lang.String getAnishaAddress() {
        return Anisha_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AnishaWSDDServiceName = "Anisha";

    public java.lang.String getAnishaWSDDServiceName() {
        return AnishaWSDDServiceName;
    }

    public void setAnishaWSDDServiceName(java.lang.String name) {
        AnishaWSDDServiceName = name;
    }

    public com.anisha.Anisha getAnisha() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Anisha_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAnisha(endpoint);
    }

    public com.anisha.Anisha getAnisha(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.anisha.AnishaSoapBindingStub _stub = new com.anisha.AnishaSoapBindingStub(portAddress, this);
            _stub.setPortName(getAnishaWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAnishaEndpointAddress(java.lang.String address) {
        Anisha_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.anisha.Anisha.class.isAssignableFrom(serviceEndpointInterface)) {
                com.anisha.AnishaSoapBindingStub _stub = new com.anisha.AnishaSoapBindingStub(new java.net.URL(Anisha_address), this);
                _stub.setPortName(getAnishaWSDDServiceName());
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
        if ("Anisha".equals(inputPortName)) {
            return getAnisha();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://anisha.com", "AnishaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://anisha.com", "Anisha"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Anisha".equals(portName)) {
            setAnishaEndpointAddress(address);
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
