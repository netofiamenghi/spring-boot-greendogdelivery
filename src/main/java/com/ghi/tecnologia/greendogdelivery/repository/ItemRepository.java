package com.ghi.tecnologia.greendogdelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ghi.tecnologia.greendogdelivery.domain.Item;

//@Repository
@RepositoryRestResource(collectionResourceRel = "itens",path = "itens")
public interface ItemRepository extends JpaRepository<Item, Long> {
 
}
