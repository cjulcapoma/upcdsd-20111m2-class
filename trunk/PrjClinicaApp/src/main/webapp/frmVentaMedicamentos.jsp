<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Venta Medicamentos</title>

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

	function obtenerDatosPaciente() {
		this.document.forms[0].hdAccion.value = 'obtenerDatosPaciente';
		this.document.forms[0].action = 'ventaMedicamentosServlet';
		this.document.forms[0].submit();
	}
	function enviarCola(){
	    this.document.forms[0].hdAccion.value='enviarCola';    
	    this.document.forms[0].action='ventaMedicamentosServlet';
	    this.document.forms[0].submit();
	}
</script>

</head>
<body id="ventaMedicamentos">
<form name="frmVentaMedicamentos">

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
				<li><a href="frmRegistroReservaMedica.jsp"  >Reservas</a></li>
		      	<li><a href="frmRegistroPagoConsulta.jsp">Pago Consulta</a></li>        
		        <li><a href="frmRegistroConsultaMedica.jsp">Atención Consulta</a></li>
		        <li><a href="frmVentaMedicamentos.jsp" class="current">Medicamentos</a></li>
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
								<img height="50px" src="images/icon2.png" alt=""
									class="png img-indent" />
								<h2>Venta Medicamentos</h2>
							</div>
							<div class="box">
								<div class="inner">
									<h4>Datos Reserva Mèdica</h4>
									<table width="100%">
										<tr>
											<td width="80px">Nro. Consulta:</td>
											<td width="125px"><input type="text" size="15"  name="nroConsulta" value="${nroConsulta}">
											</td>
											<td width="30px">&nbsp;</td>
											<td width><input type="button" class="button" 
												value="Consultar"
												onclick="javascript:obtenerDatosPaciente()">
											</td>
											<td width="60px">&nbsp;</td>
										</tr>
															
										<tr>
											<td width="80px" height="30px">Paciente:</td>
											<td width="125px">${consulta.noPaciente}<input type="hidden" name="hdPaciente"></td>
											<td width="30px">&nbsp;</td>
											<td width="70px">D.N.I:</td>
											<td width="95px">${consulta.dniPaciente}<input type="hidden" name="hdDni"></td>
										</tr>
									</table>
									<br>
									<h4>Resultado de Consulta Medica</h4>
										<table border="1"  cellspacing="0" cellpadding="1">
												<tr>
													<th width="70px">Codigo</th>
													
													<th width="250px">Nombre Medicamento</th>
													
													<th width="70px">Cantidad</th>
													
													<th width="70px">Precio</th>
													
												</tr>
					            <c:forEach var="medicina" items="${medicinas}">
					                <tr>
					                    <td><c:out value="${medicina.coMedicamento}"/></td>
					                    <td><c:out value="${medicina.noMedicamento}"/></td>
					                    <td><c:out value="${medicina.cantidad}"/></td>
					                    <td><c:out value="${medicina.precio}"/></td>
					                </tr>
					            </c:forEach>

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
											<td width="240px">Asegurado: ${afililiado}</td>
											<td width="240px">% Descuento: ${porcentajeDescuento}</td>

										</tr>
									</table>
									<br>
									<h4>Datos del Pago</h4>
									<table width="100%">
										<tr>

										</tr>
										<tr>
											<td width="240px" height="20px">Monto a Pagar: ${monto}</td>
											<td width="240px" height="20px">Descuento: ${descuento}</td>
										</tr>
										<tr>
											<td width="240px" height="20px">Monto Total a Pagar: ${montoT}<input type="hidden" name="hdMontoT"></td>
											<td width="240px">Monto Pagado: <input type="text" size="8" name="efectivo" >
											</td>

										</tr>
										<tr>
											<td width="240px" height="20px"></td>
											<td width="240px" height="20px">Vuelto: ${Vuelto} </td>
										</tr>
									</table>
								</div>

								<table width="100%">
									<tr>
										<td align="center"><input type="button" class="button" 
												value="Registrar"
												onclick="javascript:enviarCola()"></td>
										<td align="center"> <input onclick="location.href='index.jsp'" type="button" class="button" value="Cerrar"></td>
										<td align="center">&nbsp;&nbsp;&nbsp;&nbsp;</td>
									</tr>


								</table>
								<br> <br>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- footer -->
	<div id="footer">
		<div class="container">
			<div class="inside">&nbsp;&copy; 2011 &nbsp; &nbsp;<input type="hidden" name="hdAccion"></div>
		</div>
	</div>
	</form>
</body>
</html>