/**
 * DoctorBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.edu.upc.dsd.grupoclass.bean;

public class DoctorBean  implements java.io.Serializable {
    private java.lang.String deHorario;

    private int idDoctor;

    private java.lang.String noDoctor;

    private java.lang.String noEspecialidad;

    private java.lang.String noSucursal;

    public DoctorBean() {
    }

    public DoctorBean(
           java.lang.String deHorario,
           int idDoctor,
           java.lang.String noDoctor,
           java.lang.String noEspecialidad,
           java.lang.String noSucursal) {
           this.deHorario = deHorario;
           this.idDoctor = idDoctor;
           this.noDoctor = noDoctor;
           this.noEspecialidad = noEspecialidad;
           this.noSucursal = noSucursal;
    }


    /**
     * Gets the deHorario value for this DoctorBean.
     * 
     * @return deHorario
     */
    public java.lang.String getDeHorario() {
        return deHorario;
    }


    /**
     * Sets the deHorario value for this DoctorBean.
     * 
     * @param deHorario
     */
    public void setDeHorario(java.lang.String deHorario) {
        this.deHorario = deHorario;
    }


    /**
     * Gets the idDoctor value for this DoctorBean.
     * 
     * @return idDoctor
     */
    public int getIdDoctor() {
        return idDoctor;
    }


    /**
     * Sets the idDoctor value for this DoctorBean.
     * 
     * @param idDoctor
     */
    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }


    /**
     * Gets the noDoctor value for this DoctorBean.
     * 
     * @return noDoctor
     */
    public java.lang.String getNoDoctor() {
        return noDoctor;
    }


    /**
     * Sets the noDoctor value for this DoctorBean.
     * 
     * @param noDoctor
     */
    public void setNoDoctor(java.lang.String noDoctor) {
        this.noDoctor = noDoctor;
    }


    /**
     * Gets the noEspecialidad value for this DoctorBean.
     * 
     * @return noEspecialidad
     */
    public java.lang.String getNoEspecialidad() {
        return noEspecialidad;
    }


    /**
     * Sets the noEspecialidad value for this DoctorBean.
     * 
     * @param noEspecialidad
     */
    public void setNoEspecialidad(java.lang.String noEspecialidad) {
        this.noEspecialidad = noEspecialidad;
    }


    /**
     * Gets the noSucursal value for this DoctorBean.
     * 
     * @return noSucursal
     */
    public java.lang.String getNoSucursal() {
        return noSucursal;
    }


    /**
     * Sets the noSucursal value for this DoctorBean.
     * 
     * @param noSucursal
     */
    public void setNoSucursal(java.lang.String noSucursal) {
        this.noSucursal = noSucursal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoctorBean)) return false;
        DoctorBean other = (DoctorBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deHorario==null && other.getDeHorario()==null) || 
             (this.deHorario!=null &&
              this.deHorario.equals(other.getDeHorario()))) &&
            this.idDoctor == other.getIdDoctor() &&
            ((this.noDoctor==null && other.getNoDoctor()==null) || 
             (this.noDoctor!=null &&
              this.noDoctor.equals(other.getNoDoctor()))) &&
            ((this.noEspecialidad==null && other.getNoEspecialidad()==null) || 
             (this.noEspecialidad!=null &&
              this.noEspecialidad.equals(other.getNoEspecialidad()))) &&
            ((this.noSucursal==null && other.getNoSucursal()==null) || 
             (this.noSucursal!=null &&
              this.noSucursal.equals(other.getNoSucursal())));
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
        if (getDeHorario() != null) {
            _hashCode += getDeHorario().hashCode();
        }
        _hashCode += getIdDoctor();
        if (getNoDoctor() != null) {
            _hashCode += getNoDoctor().hashCode();
        }
        if (getNoEspecialidad() != null) {
            _hashCode += getNoEspecialidad().hashCode();
        }
        if (getNoSucursal() != null) {
            _hashCode += getNoSucursal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoctorBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.grupoclass.dsd.upc.edu.pe/", "doctorBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deHorario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deHorario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idDoctor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idDoctor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noDoctor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noDoctor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noEspecialidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noEspecialidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noSucursal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noSucursal"));
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
