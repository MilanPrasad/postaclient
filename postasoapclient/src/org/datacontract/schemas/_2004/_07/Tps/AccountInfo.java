/**
 * AccountInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Tps;

public class AccountInfo  implements java.io.Serializable {
    private java.lang.String accountName;

    private java.lang.String accountNumber;

    private java.lang.String accountPassword;

    private java.lang.String address;

    private java.lang.String alertEmail;

    private org.datacontract.schemas._2004._07.Tps.AlertEventCode[] alertEventCode;

    private java.lang.String alertSMS;

    private java.lang.String alertWhatsApp;

    private java.lang.String codeAccountType;

    private java.lang.String codeArea;

    private java.lang.String codeCity;

    private java.lang.String codeCountry;

    private java.lang.String codeProvince;

    private java.lang.String codeSector;

    private java.lang.String codeStation;

    private java.lang.String codeWareHouseType;

    private java.lang.String contactPerson;

    private java.lang.Double customChargePercent;

    private java.lang.String customChargesMode;

    private java.lang.String email;

    private java.lang.String fax;

    private java.lang.Double handlingChargesAmount;

    private java.lang.String handlingChargesMode;

    private java.lang.String invoiceBlock;

    private java.lang.String language;

    private java.lang.Long maxCalls;

    private java.lang.Long maxDelivery;

    private java.lang.Long maxRTNDays;

    private java.lang.String mobile;

    private java.lang.String NR;

    private java.lang.Double openingBalance;

    private java.lang.String PACINumber;

    private java.lang.String pinCode;

    private java.lang.String salesCode;

    private java.lang.String status;

    private java.lang.String validIDNumber;

    public AccountInfo() {
    }

    public AccountInfo(
           java.lang.String accountName,
           java.lang.String accountNumber,
           java.lang.String accountPassword,
           java.lang.String address,
           java.lang.String alertEmail,
           org.datacontract.schemas._2004._07.Tps.AlertEventCode[] alertEventCode,
           java.lang.String alertSMS,
           java.lang.String alertWhatsApp,
           java.lang.String codeAccountType,
           java.lang.String codeArea,
           java.lang.String codeCity,
           java.lang.String codeCountry,
           java.lang.String codeProvince,
           java.lang.String codeSector,
           java.lang.String codeStation,
           java.lang.String codeWareHouseType,
           java.lang.String contactPerson,
           java.lang.Double customChargePercent,
           java.lang.String customChargesMode,
           java.lang.String email,
           java.lang.String fax,
           java.lang.Double handlingChargesAmount,
           java.lang.String handlingChargesMode,
           java.lang.String invoiceBlock,
           java.lang.String language,
           java.lang.Long maxCalls,
           java.lang.Long maxDelivery,
           java.lang.Long maxRTNDays,
           java.lang.String mobile,
           java.lang.String NR,
           java.lang.Double openingBalance,
           java.lang.String PACINumber,
           java.lang.String pinCode,
           java.lang.String salesCode,
           java.lang.String status,
           java.lang.String validIDNumber) {
           this.accountName = accountName;
           this.accountNumber = accountNumber;
           this.accountPassword = accountPassword;
           this.address = address;
           this.alertEmail = alertEmail;
           this.alertEventCode = alertEventCode;
           this.alertSMS = alertSMS;
           this.alertWhatsApp = alertWhatsApp;
           this.codeAccountType = codeAccountType;
           this.codeArea = codeArea;
           this.codeCity = codeCity;
           this.codeCountry = codeCountry;
           this.codeProvince = codeProvince;
           this.codeSector = codeSector;
           this.codeStation = codeStation;
           this.codeWareHouseType = codeWareHouseType;
           this.contactPerson = contactPerson;
           this.customChargePercent = customChargePercent;
           this.customChargesMode = customChargesMode;
           this.email = email;
           this.fax = fax;
           this.handlingChargesAmount = handlingChargesAmount;
           this.handlingChargesMode = handlingChargesMode;
           this.invoiceBlock = invoiceBlock;
           this.language = language;
           this.maxCalls = maxCalls;
           this.maxDelivery = maxDelivery;
           this.maxRTNDays = maxRTNDays;
           this.mobile = mobile;
           this.NR = NR;
           this.openingBalance = openingBalance;
           this.PACINumber = PACINumber;
           this.pinCode = pinCode;
           this.salesCode = salesCode;
           this.status = status;
           this.validIDNumber = validIDNumber;
    }


    /**
     * Gets the accountName value for this AccountInfo.
     * 
     * @return accountName
     */
    public java.lang.String getAccountName() {
        return accountName;
    }


    /**
     * Sets the accountName value for this AccountInfo.
     * 
     * @param accountName
     */
    public void setAccountName(java.lang.String accountName) {
        this.accountName = accountName;
    }


    /**
     * Gets the accountNumber value for this AccountInfo.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this AccountInfo.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the accountPassword value for this AccountInfo.
     * 
     * @return accountPassword
     */
    public java.lang.String getAccountPassword() {
        return accountPassword;
    }


    /**
     * Sets the accountPassword value for this AccountInfo.
     * 
     * @param accountPassword
     */
    public void setAccountPassword(java.lang.String accountPassword) {
        this.accountPassword = accountPassword;
    }


    /**
     * Gets the address value for this AccountInfo.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this AccountInfo.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the alertEmail value for this AccountInfo.
     * 
     * @return alertEmail
     */
    public java.lang.String getAlertEmail() {
        return alertEmail;
    }


    /**
     * Sets the alertEmail value for this AccountInfo.
     * 
     * @param alertEmail
     */
    public void setAlertEmail(java.lang.String alertEmail) {
        this.alertEmail = alertEmail;
    }


    /**
     * Gets the alertEventCode value for this AccountInfo.
     * 
     * @return alertEventCode
     */
    public org.datacontract.schemas._2004._07.Tps.AlertEventCode[] getAlertEventCode() {
        return alertEventCode;
    }


    /**
     * Sets the alertEventCode value for this AccountInfo.
     * 
     * @param alertEventCode
     */
    public void setAlertEventCode(org.datacontract.schemas._2004._07.Tps.AlertEventCode[] alertEventCode) {
        this.alertEventCode = alertEventCode;
    }


    /**
     * Gets the alertSMS value for this AccountInfo.
     * 
     * @return alertSMS
     */
    public java.lang.String getAlertSMS() {
        return alertSMS;
    }


    /**
     * Sets the alertSMS value for this AccountInfo.
     * 
     * @param alertSMS
     */
    public void setAlertSMS(java.lang.String alertSMS) {
        this.alertSMS = alertSMS;
    }


    /**
     * Gets the alertWhatsApp value for this AccountInfo.
     * 
     * @return alertWhatsApp
     */
    public java.lang.String getAlertWhatsApp() {
        return alertWhatsApp;
    }


    /**
     * Sets the alertWhatsApp value for this AccountInfo.
     * 
     * @param alertWhatsApp
     */
    public void setAlertWhatsApp(java.lang.String alertWhatsApp) {
        this.alertWhatsApp = alertWhatsApp;
    }


    /**
     * Gets the codeAccountType value for this AccountInfo.
     * 
     * @return codeAccountType
     */
    public java.lang.String getCodeAccountType() {
        return codeAccountType;
    }


    /**
     * Sets the codeAccountType value for this AccountInfo.
     * 
     * @param codeAccountType
     */
    public void setCodeAccountType(java.lang.String codeAccountType) {
        this.codeAccountType = codeAccountType;
    }


    /**
     * Gets the codeArea value for this AccountInfo.
     * 
     * @return codeArea
     */
    public java.lang.String getCodeArea() {
        return codeArea;
    }


    /**
     * Sets the codeArea value for this AccountInfo.
     * 
     * @param codeArea
     */
    public void setCodeArea(java.lang.String codeArea) {
        this.codeArea = codeArea;
    }


    /**
     * Gets the codeCity value for this AccountInfo.
     * 
     * @return codeCity
     */
    public java.lang.String getCodeCity() {
        return codeCity;
    }


    /**
     * Sets the codeCity value for this AccountInfo.
     * 
     * @param codeCity
     */
    public void setCodeCity(java.lang.String codeCity) {
        this.codeCity = codeCity;
    }


    /**
     * Gets the codeCountry value for this AccountInfo.
     * 
     * @return codeCountry
     */
    public java.lang.String getCodeCountry() {
        return codeCountry;
    }


    /**
     * Sets the codeCountry value for this AccountInfo.
     * 
     * @param codeCountry
     */
    public void setCodeCountry(java.lang.String codeCountry) {
        this.codeCountry = codeCountry;
    }


    /**
     * Gets the codeProvince value for this AccountInfo.
     * 
     * @return codeProvince
     */
    public java.lang.String getCodeProvince() {
        return codeProvince;
    }


    /**
     * Sets the codeProvince value for this AccountInfo.
     * 
     * @param codeProvince
     */
    public void setCodeProvince(java.lang.String codeProvince) {
        this.codeProvince = codeProvince;
    }


    /**
     * Gets the codeSector value for this AccountInfo.
     * 
     * @return codeSector
     */
    public java.lang.String getCodeSector() {
        return codeSector;
    }


    /**
     * Sets the codeSector value for this AccountInfo.
     * 
     * @param codeSector
     */
    public void setCodeSector(java.lang.String codeSector) {
        this.codeSector = codeSector;
    }


    /**
     * Gets the codeStation value for this AccountInfo.
     * 
     * @return codeStation
     */
    public java.lang.String getCodeStation() {
        return codeStation;
    }


    /**
     * Sets the codeStation value for this AccountInfo.
     * 
     * @param codeStation
     */
    public void setCodeStation(java.lang.String codeStation) {
        this.codeStation = codeStation;
    }


    /**
     * Gets the codeWareHouseType value for this AccountInfo.
     * 
     * @return codeWareHouseType
     */
    public java.lang.String getCodeWareHouseType() {
        return codeWareHouseType;
    }


    /**
     * Sets the codeWareHouseType value for this AccountInfo.
     * 
     * @param codeWareHouseType
     */
    public void setCodeWareHouseType(java.lang.String codeWareHouseType) {
        this.codeWareHouseType = codeWareHouseType;
    }


    /**
     * Gets the contactPerson value for this AccountInfo.
     * 
     * @return contactPerson
     */
    public java.lang.String getContactPerson() {
        return contactPerson;
    }


    /**
     * Sets the contactPerson value for this AccountInfo.
     * 
     * @param contactPerson
     */
    public void setContactPerson(java.lang.String contactPerson) {
        this.contactPerson = contactPerson;
    }


    /**
     * Gets the customChargePercent value for this AccountInfo.
     * 
     * @return customChargePercent
     */
    public java.lang.Double getCustomChargePercent() {
        return customChargePercent;
    }


    /**
     * Sets the customChargePercent value for this AccountInfo.
     * 
     * @param customChargePercent
     */
    public void setCustomChargePercent(java.lang.Double customChargePercent) {
        this.customChargePercent = customChargePercent;
    }


    /**
     * Gets the customChargesMode value for this AccountInfo.
     * 
     * @return customChargesMode
     */
    public java.lang.String getCustomChargesMode() {
        return customChargesMode;
    }


    /**
     * Sets the customChargesMode value for this AccountInfo.
     * 
     * @param customChargesMode
     */
    public void setCustomChargesMode(java.lang.String customChargesMode) {
        this.customChargesMode = customChargesMode;
    }


    /**
     * Gets the email value for this AccountInfo.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this AccountInfo.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the fax value for this AccountInfo.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this AccountInfo.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the handlingChargesAmount value for this AccountInfo.
     * 
     * @return handlingChargesAmount
     */
    public java.lang.Double getHandlingChargesAmount() {
        return handlingChargesAmount;
    }


    /**
     * Sets the handlingChargesAmount value for this AccountInfo.
     * 
     * @param handlingChargesAmount
     */
    public void setHandlingChargesAmount(java.lang.Double handlingChargesAmount) {
        this.handlingChargesAmount = handlingChargesAmount;
    }


    /**
     * Gets the handlingChargesMode value for this AccountInfo.
     * 
     * @return handlingChargesMode
     */
    public java.lang.String getHandlingChargesMode() {
        return handlingChargesMode;
    }


    /**
     * Sets the handlingChargesMode value for this AccountInfo.
     * 
     * @param handlingChargesMode
     */
    public void setHandlingChargesMode(java.lang.String handlingChargesMode) {
        this.handlingChargesMode = handlingChargesMode;
    }


    /**
     * Gets the invoiceBlock value for this AccountInfo.
     * 
     * @return invoiceBlock
     */
    public java.lang.String getInvoiceBlock() {
        return invoiceBlock;
    }


    /**
     * Sets the invoiceBlock value for this AccountInfo.
     * 
     * @param invoiceBlock
     */
    public void setInvoiceBlock(java.lang.String invoiceBlock) {
        this.invoiceBlock = invoiceBlock;
    }


    /**
     * Gets the language value for this AccountInfo.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this AccountInfo.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the maxCalls value for this AccountInfo.
     * 
     * @return maxCalls
     */
    public java.lang.Long getMaxCalls() {
        return maxCalls;
    }


    /**
     * Sets the maxCalls value for this AccountInfo.
     * 
     * @param maxCalls
     */
    public void setMaxCalls(java.lang.Long maxCalls) {
        this.maxCalls = maxCalls;
    }


    /**
     * Gets the maxDelivery value for this AccountInfo.
     * 
     * @return maxDelivery
     */
    public java.lang.Long getMaxDelivery() {
        return maxDelivery;
    }


    /**
     * Sets the maxDelivery value for this AccountInfo.
     * 
     * @param maxDelivery
     */
    public void setMaxDelivery(java.lang.Long maxDelivery) {
        this.maxDelivery = maxDelivery;
    }


    /**
     * Gets the maxRTNDays value for this AccountInfo.
     * 
     * @return maxRTNDays
     */
    public java.lang.Long getMaxRTNDays() {
        return maxRTNDays;
    }


    /**
     * Sets the maxRTNDays value for this AccountInfo.
     * 
     * @param maxRTNDays
     */
    public void setMaxRTNDays(java.lang.Long maxRTNDays) {
        this.maxRTNDays = maxRTNDays;
    }


    /**
     * Gets the mobile value for this AccountInfo.
     * 
     * @return mobile
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this AccountInfo.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the NR value for this AccountInfo.
     * 
     * @return NR
     */
    public java.lang.String getNR() {
        return NR;
    }


    /**
     * Sets the NR value for this AccountInfo.
     * 
     * @param NR
     */
    public void setNR(java.lang.String NR) {
        this.NR = NR;
    }


    /**
     * Gets the openingBalance value for this AccountInfo.
     * 
     * @return openingBalance
     */
    public java.lang.Double getOpeningBalance() {
        return openingBalance;
    }


    /**
     * Sets the openingBalance value for this AccountInfo.
     * 
     * @param openingBalance
     */
    public void setOpeningBalance(java.lang.Double openingBalance) {
        this.openingBalance = openingBalance;
    }


    /**
     * Gets the PACINumber value for this AccountInfo.
     * 
     * @return PACINumber
     */
    public java.lang.String getPACINumber() {
        return PACINumber;
    }


    /**
     * Sets the PACINumber value for this AccountInfo.
     * 
     * @param PACINumber
     */
    public void setPACINumber(java.lang.String PACINumber) {
        this.PACINumber = PACINumber;
    }


    /**
     * Gets the pinCode value for this AccountInfo.
     * 
     * @return pinCode
     */
    public java.lang.String getPinCode() {
        return pinCode;
    }


    /**
     * Sets the pinCode value for this AccountInfo.
     * 
     * @param pinCode
     */
    public void setPinCode(java.lang.String pinCode) {
        this.pinCode = pinCode;
    }


    /**
     * Gets the salesCode value for this AccountInfo.
     * 
     * @return salesCode
     */
    public java.lang.String getSalesCode() {
        return salesCode;
    }


    /**
     * Sets the salesCode value for this AccountInfo.
     * 
     * @param salesCode
     */
    public void setSalesCode(java.lang.String salesCode) {
        this.salesCode = salesCode;
    }


    /**
     * Gets the status value for this AccountInfo.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AccountInfo.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the validIDNumber value for this AccountInfo.
     * 
     * @return validIDNumber
     */
    public java.lang.String getValidIDNumber() {
        return validIDNumber;
    }


    /**
     * Sets the validIDNumber value for this AccountInfo.
     * 
     * @param validIDNumber
     */
    public void setValidIDNumber(java.lang.String validIDNumber) {
        this.validIDNumber = validIDNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountInfo)) return false;
        AccountInfo other = (AccountInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountName==null && other.getAccountName()==null) || 
             (this.accountName!=null &&
              this.accountName.equals(other.getAccountName()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.accountPassword==null && other.getAccountPassword()==null) || 
             (this.accountPassword!=null &&
              this.accountPassword.equals(other.getAccountPassword()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.alertEmail==null && other.getAlertEmail()==null) || 
             (this.alertEmail!=null &&
              this.alertEmail.equals(other.getAlertEmail()))) &&
            ((this.alertEventCode==null && other.getAlertEventCode()==null) || 
             (this.alertEventCode!=null &&
              java.util.Arrays.equals(this.alertEventCode, other.getAlertEventCode()))) &&
            ((this.alertSMS==null && other.getAlertSMS()==null) || 
             (this.alertSMS!=null &&
              this.alertSMS.equals(other.getAlertSMS()))) &&
            ((this.alertWhatsApp==null && other.getAlertWhatsApp()==null) || 
             (this.alertWhatsApp!=null &&
              this.alertWhatsApp.equals(other.getAlertWhatsApp()))) &&
            ((this.codeAccountType==null && other.getCodeAccountType()==null) || 
             (this.codeAccountType!=null &&
              this.codeAccountType.equals(other.getCodeAccountType()))) &&
            ((this.codeArea==null && other.getCodeArea()==null) || 
             (this.codeArea!=null &&
              this.codeArea.equals(other.getCodeArea()))) &&
            ((this.codeCity==null && other.getCodeCity()==null) || 
             (this.codeCity!=null &&
              this.codeCity.equals(other.getCodeCity()))) &&
            ((this.codeCountry==null && other.getCodeCountry()==null) || 
             (this.codeCountry!=null &&
              this.codeCountry.equals(other.getCodeCountry()))) &&
            ((this.codeProvince==null && other.getCodeProvince()==null) || 
             (this.codeProvince!=null &&
              this.codeProvince.equals(other.getCodeProvince()))) &&
            ((this.codeSector==null && other.getCodeSector()==null) || 
             (this.codeSector!=null &&
              this.codeSector.equals(other.getCodeSector()))) &&
            ((this.codeStation==null && other.getCodeStation()==null) || 
             (this.codeStation!=null &&
              this.codeStation.equals(other.getCodeStation()))) &&
            ((this.codeWareHouseType==null && other.getCodeWareHouseType()==null) || 
             (this.codeWareHouseType!=null &&
              this.codeWareHouseType.equals(other.getCodeWareHouseType()))) &&
            ((this.contactPerson==null && other.getContactPerson()==null) || 
             (this.contactPerson!=null &&
              this.contactPerson.equals(other.getContactPerson()))) &&
            ((this.customChargePercent==null && other.getCustomChargePercent()==null) || 
             (this.customChargePercent!=null &&
              this.customChargePercent.equals(other.getCustomChargePercent()))) &&
            ((this.customChargesMode==null && other.getCustomChargesMode()==null) || 
             (this.customChargesMode!=null &&
              this.customChargesMode.equals(other.getCustomChargesMode()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.handlingChargesAmount==null && other.getHandlingChargesAmount()==null) || 
             (this.handlingChargesAmount!=null &&
              this.handlingChargesAmount.equals(other.getHandlingChargesAmount()))) &&
            ((this.handlingChargesMode==null && other.getHandlingChargesMode()==null) || 
             (this.handlingChargesMode!=null &&
              this.handlingChargesMode.equals(other.getHandlingChargesMode()))) &&
            ((this.invoiceBlock==null && other.getInvoiceBlock()==null) || 
             (this.invoiceBlock!=null &&
              this.invoiceBlock.equals(other.getInvoiceBlock()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.maxCalls==null && other.getMaxCalls()==null) || 
             (this.maxCalls!=null &&
              this.maxCalls.equals(other.getMaxCalls()))) &&
            ((this.maxDelivery==null && other.getMaxDelivery()==null) || 
             (this.maxDelivery!=null &&
              this.maxDelivery.equals(other.getMaxDelivery()))) &&
            ((this.maxRTNDays==null && other.getMaxRTNDays()==null) || 
             (this.maxRTNDays!=null &&
              this.maxRTNDays.equals(other.getMaxRTNDays()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.NR==null && other.getNR()==null) || 
             (this.NR!=null &&
              this.NR.equals(other.getNR()))) &&
            ((this.openingBalance==null && other.getOpeningBalance()==null) || 
             (this.openingBalance!=null &&
              this.openingBalance.equals(other.getOpeningBalance()))) &&
            ((this.PACINumber==null && other.getPACINumber()==null) || 
             (this.PACINumber!=null &&
              this.PACINumber.equals(other.getPACINumber()))) &&
            ((this.pinCode==null && other.getPinCode()==null) || 
             (this.pinCode!=null &&
              this.pinCode.equals(other.getPinCode()))) &&
            ((this.salesCode==null && other.getSalesCode()==null) || 
             (this.salesCode!=null &&
              this.salesCode.equals(other.getSalesCode()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.validIDNumber==null && other.getValidIDNumber()==null) || 
             (this.validIDNumber!=null &&
              this.validIDNumber.equals(other.getValidIDNumber())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccountName() != null) {
            _hashCode += getAccountName().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAccountPassword() != null) {
            _hashCode += getAccountPassword().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAlertEmail() != null) {
            _hashCode += getAlertEmail().hashCode();
        }
        if (getAlertEventCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlertEventCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlertEventCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAlertSMS() != null) {
            _hashCode += getAlertSMS().hashCode();
        }
        if (getAlertWhatsApp() != null) {
            _hashCode += getAlertWhatsApp().hashCode();
        }
        if (getCodeAccountType() != null) {
            _hashCode += getCodeAccountType().hashCode();
        }
        if (getCodeArea() != null) {
            _hashCode += getCodeArea().hashCode();
        }
        if (getCodeCity() != null) {
            _hashCode += getCodeCity().hashCode();
        }
        if (getCodeCountry() != null) {
            _hashCode += getCodeCountry().hashCode();
        }
        if (getCodeProvince() != null) {
            _hashCode += getCodeProvince().hashCode();
        }
        if (getCodeSector() != null) {
            _hashCode += getCodeSector().hashCode();
        }
        if (getCodeStation() != null) {
            _hashCode += getCodeStation().hashCode();
        }
        if (getCodeWareHouseType() != null) {
            _hashCode += getCodeWareHouseType().hashCode();
        }
        if (getContactPerson() != null) {
            _hashCode += getContactPerson().hashCode();
        }
        if (getCustomChargePercent() != null) {
            _hashCode += getCustomChargePercent().hashCode();
        }
        if (getCustomChargesMode() != null) {
            _hashCode += getCustomChargesMode().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getHandlingChargesAmount() != null) {
            _hashCode += getHandlingChargesAmount().hashCode();
        }
        if (getHandlingChargesMode() != null) {
            _hashCode += getHandlingChargesMode().hashCode();
        }
        if (getInvoiceBlock() != null) {
            _hashCode += getInvoiceBlock().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getMaxCalls() != null) {
            _hashCode += getMaxCalls().hashCode();
        }
        if (getMaxDelivery() != null) {
            _hashCode += getMaxDelivery().hashCode();
        }
        if (getMaxRTNDays() != null) {
            _hashCode += getMaxRTNDays().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getNR() != null) {
            _hashCode += getNR().hashCode();
        }
        if (getOpeningBalance() != null) {
            _hashCode += getOpeningBalance().hashCode();
        }
        if (getPACINumber() != null) {
            _hashCode += getPACINumber().hashCode();
        }
        if (getPinCode() != null) {
            _hashCode += getPinCode().hashCode();
        }
        if (getSalesCode() != null) {
            _hashCode += getSalesCode().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getValidIDNumber() != null) {
            _hashCode += getValidIDNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "AccountInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "AccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "AccountPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "AlertEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertEventCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "AlertEventCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "AlertEventCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "AlertEventCode"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertSMS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "AlertSMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertWhatsApp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "AlertWhatsApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "CodeAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "CodeArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "CodeCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "CodeCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeProvince");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "CodeProvince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeSector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "CodeSector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeStation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "CodeStation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeWareHouseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "CodeWareHouseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "ContactPerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customChargePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "CustomChargePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customChargesMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "CustomChargesMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "Fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingChargesAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "HandlingChargesAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingChargesMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "HandlingChargesMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "InvoiceBlock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "MaxCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "MaxDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRTNDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "MaxRTNDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "Mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "NR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openingBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "OpeningBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PACINumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "PACINumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "PinCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "SalesCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validIDNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "ValidIDNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
