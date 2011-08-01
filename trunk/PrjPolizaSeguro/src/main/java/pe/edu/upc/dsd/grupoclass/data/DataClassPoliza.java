package pe.edu.upc.dsd.grupoclass.data;

import java.util.ArrayList;

import pe.edu.upc.dsd.grupoclass.bean.AfiliadoBean;

public class DataClassPoliza {
	public static ArrayList<AfiliadoBean> listarAfiliados(){
		ArrayList<AfiliadoBean> listaAfiliados = new ArrayList();
		
		AfiliadoBean afiliado1 = new AfiliadoBean();
		
		afiliado1.setDni(12345678);
		afiliado1.setNombre("Jose");
		afiliado1.setApellido("Kina");
		afiliado1.setDesConsulta(0.2);
		afiliado1.setDesMedicina(0.1);
		listaAfiliados.add(afiliado1);
		
		AfiliadoBean afiliado2 = new AfiliadoBean();
		
		afiliado2.setDni(11111111);
		afiliado2.setNombre("Debora");
		afiliado2.setApellido("Jeronimo");
		afiliado2.setDesConsulta(0.5);
		afiliado2.setDesMedicina(0.2);
		listaAfiliados.add(afiliado2);
		
		AfiliadoBean afiliado3 = new AfiliadoBean();
		
		afiliado3.setDni(22222222);
		afiliado3.setNombre("Jorge");
		afiliado3.setApellido("Bardales");
		afiliado3.setDesConsulta(0.2);
		afiliado3.setDesMedicina(0.1);
		listaAfiliados.add(afiliado3);
		

		return listaAfiliados;
	}

}
