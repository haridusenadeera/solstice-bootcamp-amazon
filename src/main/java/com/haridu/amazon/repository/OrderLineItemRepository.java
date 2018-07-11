package com.haridu.amazon.repository;

import com.haridu.amazon.model.OrderLineItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderLineItemRepository extends JpaRepository<OrderLineItem, Long> {
}
