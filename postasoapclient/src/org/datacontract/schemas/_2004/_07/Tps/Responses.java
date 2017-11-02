/**
 * Responses.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Tps;

public class Responses  implements java.io.Serializable {
    private java.lang.String errorMessage;

    private java.lang.String requestSequence;

    private java.lang.String response;

    private java.lang.String responseMessage;

    private java.lang.String responseResult;

    public Responses() {
    }

    public Responses(
           java.lang.String errorMessage,
           java.lang.String requestSequence,
           java.lang.String response,
           java.lang.String responseMessage,
           java.lang.String responseResult) {
           this.errorMessage = errorMessage;
           this.requestSequence = requestSequence;
           this.response = response;
           this.responseMessage = responseMessage;
           this.responseResult = responseResult;
    }


    /**
     * Gets the errorMessage value for this Responses.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this Responses.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the requestSequence value for this Responses.
     * 
     * @return requestSequence
     */
    public java.lang.String getRequestSequence() {
        return requestSequence;
    }


    /**
     * Sets the requestSequence value for this Responses.
     * 
     * @param requestSequence
     */
    public void setRequestSequence(java.lang.String requestSequence) {
        this.requestSequence = requestSequence;
    }


    /**
     * Gets the response value for this Responses.
     * 
     * @return response
     */
    public java.lang.String getResponse() {
        return response;
    }


    /**
     * Sets the response value for this Responses.
     * 
     * @param response
     */
    public void setResponse(java.lang.String response) {
        this.response = response;
    }


    /**
     * Gets the responseMessage value for this Responses.
     * 
     * @return responseMessage
     */
    public java.lang.String getResponseMessage() {
        return responseMessage;
    }


    /**
     * Sets the responseMessage value for this Responses.
     * 
     * @param responseMessage
     */
    public void setResponseMessage(java.lang.String responseMessage) {
        this.responseMessage = responseMessage;
    }


    /**
     * Gets the responseResult value for this Responses.
     * 
     * @return responseResult
     */
    public java.lang.String getResponseResult() {
        return responseResult;
    }


    /**
     * Sets the responseResult value for this Responses.
     * 
     * @param responseResult
     */
    public void setResponseResult(java.lang.String responseResult) {
        this.responseResult = responseResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Responses)) return false;
        Responses other = (Responses) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.requestSequence==null && other.getRequestSequence()==null) || 
             (this.requestSequence!=null &&
              this.requestSequence.equals(other.getRequestSequence()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse()))) &&
            ((this.responseMessage==null && other.getResponseMessage()==null) || 
             (this.responseMessage!=null &&
              this.responseMessage.equals(other.getResponseMessage()))) &&
            ((this.responseResult==null && other.getResponseResult()==null) || 
             (this.responseResult!=null &&
              this.responseResult.equals(other.getResponseResult())));
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
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getRequestSequence() != null) {
            _hashCode += getRequestSequence().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        if (getResponseMessage() != null) {
            _hashCode += getResponseMessage().hashCode();
        }
        if (getResponseResult() != null) {
            _hashCode += getResponseResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Responses.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "Responses"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "ErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "RequestSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "Response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "ResponseMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Tps", "ResponseResult"));
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
