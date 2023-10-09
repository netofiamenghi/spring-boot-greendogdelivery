package com.ghi.tecnologia.greendogdelivery.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.ghi.tecnologia.greendogdelivery.dto.Notificacao;

@Component
@Profile("prod")
public class ProdNotificacaoConfig implements Notificacao {

	@Override
	public boolean envioAtivo() {
		return true;
	}
 
}
