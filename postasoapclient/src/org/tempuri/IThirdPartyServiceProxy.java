package org.tempuri;

public class IThirdPartyServiceProxy implements org.tempuri.IThirdPartyService {
  private String _endpoint = null;
  private org.tempuri.IThirdPartyService iThirdPartyService = null;
  
  public IThirdPartyServiceProxy() {
    _initIThirdPartyServiceProxy();
  }
  
  public IThirdPartyServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIThirdPartyServiceProxy();
  }
  
  private void _initIThirdPartyServiceProxy() {
    try {
      iThirdPartyService = (new org.tempuri.ThirdPartyServiceLocator()).getTpsBinding_IThirdPartyService();
      if (iThirdPartyService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iThirdPartyService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iThirdPartyService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iThirdPartyService != null)
      ((javax.xml.rpc.Stub)iThirdPartyService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IThirdPartyService getIThirdPartyService() {
    if (iThirdPartyService == null)
      _initIThirdPartyServiceProxy();
    return iThirdPartyService;
  }
  
  public org.datacontract.schemas._2004._07.Tps.Responses createMasterAccount(org.datacontract.schemas._2004._07.Tps.USERINFO userInfo, org.datacontract.schemas._2004._07.Tps.AccountInfo accountInfo) throws java.rmi.RemoteException{
    if (iThirdPartyService == null)
      _initIThirdPartyServiceProxy();
    return iThirdPartyService.createMasterAccount(userInfo, accountInfo);
  }
  
  public org.datacontract.schemas._2004._07.Tps.MasterAccInfo masterAccountINfo(java.lang.String accountNumber, java.lang.String stationCode, org.datacontract.schemas._2004._07.Tps.USERINFO userInfo) throws java.rmi.RemoteException{
    if (iThirdPartyService == null)
      _initIThirdPartyServiceProxy();
    return iThirdPartyService.masterAccountINfo(accountNumber, stationCode, userInfo);
  }
  
  
}