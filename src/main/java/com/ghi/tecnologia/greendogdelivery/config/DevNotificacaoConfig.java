package com.ghi.tecnologia.greendogdelivery.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.ghi.tecnologia.greendogdelivery.dto.Notificacao;

@Component
@Profile("!prod")
public class DevNotificacaoConfig implements Notificacao {

	@Override
	public boolean envioAtivo() {
		return false;
	}

}
