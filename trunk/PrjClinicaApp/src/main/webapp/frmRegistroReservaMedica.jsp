<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Reserva Medica</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/layout.css" rel="stylesheet" type="text/css" />

<!-- Calendario JQuery-UI -->
<link type="text/css" href="css/jquery-ui-1.8.14.custom.css" rel="stylesheet" />	
<script type="text/javascript" src="js/jquery-1.5.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.14.custom.min.js"></script>
<script type="text/javascript" src="js/i18n/jquery.ui.datepicker-es.js"></script>
<script >
$(function() {
	$( "#datepicker" ).datepicker({dateFormat: 'dd/mm/yy'});
	
});
</script>
<script language="javascript"> 

function obtenerHorariosDoctor(){
    this.document.forms[0].hdAccion.value='obtenerHorariosDoctor';
    this.document.forms[0].action='RegistroReservaServlet';
    this.document.forms[0].submit();
}

function datosNuevaReserva(idDoctor,noDoctor){
    this.document.forms[0].hdIdDoctor.value=idDoctor;
    this.document.forms[0].nombreDoctor.value=noDoctor;
}

function registrarReservaMedica(){
    this.document.forms[0].hdAccion.value='registrarReservaMedica';
    this.document.forms[0].action='RegistroReservaServlet';
    this.document.forms[0].submit();
}

function cerrarRegistroReservaMedica(){
    this.document.forms[0].hdAccion.value='cerrarRegistroReservaMedica';
    this.document.forms[0].action='RegistroReservaServlet';
    this.document.forms[0].submit();    
}
</script>
<!-- Calendario JQuery-UI -->
</head>
<body id="registroReservaMedica">
<form name="frmRegistroReservaMedica">
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
      	<li><a href="frmRegistroReservaMedica.jsp" class="current" >Reservas</a></li>
      	<li><a href="frmRegistroPagoConsulta.jsp">Pago Consulta</a></li>        
        <li><a href="frmRegistroConsultaMedica.jsp">Atención Consulta</a></li>
        <li><a href="frmVentaMedicamentos.jsp" >Medicamentos</a></li>
        <li><a href="frmRegistroExamenMedico.jsp" >Examen Médico</a></li>        
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
                	<h2>Registro de Reserva Medica</h2>                  
                </div>
            	<div class="box">
                <div class="inner">
                	<h4>Datos Generales</h4>
                  <table width="100%">
                  	<tr>
                  		<td width ="80px">Sucursal:</td>
                  		<td width ="125px">                  		
                  		<select name="noSucursal" selected="0">
				  <option value="0">[SELECCIONE]</option>
                  		  <option value="Sucursal San Borja">Sucursal San Borja</option> 
                  		  <option value="Sucursal San Isidro">Sucursal San Isidro</option>
                  		  <option value="Sucursal San Miguel">Sucursal San Miguel</option>
                  		</select>
                  		</td>
                  		<td width ="30px">&nbsp;</td>  
                  		<td width><input class="button" type="button" value="Consultar" 
                  			onclick="javascript:obtenerHorariosDoctor()"></td>     
                  		<td width ="60px">&nbsp;</td>             		
                  	</tr>
                  	<tr>
                  		<td width ="80px">Especialidad:</td>
                  		<td>
                  		<select name="noEspecialidad" selected="0">
				  <option value="0">[SELECCIONE]</option>
                  		  <option value="Medicina General">Medicina General</option> 
                  		  <option value="Oftamologia">Oftamologia</option>
                  		  <option value="Traumatologia">Traumatologia</option> 
                  		</select>
                  		</td>
                  	</tr>               	
                  	<tr>
                  		<td colspan="8">&nbsp;</td>                  		                 		
                  	</tr>
                  	<tr>
                  		<td colspan="8">
                  			<table border="1" cellspacing="0" cellpadding="1">
                  				<tr>                  					
                  					<th width ="300px">Nombre Doctor</th>
                  					<th width ="200px">Horario</th>
                  					<th width ="70px">Reservar</th>
                  				</tr>             				
                  				
                  				<c:forEach var="horario" items="${horarios}">
					                <tr>
					                    <td><c:out value="${horario.noDoctor}"/></td>
					                    <td><c:out value="${horario.deHorario}"/></td>		
					                    <td><input type="button" value="Reserva"
					                    	onclick="javascript:datosNuevaReserva('<c:out value="${horario.idDoctor}"/>','<c:out value="${horario.noDoctor}"/>')"></td>
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
                	<h4>Datos de Reserva</h4>
                  <table width="100%" border="0">
                  	<tr>
                  		<td width ="80px">Doctor:</td>
                  		<td colspan="3"><input type="text" name="nombreDoctor" size="35" readonly="readonly">
							<input type="hidden" name="hdIdDoctor"></td>              		
						<td colspan="3"><b><c:out value="${mensajeResultado}"/></b></td>
					</tr>
                  	<tr>
                  		<td width ="80px">Fecha:</td>
                  		<td width ="80px"><input type="text" id="datepicker" name="fechaReserva"></td>
                  		<td>&nbsp;</td>
                  		<td width ="50px">Hora:</td>
                  		<td colspan="2" width ="50px" >
                  		<select name="horaReserva">
                  		  	<option value="10">10</option> 
                  		  	<option value="11">11</option>
				  			<option value="14">14</option>
				  			<option value="15">15</option>
                  		</select>
						<select name="minutoReserva">
                  		  	<option value="00">00</option> 
                  		  	<option value="30">30</option>
                  		</select>
                  		</td>                  		
                  		<td>&nbsp;</td>                  		
                  	</tr>
                  	<tr>
                  		<td width ="80px">D.N.I.:</td>
                  		<td><input type="text" name="dniPaciente"></td>
                  		<td>&nbsp;</td>
                  		<td width ="80px">Nombre:</td>
                  		<td colspan="5"><input type="text" name="noPaciente" size="30"></td>                  		
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
                  		<td align="center"><input class="button" type="button" value="Registrar" 
                  			onclick="javascript:registrarReservaMedica()"></td>             		
                  		<td align="center"><input onclick="location.href='index.jsp'" class="button" 
                  			type="button" value="Cerrar" onclick="javascript:cerrarRegistroReservaMedica()"></td>                  		
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
      <div class="inside">
      	&nbsp;&copy; 2011 &nbsp; &nbsp;<input type="hidden" name="hdAccion">
      </div>
    </div>
  </div>


</form>
</body>
</html>