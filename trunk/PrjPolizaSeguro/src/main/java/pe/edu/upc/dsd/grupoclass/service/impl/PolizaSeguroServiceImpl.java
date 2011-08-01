package pe.edu.upc.dsd.grupoclass.service.impl;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import pe.edu.upc.dsd.grupoclass.bean.AfiliadoBean;
import pe.edu.upc.dsd.grupoclass.data.DataClassPoliza;
import pe.edu.upc.dsd.grupoclass.service.PolizaSeguroService;

public class PolizaSeguroServiceImpl implements PolizaSeguroService {
	
	public ArrayList<AfiliadoBean> listaAfiliados;
	

	public PolizaSeguroServiceImpl(){
		listaAfiliados = DataClassPoliza.listarAfiliados();
	}
	
	
	@Path("/Poliza/{dni}")
	@GET
	@Produces("application/json")
	public String obtenerDescuento(@PathParam("dni") int dni) {
		AfiliadoBean objAfiliado = null;
		Gson gson = new Gson();
		String poliza;
		poliza = "no";
		for(int i=0; i<listaAfiliados.size(); i++){
			objAfiliado = listaAfiliados.get(i);
			if(objAfiliado.getDni()==dni){
				poliza = gson.toJson(objAfiliado);
				break;
			}
		}	
		/*
		objAfiliado = listaAfiliados.get(2);
		poliza = gson.toJson(objAfiliado);
		*/
		return poliza;
	}

}

