/**
 * MedicamentoRecetaBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.edu.upc.dsd.grupoclass.bean;

public class MedicamentoRecetaBean  implements java.io.Serializable {
    private int cantidad;

    private java.lang.String coMedicamento;

    private int idMedicamento;

    private java.lang.String noMedicamento;

    private double precio;

    public MedicamentoRecetaBean() {
    }

    public MedicamentoRecetaBean(
           int cantidad,
           java.lang.String coMedicamento,
           int idMedicamento,
           java.lang.String noMedicamento,
           double precio) {
           this.cantidad = cantidad;
           this.coMedicamento = coMedicamento;
           this.idMedicamento = idMedicamento;
           this.noMedicamento = noMedicamento;
           this.precio = precio;
    }


    /**
     * Gets the cantidad value for this MedicamentoRecetaBean.
     * 
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }


    /**
     * Sets the cantidad value for this MedicamentoRecetaBean.
     * 
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    /**
     * Gets the coMedicamento value for this MedicamentoRecetaBean.
     * 
     * @return coMedicamento
     */
    public java.lang.String getCoMedicamento() {
        return coMedicamento;
    }


    /**
     * Sets the coMedicamento value for this MedicamentoRecetaBean.
     * 
     * @param coMedicamento
     */
    public void setCoMedicamento(java.lang.String coMedicamento) {
        this.coMedicamento = coMedicamento;
    }


    /**
     * Gets the idMedicamento value for this MedicamentoRecetaBean.
     * 
     * @return idMedicamento
     */
    public int getIdMedicamento() {
        return idMedicamento;
    }


    /**
     * Sets the idMedicamento value for this MedicamentoRecetaBean.
     * 
     * @param idMedicamento
     */
    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }


    /**
     * Gets the noMedicamento value for this MedicamentoRecetaBean.
     * 
     * @return noMedicamento
     */
    public java.lang.String getNoMedicamento() {
        return noMedicamento;
    }


    /**
     * Sets the noMedicamento value for this MedicamentoRecetaBean.
     * 
     * @param noMedicamento
     */
    public void setNoMedicamento(java.lang.String noMedicamento) {
        this.noMedicamento = noMedicamento;
    }


    /**
     * Gets the precio value for this MedicamentoRecetaBean.
     * 
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }


    /**
     * Sets the precio value for this MedicamentoRecetaBean.
     * 
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedicamentoRecetaBean)) return false;
        MedicamentoRecetaBean other = (MedicamentoRecetaBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cantidad == other.getCantidad() &&
            ((this.coMedicamento==null && other.getCoMedicamento()==null) || 
             (this.coMedicamento!=null &&
              this.coMedicamento.equals(other.getCoMedicamento()))) &&
            this.idMedicamento == other.getIdMedicamento() &&
            ((this.noMedicamento==null && other.getNoMedicamento()==null) || 
             (this.noMedicamento!=null &&
              this.noMedicamento.equals(other.getNoMedicamento()))) &&
            this.precio == other.getPrecio();
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
        if (getCoMedicamento() != null) {
            _hashCode += getCoMedicamento().hashCode();
        }
        _hashCode += getIdMedicamento();
        if (getNoMedicamento() != null) {
            _hashCode += getNoMedicamento().hashCode();
        }
        _hashCode += new Double(getPrecio()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MedicamentoRecetaBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.grupoclass.dsd.upc.edu.pe/", "medicamentoRecetaBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cantidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coMedicamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coMedicamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idMedicamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idMedicamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noMedicamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noMedicamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "precio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
