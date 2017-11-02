/**
 * IThirdPartyService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IThirdPartyService extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.Tps.Responses createMasterAccount(org.datacontract.schemas._2004._07.Tps.USERINFO userInfo, org.datacontract.schemas._2004._07.Tps.AccountInfo accountInfo) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Tps.MasterAccInfo masterAccountINfo(java.lang.String accountNumber, java.lang.String stationCode, org.datacontract.schemas._2004._07.Tps.USERINFO userInfo) throws java.rmi.RemoteException;
}
