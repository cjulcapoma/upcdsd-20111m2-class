<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Examenes Medicos</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<link href="../css/layout.css" rel="stylesheet" type="text/css" />
</head>
<body id="registroExamenMedico">

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
                	<img height="50px" src="../images/icon2.png" alt="" class="png img-indent"/>
                	<h2>Registro de Examenes Medicos</h2>                  
                </div>

            <!-- /.box -->
   
            <!-- .box -->            	
            	<div class="box">              	
                <div class="inner">
                	<h4>Datos de Consulta</h4>
                  <table width="100%">
                  	<tr>
                  		<td width ="80px" >N° Consulta:</td>
                  		<td width ="80px"><input type="text" size="12"></td> 
						<td width ="20px">&nbsp;</td>  
                  		<td width ="20px">&nbsp;</td>  
                  		<td ><input class="button" type="button" value="Consultar"></td>  
                  	</tr>
                  	<tr>
                  		<td colspan="8">
                  			<table border="1">
                  				<tr>
                  					<th width ="70px">Codigo</td>
                  					<th width ="250px">Nombre Examen</td>
                  					<th width ="70px">Cantidad</td>
                  					<th width ="70px">Resultado</td>
                  				</tr>                  				
                  				<tr>
                  					<td>&nbsp;</td>
                  					<td>&nbsp;</td>
                  					<td>&nbsp;</td>
                  					<td align="center"><a href="">Resultado</a></td>
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
                  <h4>Datos del Resultado</h4>
                  <table width="100%">
                  	<tr>
                  		<td width ="100%">Resultado de Examen [Codigo de examen]</td>             		
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
                  <table width="100%">
                  	<tr>
                  		<td align="center"><input type="button" class="button" value=" Registrar "></td>             		
                  		<td align="center"><input type="button" class="button" value=" Cerrar "></td>
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
      	&nbsp;&copy; 2010 &nbsp; &nbsp;
      </div>
    </div>
  </div>



</body>
</html>