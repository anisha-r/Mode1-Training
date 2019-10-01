package com.anisha;

public class AnishaProxy implements com.anisha.Anisha {
  private String _endpoint = null;
  private com.anisha.Anisha anisha = null;
  
  public AnishaProxy() {
    _initAnishaProxy();
  }
  
  public AnishaProxy(String endpoint) {
    _endpoint = endpoint;
    _initAnishaProxy();
  }
  
  private void _initAnishaProxy() {
    try {
      anisha = (new com.anisha.AnishaServiceLocator()).getAnisha();
      if (anisha != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)anisha)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)anisha)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (anisha != null)
      ((javax.xml.rpc.Stub)anisha)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.anisha.Anisha getAnisha() {
    if (anisha == null)
      _initAnishaProxy();
    return anisha;
  }
  
  public int getInt() throws java.rmi.RemoteException{
    if (anisha == null)
      _initAnishaProxy();
    return anisha.getInt();
  }
  
  
}