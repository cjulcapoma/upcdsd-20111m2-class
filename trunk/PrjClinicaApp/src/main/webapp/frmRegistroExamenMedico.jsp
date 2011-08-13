<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Examenes Medicos</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/layout.css" rel="stylesheet" type="text/css" />
<script language="javascript"> 

function obtenerDatosConsulta(){
    this.document.forms[0].hdAccion.value='obtenerDatosConsulta';
    this.document.forms[0].action='registroExamenMedicoServlet';
    this.document.forms[0].submit();
}

function seleccionarExamenMedico(){
    this.document.forms[0].hdAccion.value='seleccionarExamenMedico';
    this.document.forms[0].action='registroExamenMedicoServlet';
    this.document.forms[0].hdIdExamen.value=idExamen;
    this.document.forms[0].submit();
}

function registrarExamenMedico(){
    this.document.forms[0].hdAccion.value='registrarExamenMedico';
    this.document.forms[0].action='registroExamenMedicoServlet';
    this.document.forms[0].submit();
}

function cerrarRegistroConsultaMedica(){
    this.document.forms[0].hdAccion.value='cerrarRegistroExamenMedico';
    this.document.forms[0].action='registroExamenMedicoServlet';
    this.document.forms[0].submit();
    alert("Se guardaron los datos de la consulta");
}
</script>
</head>
<body id="registroExamenMedico">

<!-- header -->
  <div id="header">
    <div class="container">
    	<!-- .logo -->
    	<div class="logo">
      	<a href="index.jsp"><img src="images/logo.jpg" alt="" /></a>
      </div>
    	<!-- /.logo -->
      <!-- .nav -->
      <ul class="nav">
      	<li><a href="frmRegistroReservaMedica.jsp" >Reservas</a></li>
      	<li><a href="frmRegistroPagoConsulta.jsp">Pago Consulta</a></li>        
        <li><a href="frmRegistroConsultaMedica.jsp">Atención Consulta</a></li>
        <li><a href="frmVentaMedicamentos.jsp" >Medicamentos</a></li>
        <li><a href="frmRegistroExamenMedico.jsp" class="current" >Examen Médico</a></li>          
      </ul>
      <!-- /.nav -->      
    </div>
  </div>

 <!-- content -->
  <div id="content">
  	<div class="container">
  	  <div class="inside">
  	    <div class="wrapper">
  	      <div class="mainContent">                
            <div class="section">            	
            	<!-- .box -->
            	<div class="extra-wrap">
                	<img height="50px" src="images/icon2.png" alt="" class="png img-indent"/>
                	<h2>Registro de Examenes Medicos</h2>                  
                </div>

            <!-- /.box -->
   
            <!-- .box -->            	
            	<div class="box">              	
                <div class="inner">
                	<h4>Datos de Consulta</h4>
                  <table width="100%">
                  	<tr height="20px">
                  		<td width ="80px" >N° Consulta:</td>
                  		<td width ="80px"><input type="text" size="12" name="nroConsulta"></td> 
						<td width ="20px">&nbsp;</td>  
                  		<td width ="20px">&nbsp;</td>  
                  		<td ><input class="button" type="button" value="Consultar" onclick="javascript:obtenerDatosConsulta()"></td>  
                  	</tr>
                  	<tr>
                  		<td colspan="8">
                  			<table border="1" cellspacing="0" cellpadding="1">
                  				<tr>
                  					<th width ="70px">Codigo</th>
                  					<th width ="250px">Nombre Examen</th>
                  					<th width ="70px">Cantidad</th>
                  					<th width ="70px">Resultado</th>
                  				</tr>                  				
                  				 <c:forEach var="examen" items="${examenes}">
					                <tr>
					                    <td><c:out value="${examen.coExamenMedico}"/></td>
					                    <td><c:out value="${examen.noExamen}"/></td>
					                    <td><c:out value="${examen.cantidad}"/></td>
					                    <td><input type="button" value="Seleccionar"
					                    	onclick="javascript:seleccionarExamenMedico('<c:out value="${examen.idExamenMedico}"/>')"></td>
					                </tr>
					            </c:forEach>
                  			</table>
						</td>
                  	</tr>
                  </table>                 	
                </div>
              </div>
            <!-- /.box -->            
            <!-- .box -->            	
            	<div class="box">              	
                <div class="inner">
                  <h4>Datos del Resultado</h4>
                  <table width="100%">
                  	<tr>
                  		<td width ="100%">Resultado de Examen "${examen.noExamen}"</td>             		
                  	</tr>
                  	<tr>
                  		<td><textarea cols="100" rows="3" value="${examenSeleccionado.resultado}"></textarea></td>          		
                  	</tr>
                  </table>                   	
                </div>
              </div>
            <!-- /.box -->
            <!-- .box -->            	
            	<div class="box">              	
                <div class="inner">
                  <table width="100%">
                  	<tr>
                  			<td align="center"><input type="button" class="button" value="Registrar"
                  			onclick="javascript:registrarExamenMedico()"></td>             		
                  		<td align="center"><input type="button" class="button" value="Cerrar"
                  			onclick="javascript:cerrarRegistroExamenMedica()"></td>
                  		<td align="center">&nbsp;&nbsp;&nbsp;&nbsp;</td>
                  	</tr>
                  </table>                   	
                </div>
              </div>
            <!-- /.box -->            
            
            
            </div>
          </div>
  	    </div>
  	  </div>
  	</div>
  </div>

  <!-- footer -->
  <div id="footer">
  	<div class="container">
      <div class="inside"><input type="hidden" name="hdAccion">
      	&nbsp;&copy; 2011 &nbsp; &nbsp;
      </div>
    </div>
  </div>



</body>
</html>