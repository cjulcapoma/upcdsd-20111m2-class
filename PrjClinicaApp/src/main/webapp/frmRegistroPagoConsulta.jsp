<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Pago de Consulta Médica</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/layout.css" rel="stylesheet" type="text/css" />

<script language="javascript"> 
function abrirVentana(url) {
	window.open(url, "nuevo",
			"directories=no, location=no, menubar=no, scrollbars=yes, "
					+ "statusbar=no, tittlebar=no, width=900, height=400");
}

function obtenerDatosConsulta(){
    this.document.forms[0].hdAccion.value='obtenerDatosConsulta';
    this.document.forms[0].action='registroPagoConsultaServlet';
    this.document.forms[0].submit();
}

function enviarCola() {
	this.document.forms[0].hdAccion.value = 'enviarCola';
	this.document.forms[0].action = 'registroPagoConsultaServlet';
	this.document.forms[0].submit();
}
function carga() {
	this.document.forms[0].hdAccion.value = 'carga';
	this.document.forms[0].action = 'registroPagoConsultaServlet';
	this.document.forms[0].submit();
}


</script>

</head>
<body id="registroConsultaMedica">
<form name=frmRegistroPagoConsulta>

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
      	<li><a href="frmRegistroPagoConsulta.jsp" class="current">Pago Consulta</a></li>        
        <li><a href="frmRegistroConsultaMedica.jsp" >Atención Consulta</a></li>
        <li><a href="frmVentaMedicamentos.jsp" >Medicamentos</a></li>
        <li><a href="frmRegistroExamenMedico.jsp"  >Examen Médico</a></li>     
             
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
                	<h2>Registro de Pago de Consulta Médica<input type="button" class="button"
												value="Carga de datos temporal" onclick="javascript:carga()"></h2>                  
                </div>
            	<div class="box">              	
                <div class="inner">
                	<h4>Datos Reserva Médica</h4>
					<table width="100%">
						<tr>
							<td width="80px">D.N.I:</td>
							<td width="125px"><input type="text" size="15" name = "numdni"><input type="hidden" name="hdDni1" >
							</td>
							<td width="30px">&nbsp;</td>
							<td width><input type="button" class="button" value=" Consultar" 
							onclick="javascript:obtenerDatosConsulta()">
							</td>
							<td width="60px">&nbsp;</td>
						</tr>
						<tr>
							<td width="80px" height="30px">Paciente:</td>
							<td width="125px"><c:out value="${reserva.noPaciente}"/><input type="hidden" name="hdPaciente1" >
							</td>
							<td width="30px">&nbsp;</td>
							<td width="70px">&nbsp;</td>
							<td width="95px">&nbsp;</td>
						</tr>
						<tr>
							<td width="80px" height="30px">Doctor:</td>
							<td width="125px"><c:out value="${reserva.doctor.noDoctor}"/></td>
							<td width="30px">Especialidad: </td>
							<td width="70px"><c:out value="${reserva.doctor.noEspecialidad}"/></td>
							<td width="95px">&nbsp;</td>
						</tr>

					</table>                  	
                </div>
              </div>
            <!-- /.box -->
            <!-- .box -->
							<div class="box">
									<div class="inner">
										<h4>Datos del Seguro</h4>
										<table width="100%">
											<tr>
												<td width="240px">Asegurado: ${afililiado1}</td>
												<td width="240px">% Descuento: ${porcentajeDescuento1}</td>

											</tr>
										</table>
										<br>
										<h4>Datos del Pago</h4>
										<table width="100%">
											<tr>

											</tr>
											<tr>
												<td width="240px" height="20px">Monto a Pagar: ${monto1}</td>
												<td width="240px" height="20px">Descuento: ${descuento1}<input
													type="hidden" name="hdDescuento1"></td>
											</tr>
											<tr>
												<td width="240px" height="20px">Monto Total a Pagar:
													${montoT1}<input type="hidden" name="hdMontoT1"></td>
												<td width="240px">Monto Pagado: <input type="text"
													size="8" name="efectivo1">
												</td>

											</tr>
											<tr>
												<td width="240px" height="20px"></td>
												<td width="240px" height="20px">Vuelto: ${vuelto1}</td>
											</tr>
										</table>
									</div>

									<table width="100%">
										<tr>
											<td align="center"><input type="button" class="button"
												value="Registrar" onclick="javascript:enviarCola()">
											</td>
											<td align="center"><input
												onclick="location.href='index.jsp'" type="button"
												class="button" value="Cerrar"></td>
											<td align="center">&nbsp;&nbsp;&nbsp;&nbsp;</td>
										</tr>


									</table>
               <br> <br>
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
      	<input type="hidden" name="hdIdMedicina">
      	<input type="hidden" name="hdIdExamen">
      </div>
    </div>
  </div>


</form>
</body>
</html>