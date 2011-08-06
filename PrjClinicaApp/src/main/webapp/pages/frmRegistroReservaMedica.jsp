<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Reserva Medica</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<link href="../css/layout.css" rel="stylesheet" type="text/css" />

<!-- Calendario JQuery-UI -->
<link type="text/css" href="../css/jquery-ui-1.8.14.custom.css" rel="stylesheet" />	
<script type="text/javascript" src="../js/jquery-1.5.1.min.js"></script>
<script type="text/javascript" src="../js/jquery-ui-1.8.14.custom.min.js"></script>
<script type="text/javascript" src="../js/i18n/jquery.ui.datepicker-es.js"></script>
<script >
$(function() {
	$( "#datepicker" ).datepicker({dateFormat: 'dd/mm/yy'});
	
});
</script>
<!-- Calendario JQuery-UI -->
</head>
<body id="registroReservaMedica">

<!-- header -->
  <div id="header">
    <div class="container">
    	<!-- .logo -->
    	<div class="logo">
      	<a href="../index.jsp"><img src="../images/logo.jpg" alt="" /></a>
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
                	<img height="50px" src="../images/icon2.png" alt="" class="png img-indent"/>
                	<h2>Registro de Reserva Medica</h2>                  
                </div>
            	<div class="box">
                <div class="inner">
                	<h4>Datos Generales</h4>
                  <table width="100%">
                  	<tr>
                  		<td width ="80px">Sucursal:</td>
                  		<td width ="125px">                  		
                  		<select>
                  		<option>Sucursal San Borja</option> 
                  		<option>Sucursal San Isidro</option>
                  		<option>Sucursal San Miguel</option>
                  		<option>Sucursal Surco</option>
                  		</select>
                  		</td>
                  		<td width ="30px">&nbsp;</td>  
                  		<td width><input class="button" type="button" value="Consultar"></td>     
                  		<td width ="60px">&nbsp;</td>             		
                  	</tr>
                  	<tr>
                  		<td width ="80px">Especialidad:</td>
                  		<td>
                  		<select>
                  		<option>Medicina General</option> 
                  		<option>Oftamología</option>
                  		<option>Traumatología</option>                  		
                  		</select>
                  		</td>
                  	<tr>
                  		<td width ="80px">Fecha:</td>
                  		<td>
						<!-- Calendario JQuery-UI -->							
						<input type="text" id="datepicker">
						<!-- Calendario JQuery-UI -->
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
                  				<tr>
                  					<td>&nbsp;</td>
                  					<td>&nbsp;</td>                  					
                  					<td align="center"><a href="#">Reservar</a></td>
                  				</tr>
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
                  		<td colspan="9">[Nombre del Doctor Seleccionado]</td>                  		
                  	</tr>
                  	<tr>
                  		<td width ="80px">Fecha:</td>
                  		<td width ="80px">[Fecha] </td>
                  		<td>&nbsp;</td>
                  		<td width ="50px">Hora:</td>
                  		<td colspan="2" width ="50px" >
                  		[Hora]
                  		</td>                  		
                  		<td>&nbsp;</td>                  		
                  	</tr>
                  	<tr>
                  		<td width ="80px">D.N.I.:</td>
                  		<td><input type="text"></td>
                  		<td>&nbsp;</td>
                  		<td width ="80px">Nombre:</td>
                  		<td colspan="5"><input type="text" ></td>                  		
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
                  		<td align="center"><input class="button" type="button" value=" Registrar "></td>             		
                  		<td align="center"><input onclick="location.href='../index.jsp'" class="button" type="button" value=" Cerrar "></td>                  		
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
      	&nbsp;&copy; 2010 &nbsp; &nbsp;
      </div>
    </div>
  </div>



</body>
</html>