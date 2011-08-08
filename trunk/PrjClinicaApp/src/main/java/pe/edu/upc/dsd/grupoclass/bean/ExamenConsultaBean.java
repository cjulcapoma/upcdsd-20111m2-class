/**
 * ExamenConsultaBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.edu.upc.dsd.grupoclass.bean;

public class ExamenConsultaBean  implements java.io.Serializable {
    private int cantidad;

    private java.lang.String coExamenMedico;

    private int idExamenMedico;

    private java.lang.String noExamen;

    private java.lang.String resultado;

    public ExamenConsultaBean() {
    }

    public ExamenConsultaBean(
           int cantidad,
           java.lang.String coExamenMedico,
           int idExamenMedico,
           java.lang.String noExamen,
           java.lang.String resultado) {
           this.cantidad = cantidad;
           this.coExamenMedico = coExamenMedico;
           this.idExamenMedico = idExamenMedico;
           this.noExamen = noExamen;
           this.resultado = resultado;
    }


    /**
     * Gets the cantidad value for this ExamenConsultaBean.
     * 
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }


    /**
     * Sets the cantidad value for this ExamenConsultaBean.
     * 
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    /**
     * Gets the coExamenMedico value for this ExamenConsultaBean.
     * 
     * @return coExamenMedico
     */
    public java.lang.String getCoExamenMedico() {
        return coExamenMedico;
    }


    /**
     * Sets the coExamenMedico value for this ExamenConsultaBean.
     * 
     * @param coExamenMedico
     */
    public void setCoExamenMedico(java.lang.String coExamenMedico) {
        this.coExamenMedico = coExamenMedico;
    }


    /**
     * Gets the idExamenMedico value for this ExamenConsultaBean.
     * 
     * @return idExamenMedico
     */
    public int getIdExamenMedico() {
        return idExamenMedico;
    }


    /**
     * Sets the idExamenMedico value for this ExamenConsultaBean.
     * 
     * @param idExamenMedico
     */
    public void setIdExamenMedico(int idExamenMedico) {
        this.idExamenMedico = idExamenMedico;
    }


    /**
     * Gets the noExamen value for this ExamenConsultaBean.
     * 
     * @return noExamen
     */
    public java.lang.String getNoExamen() {
        return noExamen;
    }


    /**
     * Sets the noExamen value for this ExamenConsultaBean.
     * 
     * @param noExamen
     */
    public void setNoExamen(java.lang.String noExamen) {
        this.noExamen = noExamen;
    }


    /**
     * Gets the resultado value for this ExamenConsultaBean.
     * 
     * @return resultado
     */
    public java.lang.String getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this ExamenConsultaBean.
     * 
     * @param resultado
     */
    public void setResultado(java.lang.String resultado) {
        this.resultado = resultado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExamenConsultaBean)) return false;
        ExamenConsultaBean other = (ExamenConsultaBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cantidad == other.getCantidad() &&
            ((this.coExamenMedico==null && other.getCoExamenMedico()==null) || 
             (this.coExamenMedico!=null &&
              this.coExamenMedico.equals(other.getCoExamenMedico()))) &&
            this.idExamenMedico == other.getIdExamenMedico() &&
            ((this.noExamen==null && other.getNoExamen()==null) || 
             (this.noExamen!=null &&
              this.noExamen.equals(other.getNoExamen()))) &&
            ((this.resultado==null && other.getResultado()==null) || 
             (this.resultado!=null &&
              this.resultado.equals(other.getResultado())));
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
        _hashCode += getCantidad();
        if (getCoExamenMedico() != null) {
            _hashCode += getCoExamenMedico().hashCode();
        }
        _hashCode += getIdExamenMedico();
        if (getNoExamen() != null) {
            _hashCode += getNoExamen().hashCode();
        }
        if (getResultado() != null) {
            _hashCode += getResultado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExamenConsultaBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.grupoclass.dsd.upc.edu.pe/", "examenConsultaBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cantidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coExamenMedico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coExamenMedico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idExamenMedico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idExamenMedico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noExamen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noExamen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
