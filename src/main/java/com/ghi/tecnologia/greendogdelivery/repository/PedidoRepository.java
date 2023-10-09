package com.ghi.tecnologia.greendogdelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ghi.tecnologia.greendogdelivery.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
 
	 
}
