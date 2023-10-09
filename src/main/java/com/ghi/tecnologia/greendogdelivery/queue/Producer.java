package com.ghi.tecnologia.greendogdelivery.queue;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ghi.tecnologia.greendogdelivery.config.RabbitmqConfig;
import com.ghi.tecnologia.greendogdelivery.domain.Item;
import com.ghi.tecnologia.greendogdelivery.domain.Pedido;
import com.ghi.tecnologia.greendogdelivery.estoque.domain.Estoque;

@Component
public class Producer {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void send(Pedido pedido) throws Exception { 
		
		for (Item item : pedido.getItens()) {
			
			System.out.println("Enviando mensagem - atualizando estoque - [ "+item.getNome()+" ] ...");
			
			Estoque estoqueMSG = new Estoque(item.getId(),1l);
			
			rabbitTemplate.convertAndSend(RabbitmqConfig.QUEUE_NAME, estoqueMSG);
			
		}
		
	}

}