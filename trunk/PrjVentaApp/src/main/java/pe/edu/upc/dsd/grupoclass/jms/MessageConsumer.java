package pe.edu.upc.dsd.grupoclass.jms;

import java.io.IOException;
import java.io.ObjectInputStream;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.apache.activemq.util.ByteArrayInputStream;
import org.apache.log4j.Logger;

import pe.edu.upc.dsd.grupoclass.bean.ReciboCobroBean;

public class MessageConsumer implements MessageListener {
	private static final Logger logger = Logger
			.getLogger(MessageConsumer.class);

	public void onMessage(final Message message) {
		
		if (message instanceof BytesMessage) {
			
			final BytesMessage textMessage = (BytesMessage) message;
			try {
				byte[] bytes = new byte[(int)textMessage.getBodyLength()];
				
				textMessage.readBytes(bytes);
								
				ByteArrayInputStream bs= new ByteArrayInputStream(bytes);
				
				ObjectInputStream is = new ObjectInputStream(bs);
				
				ReciboCobroBean reciboCobroBean = (ReciboCobroBean)is.readObject();
				
				is.close();
				logger.debug("Paciente:" + reciboCobroBean.getDniPaciente());
				logger.debug("Monto Pagado:" + reciboCobroBean.getMntPagado());
				
			} catch (final JMSException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}