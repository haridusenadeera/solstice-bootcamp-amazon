package com.haridu.amazon.repository;

import com.haridu.amazon.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
}
