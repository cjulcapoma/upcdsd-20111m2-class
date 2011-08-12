<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Consulta Medica</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/layout.css" rel="stylesheet" type="text/css" />
</head>
<body id="registroConsultaMedica">

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
                	<h2>Historial de Consultas</h2>                  
                </div>
            	<div class="box">              	
                <div class="inner">
                	<h4>Datos del Paciente</h4>
                  <table width="100%">
                  	<tr>
                  		<td width ="80px">Paciente:</td>
                  		<td width ="125px"><c:out value="${consulta.noPaciente}"/></td> 
						<td width ="30px">&nbsp;</td>  
                  		<td>D.N.I.</td>     
                  		<td><c:out value="${consulta.dniPaciente}"/></td>             		
                  	</tr>
                  </table>                  	
                </div>
              </div>
            <!-- /.box -->
            	
            <!-- .box -->            	
            	<div class="box">              	
                <div class="inner">
                	<h4>Historial de Consultas</h4>
                  <table width="100%">
                  	<tr>
                  		<td colspan="8">
                  			<table border="1" cellspacing="0" cellpadding="1">
                  				<tr>
                  					<th width ="70px">Fecha</td>
                  					<th width ="120px">Sucursal</td>
                  					<th width ="120px">Especialidad</td>
                  					<th width ="210px">Nombre Doctor</td>
                  				</tr>
                  				<c:forEach var="consulta" items="${consultasMedicas}">
					                <tr>					                    
										<td><c:out value="${consulta.fechaConsulta}"/></td>
					                    <td><c:out value="${consulta.doctor.noSucursal}"/></td>
					                    <td><c:out value="${consulta.doctor.noEspecialidad}"/></td>
					                    <td><c:out value="${consulta.doctor.noDoctor}"/></td>
					                </tr>
					            </c:forEach>    
                  			</table>
						</td>
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

</body>
</html>