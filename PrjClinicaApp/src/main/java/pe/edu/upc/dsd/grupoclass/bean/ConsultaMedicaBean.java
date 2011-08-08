/**
 * ConsultaMedicaBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.edu.upc.dsd.grupoclass.bean;

public class ConsultaMedicaBean  implements java.io.Serializable {
    private java.lang.String diagnostico;

    private java.lang.String dniPaciente;

    private pe.edu.upc.dsd.grupoclass.bean.DoctorBean doctor;

    private java.util.Calendar fechaHoraConsulta;

    private int idConsultaMedica;

    private int idReservaMedica;

    private pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean[] listaExamenes;

    private pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean[] listaMedicamentos;

    private java.lang.String noPaciente;

    private java.lang.String tratamiento;

    public ConsultaMedicaBean() {
    }

    public ConsultaMedicaBean(
           java.lang.String diagnostico,
           java.lang.String dniPaciente,
           pe.edu.upc.dsd.grupoclass.bean.DoctorBean doctor,
           java.util.Calendar fechaHoraConsulta,
           int idConsultaMedica,
           int idReservaMedica,
           pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean[] listaExamenes,
           pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean[] listaMedicamentos,
           java.lang.String noPaciente,
           java.lang.String tratamiento) {
           this.diagnostico = diagnostico;
           this.dniPaciente = dniPaciente;
           this.doctor = doctor;
           this.fechaHoraConsulta = fechaHoraConsulta;
           this.idConsultaMedica = idConsultaMedica;
           this.idReservaMedica = idReservaMedica;
           this.listaExamenes = listaExamenes;
           this.listaMedicamentos = listaMedicamentos;
           this.noPaciente = noPaciente;
           this.tratamiento = tratamiento;
    }


    /**
     * Gets the diagnostico value for this ConsultaMedicaBean.
     * 
     * @return diagnostico
     */
    public java.lang.String getDiagnostico() {
        return diagnostico;
    }


    /**
     * Sets the diagnostico value for this ConsultaMedicaBean.
     * 
     * @param diagnostico
     */
    public void setDiagnostico(java.lang.String diagnostico) {
        this.diagnostico = diagnostico;
    }


    /**
     * Gets the dniPaciente value for this ConsultaMedicaBean.
     * 
     * @return dniPaciente
     */
    public java.lang.String getDniPaciente() {
        return dniPaciente;
    }


    /**
     * Sets the dniPaciente value for this ConsultaMedicaBean.
     * 
     * @param dniPaciente
     */
    public void setDniPaciente(java.lang.String dniPaciente) {
        this.dniPaciente = dniPaciente;
    }


    /**
     * Gets the doctor value for this ConsultaMedicaBean.
     * 
     * @return doctor
     */
    public pe.edu.upc.dsd.grupoclass.bean.DoctorBean getDoctor() {
        return doctor;
    }


    /**
     * Sets the doctor value for this ConsultaMedicaBean.
     * 
     * @param doctor
     */
    public void setDoctor(pe.edu.upc.dsd.grupoclass.bean.DoctorBean doctor) {
        this.doctor = doctor;
    }


    /**
     * Gets the fechaHoraConsulta value for this ConsultaMedicaBean.
     * 
     * @return fechaHoraConsulta
     */
    public java.util.Calendar getFechaHoraConsulta() {
        return fechaHoraConsulta;
    }


    /**
     * Sets the fechaHoraConsulta value for this ConsultaMedicaBean.
     * 
     * @param fechaHoraConsulta
     */
    public void setFechaHoraConsulta(java.util.Calendar fechaHoraConsulta) {
        this.fechaHoraConsulta = fechaHoraConsulta;
    }


    /**
     * Gets the idConsultaMedica value for this ConsultaMedicaBean.
     * 
     * @return idConsultaMedica
     */
    public int getIdConsultaMedica() {
        return idConsultaMedica;
    }


    /**
     * Sets the idConsultaMedica value for this ConsultaMedicaBean.
     * 
     * @param idConsultaMedica
     */
    public void setIdConsultaMedica(int idConsultaMedica) {
        this.idConsultaMedica = idConsultaMedica;
    }


    /**
     * Gets the idReservaMedica value for this ConsultaMedicaBean.
     * 
     * @return idReservaMedica
     */
    public int getIdReservaMedica() {
        return idReservaMedica;
    }


    /**
     * Sets the idReservaMedica value for this ConsultaMedicaBean.
     * 
     * @param idReservaMedica
     */
    public void setIdReservaMedica(int idReservaMedica) {
        this.idReservaMedica = idReservaMedica;
    }


    /**
     * Gets the listaExamenes value for this ConsultaMedicaBean.
     * 
     * @return listaExamenes
     */
    public pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean[] getListaExamenes() {
        return listaExamenes;
    }


    /**
     * Sets the listaExamenes value for this ConsultaMedicaBean.
     * 
     * @param listaExamenes
     */
    public void setListaExamenes(pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean[] listaExamenes) {
        this.listaExamenes = listaExamenes;
    }

    public pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean getListaExamenes(int i) {
        return this.listaExamenes[i];
    }

    public void setListaExamenes(int i, pe.edu.upc.dsd.grupoclass.bean.ExamenConsultaBean _value) {
        this.listaExamenes[i] = _value;
    }


    /**
     * Gets the listaMedicamentos value for this ConsultaMedicaBean.
     * 
     * @return listaMedicamentos
     */
    public pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean[] getListaMedicamentos() {
        return listaMedicamentos;
    }


    /**
     * Sets the listaMedicamentos value for this ConsultaMedicaBean.
     * 
     * @param listaMedicamentos
     */
    public void setListaMedicamentos(pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean[] listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }

    public pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean getListaMedicamentos(int i) {
        return this.listaMedicamentos[i];
    }

    public void setListaMedicamentos(int i, pe.edu.upc.dsd.grupoclass.bean.MedicamentoRecetaBean _value) {
        this.listaMedicamentos[i] = _value;
    }


    /**
     * Gets the noPaciente value for this ConsultaMedicaBean.
     * 
     * @return noPaciente
     */
    public java.lang.String getNoPaciente() {
        return noPaciente;
    }


    /**
     * Sets the noPaciente value for this ConsultaMedicaBean.
     * 
     * @param noPaciente
     */
    public void setNoPaciente(java.lang.String noPaciente) {
        this.noPaciente = noPaciente;
    }


    /**
     * Gets the tratamiento value for this ConsultaMedicaBean.
     * 
     * @return tratamiento
     */
    public java.lang.String getTratamiento() {
        return tratamiento;
    }


    /**
     * Sets the tratamiento value for this ConsultaMedicaBean.
     * 
     * @param tratamiento
     */
    public void setTratamiento(java.lang.String tratamiento) {
        this.tratamiento = tratamiento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaMedicaBean)) return false;
        ConsultaMedicaBean other = (ConsultaMedicaBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.diagnostico==null && other.getDiagnostico()==null) || 
             (this.diagnostico!=null &&
              this.diagnostico.equals(other.getDiagnostico()))) &&
            ((this.dniPaciente==null && other.getDniPaciente()==null) || 
             (this.dniPaciente!=null &&
              this.dniPaciente.equals(other.getDniPaciente()))) &&
            ((this.doctor==null && other.getDoctor()==null) || 
             (this.doctor!=null &&
              this.doctor.equals(other.getDoctor()))) &&
            ((this.fechaHoraConsulta==null && other.getFechaHoraConsulta()==null) || 
             (this.fechaHoraConsulta!=null &&
              this.fechaHoraConsulta.equals(other.getFechaHoraConsulta()))) &&
            this.idConsultaMedica == other.getIdConsultaMedica() &&
            this.idReservaMedica == other.getIdReservaMedica() &&
            ((this.listaExamenes==null && other.getListaExamenes()==null) || 
             (this.listaExamenes!=null &&
              java.util.Arrays.equals(this.listaExamenes, other.getListaExamenes()))) &&
            ((this.listaMedicamentos==null && other.getListaMedicamentos()==null) || 
             (this.listaMedicamentos!=null &&
              java.util.Arrays.equals(this.listaMedicamentos, other.getListaMedicamentos()))) &&
            ((this.noPaciente==null && other.getNoPaciente()==null) || 
             (this.noPaciente!=null &&
              this.noPaciente.equals(other.getNoPaciente()))) &&
            ((this.tratamiento==null && other.getTratamiento()==null) || 
             (this.tratamiento!=null &&
              this.tratamiento.equals(other.getTratamiento())));
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
        if (getDiagnostico() != null) {
            _hashCode += getDiagnostico().hashCode();
        }
        if (getDniPaciente() != null) {
            _hashCode += getDniPaciente().hashCode();
        }
        if (getDoctor() != null) {
            _hashCode += getDoctor().hashCode();
        }
        if (getFechaHoraConsulta() != null) {
            _hashCode += getFechaHoraConsulta().hashCode();
        }
        _hashCode += getIdConsultaMedica();
        _hashCode += getIdReservaMedica();
        if (getListaExamenes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaExamenes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaExamenes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaMedicamentos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaMedicamentos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaMedicamentos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNoPaciente() != null) {
            _hashCode += getNoPaciente().hashCode();
        }
        if (getTratamiento() != null) {
            _hashCode += getTratamiento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaMedicaBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.grupoclass.dsd.upc.edu.pe/", "consultaMedicaBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnostico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diagnostico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("fechaHoraConsulta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaHoraConsulta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idConsultaMedica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idConsultaMedica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idReservaMedica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idReservaMedica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaExamenes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaExamenes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.grupoclass.dsd.upc.edu.pe/", "examenConsultaBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaMedicamentos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaMedicamentos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.grupoclass.dsd.upc.edu.pe/", "medicamentoRecetaBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noPaciente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noPaciente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tratamiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tratamiento"));
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
