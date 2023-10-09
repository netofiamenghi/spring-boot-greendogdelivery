package com.ghi.tecnologia.greendogdelivery.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.ghi.tecnologia.greendogdelivery.domain.Item;
import com.ghi.tecnologia.greendogdelivery.repository.ClienteRepository;

@Component
public class SpringDataRestCustomization 
implements RepositoryRestConfigurer 
{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		config.exposeIdsFor(Item.class,ClienteRepository.class);
	}
}
