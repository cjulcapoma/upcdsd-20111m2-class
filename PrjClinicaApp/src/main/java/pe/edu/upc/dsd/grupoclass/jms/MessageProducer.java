package pe.edu.upc.dsd.grupoclass.jms;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.ContextConfiguration;

public class MessageProducer {
	private JmsTemplate jmsTemplate;
	private String requestDestination;




	public void send(final Object message) {
		System.out.println(message);
		System.out.println(requestDestination);
		jmsTemplate.convertAndSend(requestDestination, message);
		System.out.println("PPP");
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void setRequestDestination(String destinationName) {
		this.requestDestination = destinationName;
	}
}
