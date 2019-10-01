/**
 * AnishaService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.anisha;

public interface AnishaService extends javax.xml.rpc.Service {
    public java.lang.String getAnishaAddress();

    public com.anisha.Anisha getAnisha() throws javax.xml.rpc.ServiceException;

    public com.anisha.Anisha getAnisha(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
