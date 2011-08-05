<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

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
  <div id="content">
  	<div class="container">
  	  <div class="inside">
  	    <div class="wrapper">
  	      <div class="mainContent">                
            <div class="section">            	
            	<!-- .box -->
            	<div class="extra-wrap">
                	<img height="50px" src="../images/icon2.png" alt="" class="png img-indent"/>
                	<h2>Registro de Pago de Consulta</h2>                  
                </div>
            	<div class="box">              	
                <div class="inner">
                	<h4>Datos de la Reserva</h4>
                  <table width="100%">
                  	<tr>
                  		<td width ="80px">DNI:</td>
                  		<td width ="125px"><input type="text" size="15"></td> 
						<td width ="30px">&nbsp;</td>  
                  		<td width><input type="button" value=" Consultar "></td>     
                  		<td width ="60px">&nbsp;</td>             		
                  	</tr>
                  	<tr>
                  		<td width ="80px" height="30px">Paciente:</td>
                  		<td width ="125px">[Nombre Paciente]</td> 
						<td width ="30px">&nbsp;</td>  
                  		<td width ="70px">&nbsp;</td>
                  		<td width ="95px">&nbsp;</td>    
                  		<td>&nbsp;</td>               		
                  	</tr>
                  	<tr>
                  		<td width ="80px" height="30px">Sucursal:</td>
                  		<td width ="125px">[Nombre Sucursal]</td> 
						<td width ="30px">&nbsp;</td>  
                  		<td width ="70px">Especialidad:</td>
                  		<td width ="95px">[Nombre Especialidad]</td>    
                  		<td>&nbsp;</td>               		
                  	</tr>
                  	<tr>
                  		<td width ="80px" height="30px">Doctor:</td>
                  		<td width ="125px">[Nombre Doctor]</td> 
						<td width ="30px">&nbsp;</td>  
                  		<td width ="70px">&nbsp;</td>
                  		<td width ="95px">&nbsp;</td>    
                  		<td>&nbsp;</td>               		
                  	</tr>
                  </table>                  	
                </div>
              </div>
            <!-- /.box -->
            
          <div class="box">              	
                <div class="inner">
                	<h4>Datos del Pago</h4>
                  <table width="100%">
                  	<tr>
                  		<td width ="80px" height="30px">Monto a Pagar:</td>
                  		<td width ="125px">[Nombre Pagar]</td> 
						<td width ="30px">&nbsp;</td>  
                  		<td width ="70px">Monto Pagado</td>
                  		<td width ="95px"><input type="text" size="15"></td>    
                  		<td>&nbsp;</td>               		
                  	</tr>
                  	<tr>
                  		<td width ="80px" height="30px">Nro. Seguro:</td>
                  		<td width ="125px"><input type="text" size="15"></td> 
						<td width ="30px">&nbsp;</td>  
                  		<td width ="70px">Especialidad:</td>
                  		<td width ="95px">[Nombre Especialidad]</td>    
                  		<td>&nbsp;</td>               		
                  	</tr>
                  	<tr>
                  		<td width ="80px" height="30px">Doctor:</td>
                  		<td width ="125px">[Nombre Doctor]</td> 
						<td width ="30px">&nbsp;</td>  
                  		<td width ="70px"><input type="button" value="Validar "></td>
                  		<td width ="95px">[Mensaje Seguro]</td>    
                  		<td>&nbsp;</td>               		
                  	</tr>
                  	<tr>
                  		<td width ="80px" height="30px"><input type="button" value="Registrar "></td>
                  		<td width ="125px">&nbsp;</td> 
						<td width ="30px">	<a href="index.html"><input type="button" value="Cerrar "></td> </a> 
                  		<td width ="70px">&nbsp;</td>
                  		<td width ="95px">&nbsp;</td>    
                  		<td>&nbsp;</td>               		
                  	</tr>
                  </table>                  	
                </div>
              </div>
                   

            
            </div>
          </div>
  	    </div>
  	  </div>
  	</div>
  </div>


</body>
</html>