<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Consulta Medica</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/layout.css" rel="stylesheet" type="text/css" />

<script language="javascript"> 
function abrirVentana(url) {
    window.open(url, "nuevo", "directories=no, location=no, menubar=no, scrollbars=yes, " + 
    			"statusbar=no, tittlebar=no, width=900, height=400");
    }

function obtenerDatosConsulta(){
    this.document.forms[0].hdAccion.value='obtenerDatosConsulta';
    this.document.forms[0].action='registroConsultaServlet';
    this.document.forms[0].submit();
}


</script>

</head>
<body id="registroConsultaMedica">
<form name="frmRegistroConsultaMedica">

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
        <li><a href="frmRegistroConsultaMedica.jsp" class="current">Atención Consulta</a></li>
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
                	<h2>Registro de Consulta Medica</h2>                  
                </div>
            	<div class="box">              	
                <div class="inner">
                	<h4>Datos Generales</h4>
                  <table width="100%" border="0">
                  	<tr>
                  		<td width ="80px">Nro. Consulta:</td>
                  		<td width ="125px"><input type="text" size="15"></td> 
						<td width ="30px">&nbsp;</td>  
                  		<td colspan="3"><input type="button" class="button" value="Consultar"
                  			onclick="javascript:obtenerDatosConsulta()"></td>               		
                  	</tr>
                  	<tr>
                  		<td width ="80px" height="30px">Paciente:</td>
                  		<td width ="125px"><c:out value="${nombrePaciente}"/></td> 
						<td width ="30px">&nbsp;</td>  
                  		<td width ="50px">D.N.I:</td>
                  		<td width ="120px">[Nro. D.N.I.]</td>    
                  		<td><input type="button" onClick="abrirVentana('poppupHistorialConsultas.jsp')" 
                  			class="button" value="Historial"></td>               		
                  	</tr>
                  </table>                  	
                </div>
              </div>
            <!-- /.box -->
            
            <!-- .box -->            	
            	<div class="box">              	
                <div class="inner">
                  <h4>Resultado de Consulta Medica</h4>
                  <table width="100%">
                  	<tr>
                  		<td width ="100%">Diagnostico</td>             		
                  	</tr>
                  	<tr>
                  		<td><textarea cols="100" rows="3"></textarea></td>          		
                  	</tr>
                  	<tr>
                  		<td width ="100%">Tratamiento</td>             		
                  	</tr>
                  	<tr>
                  		<td><textarea cols="100" rows="3"></textarea></td>          		
                  	</tr>
                  </table>                   	
                </div>
              </div>
            <!-- /.box -->
            	
            <!-- .box -->            	
            	<div class="box">              	
                <div class="inner">
                	<h4>Receta Medica</h4>
                  <table width="100%">
                  	<tr>
                  		<td width ="80px">Codigo Med.:</td>
                  		<td width ="80px"><input type="text" size="12"></td> 
						<td width ="20px">&nbsp;</td>  
                  		<td width ="60px">Cantidad:</td>     
                  		<td width ="60px"><input type="text" size="8"></td>
                  		<td width ="20px">&nbsp;</td>  
                  		<td ><input type="button" class="button" value="Agregar"></td>  
                  	</tr>
                  	<tr>
                  		<td width ="80px" height="20px">Medicamento:</td>
                  		<td colspan="6">[Nombre Medicamento]</td>
                  	</tr>
                  	<tr>
                  		<td colspan="8">
                  			<table border="1" cellspacing="0" cellpadding="1">
                  				<tr>
                  					<th width ="70px">Codigo</td>
                  					<th width ="250px">Nombre Medicamento</td>
                  					<th width ="70px">Cantidad</td>
                  					<th width ="70px">Eliminar</td>
                  				</tr>                  				
                  				<tr>
                  					<td>&nbsp;</td>
                  					<td>&nbsp;</td>
                  					<td>&nbsp;</td>
                  					<td align="center"><a href="#">Eliminar</a></td>
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
                	<h4>Examenes Medicos</h4>
                  <table width="100%">
                  	<tr>
                  		<td width ="80px" >Codigo Exam:</td>
                  		<td width ="80px"><input type="text" size="12"></td> 
						<td width ="20px">&nbsp;</td>  
                  		<td width ="60px">Cantidad:</td>     
                  		<td width ="60px"><input type="text" size="8"></td>
                  		<td width ="20px">&nbsp;</td>  
                  		<td ><input type="button" class="button" value="Agregar"></td>  
                  	</tr>
                  	<tr>
                  		<td width ="80px" height="20px">Examen:</td>
                  		<td colspan="6">[Nombre del Examen]</td>
                  	</tr>
                  	<tr>
                  		<td colspan="8">
                  			<table border="1" cellspacing="0" cellpadding="1">
                  				<tr>
                  					<th width ="70px">Codigo</td>
                  					<th width ="250px">Nombre Examen</td>
                  					<th width ="70px">Cantidad</td>
                  					<th width ="70px">Eliminar</td>
                  				</tr>                  				
                  				<tr>
                  					<td>&nbsp;</td>
                  					<td>&nbsp;</td>
                  					<td>&nbsp;</td>
                  					<td align="center"><a href="#">Eliminar</a></td>
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
                  <table width="100%">
                  	<tr>
                  		<td align="center"><input type="button" class="button" value="Registrar"></td>             		
                  		<td align="center"><input onclick="location.href='index.jsp'" type="button" class="button" value="Cerrar"></td>
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
      <div class="inside">
      	&nbsp;&copy; 2010 &nbsp; &nbsp;<input type="hidden" name="hdAccion">
      </div>
    </div>
  </div>

</form>
</body>
</html>