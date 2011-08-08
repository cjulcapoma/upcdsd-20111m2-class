/**
 * ReservaMedicaBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.edu.upc.dsd.grupoclass.bean;

import pe.edu.upc.dsd.grupoclass.bean.ReservaMedicaBean;

public class ReservaMedicaBean  implements java.io.Serializable {
    private java.lang.String dniPaciente;

    private pe.edu.upc.dsd.grupoclass.bean.DoctorBean doctor;

    private java.util.Calendar fechaHoraReserva;

    private int idReservaMedica;

    private boolean indReserva;

    private java.lang.String noPaciente;

    public ReservaMedicaBean() {
    }

    public ReservaMedicaBean(
           java.lang.String dniPaciente,
           pe.edu.upc.dsd.grupoclass.bean.DoctorBean doctor,
           java.util.Calendar fechaHoraReserva,
           int idReservaMedica,
           boolean indReserva,
           java.lang.String noPaciente) {
           this.dniPaciente = dniPaciente;
           this.doctor = doctor;
           this.fechaHoraReserva = fechaHoraReserva;
           this.idReservaMedica = idReservaMedica;
           this.indReserva = indReserva;
           this.noPaciente = noPaciente;
    }


    /**
     * Gets the dniPaciente value for this ReservaMedicaBean.
     * 
     * @return dniPaciente
     */
    public java.lang.String getDniPaciente() {
        return dniPaciente;
    }


    /**
     * Sets the dniPaciente value for this ReservaMedicaBean.
     * 
     * @param dniPaciente
     */
    public void setDniPaciente(java.lang.String dniPaciente) {
        this.dniPaciente = dniPaciente;
    }


    /**
     * Gets the doctor value for this ReservaMedicaBean.
     * 
     * @return doctor
     */
    public pe.edu.upc.dsd.grupoclass.bean.DoctorBean getDoctor() {
        return doctor;
    }


    /**
     * Sets the doctor value for this ReservaMedicaBean.
     * 
     * @param doctor
     */
    public void setDoctor(pe.edu.upc.dsd.grupoclass.bean.DoctorBean doctor) {
        this.doctor = doctor;
    }


    /**
     * Gets the fechaHoraReserva value for this ReservaMedicaBean.
     * 
     * @return fechaHoraReserva
     */
    public java.util.Calendar getFechaHoraReserva() {
        return fechaHoraReserva;
    }


    /**
     * Sets the fechaHoraReserva value for this ReservaMedicaBean.
     * 
     * @param fechaHoraReserva
     */
    public void setFechaHoraReserva(java.util.Calendar fechaHoraReserva) {
        this.fechaHoraReserva = fechaHoraReserva;
    }


    /**
     * Gets the idReservaMedica value for this ReservaMedicaBean.
     * 
     * @return idReservaMedica
     */
    public int getIdReservaMedica() {
        return idReservaMedica;
    }


    /**
     * Sets the idReservaMedica value for this ReservaMedicaBean.
     * 
     * @param idReservaMedica
     */
    public void setIdReservaMedica(int idReservaMedica) {
        this.idReservaMedica = idReservaMedica;
    }


    /**
     * Gets the indReserva value for this ReservaMedicaBean.
     * 
     * @return indReserva
     */
    public boolean isIndReserva() {
        return indReserva;
    }


    /**
     * Sets the indReserva value for this ReservaMedicaBean.
     * 
     * @param indReserva
     */
    public void setIndReserva(boolean indReserva) {
        this.indReserva = indReserva;
    }


    /**
     * Gets the noPaciente value for this ReservaMedicaBean.
     * 
     * @return noPaciente
     */
    public java.lang.String getNoPaciente() {
        return noPaciente;
    }


    /**
     * Sets the noPaciente value for this ReservaMedicaBean.
     * 
     * @param noPaciente
     */
    public void setNoPaciente(java.lang.String noPaciente) {
        this.noPaciente = noPaciente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservaMedicaBean)) return false;
        ReservaMedicaBean other = (ReservaMedicaBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dniPaciente==null && other.getDniPaciente()==null) || 
             (this.dniPaciente!=null &&
              this.dniPaciente.equals(other.getDniPaciente()))) &&
            ((this.doctor==null && other.getDoctor()==null) || 
             (this.doctor!=null &&
              this.doctor.equals(other.getDoctor()))) &&
            ((this.fechaHoraReserva==null && other.getFechaHoraReserva()==null) || 
             (this.fechaHoraReserva!=null &&
              this.fechaHoraReserva.equals(other.getFechaHoraReserva()))) &&
            this.idReservaMedica == other.getIdReservaMedica() &&
            this.indReserva == other.isIndReserva() &&
            ((this.noPaciente==null && other.getNoPaciente()==null) || 
             (this.noPaciente!=null &&
              this.noPaciente.equals(other.getNoPaciente())));
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
        if (getDniPaciente() != null) {
            _hashCode += getDniPaciente().hashCode();
        }
        if (getDoctor() != null) {
            _hashCode += getDoctor().hashCode();
        }
        if (getFechaHoraReserva() != null) {
            _hashCode += getFechaHoraReserva().hashCode();
        }
        _hashCode += getIdReservaMedica();
        _hashCode += (isIndReserva() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNoPaciente() != null) {
            _hashCode += getNoPaciente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservaMedicaBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.grupoclass.dsd.upc.edu.pe/", "reservaMedicaBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dniPaciente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dniPaciente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doctor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doctor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.grupoclass.dsd.upc.edu.pe/", "doctorBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHoraReserva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaHoraReserva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idReservaMedica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idReservaMedica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indReserva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indReserva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noPaciente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noPaciente"));
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
