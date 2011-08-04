<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Pago de Consulta Médica</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<link href="../css/layout.css" rel="stylesheet" type="text/css" />
</head>
<body id="registroConsultaMedica">

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
                	<img height="50px" src="../images/icon2.png" alt="" class="png img-indent"/>
                	<h2>Registro de Pago de Consulta Médica</h2>                  
                </div>
            	<div class="box">              	
                <div class="inner">
                	<h4>Datos Reserva Médica</h4>
					<table width="100%">
						<tr>
							<td width="80px">D.N.I:</td>
							<td width="125px"><input type="text" size="15">
							</td>
							<td width="30px">&nbsp;</td>
							<td width><input type="button" class="button" value=" Consultar ">
							</td>
							<td width="60px">&nbsp;</td>
						</tr>
						<tr>
							<td width="80px" height="30px">Paciente:</td>
							<td width="125px">[Nombre de Paciente]</td>
							<td width="30px">&nbsp;</td>
							<td width="70px">&nbsp;</td>
							<td width="95px">&nbsp;</td>
						</tr>
						<tr>
							<td width="80px" height="30px">Sucursal:</td>
							<td width="125px">[Nombre de Paciente]</td>
							<td width="30px">Especialidad</td>
							<td width="70px">[Nombre de Especialidad]</td>
							<td width="95px">&nbsp;</td>
						</tr>
						<tr>
							<td width="80px" height="30px">Doctor:</td>
							<td width="125px">[Nombre del Doctor]</td>
							<td width="30px">&nbsp;</td>
							<td width="70px">&nbsp;</td>
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
											<td width="240px">Asegurado: [ Si / No ]</td>
											<td width="240px">% Descuento: [% Descuento]</td>

										</tr>
									</table>
									<br>
									<h4>Datos del Pago</h4>
									<table width="100%">
										<tr>

										</tr>
										<tr>
											<td width="240px" height="20px">Monto a Pagar: [Monto]</td>
											<td width="240px" height="20px">Descuento: [Monto
												Descuento]</td>
										</tr>
										<tr>
											<td width="240px" height="20px">Monto Total a Pagar: [Monto T]</td>
											<td width="240px">Monto Pagado: <input type="text" size="8">
											</td>

										</tr>
										<tr>
											<td width="240px" height="20px"></td>
											<td width="240px" height="20px">Vuelto: [Vuelto] </td>
										</tr>
									</table>
								</div>                       
            <!-- .box -->
                  <table width="100%">
                  	<tr>
                  		<td align="center"><input type="button" class="button" value=" Registrar "></td>             		
                  		<td align="center"><input type="button" class="button" value=" Regresar Inicio "></td>
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
      	&nbsp;&copy; 2010 &nbsp; &nbsp;
      </div>
    </div>
  </div>



</body>
</html>