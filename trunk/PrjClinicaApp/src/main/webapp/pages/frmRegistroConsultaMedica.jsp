<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Consulta Medica</title>

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
      	<a href="index.html"><img src="../images/logo.jpg" alt="" /></a>
      </div>
    	<!-- /.logo -->
      <!-- .nav -->
      <ul class="nav">
      	<li><a href="../index.html" class="current" >Reservas</a></li>
        <li><a href="../index.html" >Ventas</a></li>
        <li><a href="../index.html">Historia Clínica</a></li>
        <li><a href="../index.html">Examen Médico</a></li>        
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
                	<h2>Registro de Consulta Medica</h2>                  
                </div>
            	<div class="box">              	
                <div class="inner">
                	<h4>Datos Generales</h4>
                  <table width="100%">
                  	<tr>
                  		<td width ="80px">Nro. Consulta</td>
                  		<td width ="125px"><input type="text"></td> 
						<td width ="30px">&nbsp;</td>  
                  		<td width><input type="button" value="Consultar"></td>     
                  		<td width ="60px">&nbsp;</td>             		
                  	</tr>
                  	<tr>
                  		<td width ="80px" height="30px">Paciente</td>
                  		<td width ="125px">[Nombre Paciente]</td> 
						<td width ="30px">&nbsp;</td>  
                  		<td width ="70px">D.N.I</td>
                  		<td width ="90px">[Nro. D.N.I.]</td>    
                  		<td><input type="button" value="Historial Consultas"></td>               		
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
                  		<td width ="80px">Medicamento:</td>
                  		<td width ="125px"><input type="text"></td> 
						<td width ="30px">&nbsp;</td>  
                  		<td width ="80px">Cant.</td>     
                  		<td width ="60px">&nbsp;</td> 
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
                  		<td width ="100%">Diagnostico</td>             		
                  	</tr>
                  	<tr>
                  		<td><textarea cols="107" rows="3"></textarea></td>          		
                  	</tr>
                  	<tr>
                  		<td width ="100%">Tratamiento</td>             		
                  	</tr>
                  	<tr>
                  		<td><textarea cols="107" rows="3"></textarea></td>          		
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