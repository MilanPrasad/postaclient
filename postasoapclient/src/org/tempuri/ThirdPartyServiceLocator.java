/**
 * ThirdPartyServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ThirdPartyServiceLocator extends org.apache.axis.client.Service implements org.tempuri.ThirdPartyService {

    public ThirdPartyServiceLocator() {
    }


    public ThirdPartyServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ThirdPartyServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TpsBinding_IThirdPartyService
    private java.lang.String TpsBinding_IThirdPartyService_address = "http://168.187.136.18:8095/APIService/ThirdPartyService.svc";

    public java.lang.String getTpsBinding_IThirdPartyServiceAddress() {
        return TpsBinding_IThirdPartyService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TpsBinding_IThirdPartyServiceWSDDServiceName = "TpsBinding_IThirdPartyService";

    public java.lang.String getTpsBinding_IThirdPartyServiceWSDDServiceName() {
        return TpsBinding_IThirdPartyServiceWSDDServiceName;
    }

    public void setTpsBinding_IThirdPartyServiceWSDDServiceName(java.lang.String name) {
        TpsBinding_IThirdPartyServiceWSDDServiceName = name;
    }

    public org.tempuri.IThirdPartyService getTpsBinding_IThirdPartyService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TpsBinding_IThirdPartyService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTpsBinding_IThirdPartyService(endpoint);
    }

    public org.tempuri.IThirdPartyService getTpsBinding_IThirdPartyService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.TpsBinding_IThirdPartyServiceStub _stub = new org.tempuri.TpsBinding_IThirdPartyServiceStub(portAddress, this);
            _stub.setPortName(getTpsBinding_IThirdPartyServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTpsBinding_IThirdPartyServiceEndpointAddress(java.lang.String address) {
        TpsBinding_IThirdPartyService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.IThirdPartyService.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.TpsBinding_IThirdPartyServiceStub _stub = new org.tempuri.TpsBinding_IThirdPartyServiceStub(new java.net.URL(TpsBinding_IThirdPartyService_address), this);
                _stub.setPortName(getTpsBinding_IThirdPartyServiceWSDDServiceName());
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
        if ("TpsBinding_IThirdPartyService".equals(inputPortName)) {
            return getTpsBinding_IThirdPartyService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "ThirdPartyService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "TpsBinding_IThirdPartyService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TpsBinding_IThirdPartyService".equals(portName)) {
            setTpsBinding_IThirdPartyServiceEndpointAddress(address);
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
