package pe.edu.upc.dsd.grupoclass.jms;

import java.io.ObjectOutputStream;

import org.apache.activemq.util.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dsd.grupoclass.bean.ReciboCobroBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class MessageProducerTest {

	@Autowired
	private MessageProducer messageProducer;

	@Test
	public void testSend() {
		try {

			ReciboCobroBean reciboCobro = new ReciboCobroBean();

			reciboCobro.setDniPaciente("43886126");			
			reciboCobro.setNoPaciente("Juan Diaz");
			reciboCobro.setMntPagado(200);

			ByteArrayOutputStream bs = new ByteArrayOutputStream();
			ObjectOutputStream os = new ObjectOutputStream(bs);
			os.writeObject(reciboCobro); // this es de tipo DatoUdp
			os.close();
			byte[] bytes = bs.toByteArray(); // devuelve byte[]

			messageProducer.send(bytes);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}

	}
}
