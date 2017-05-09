package com.example;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "device", path = "devices")
public interface DeviceRepository extends PagingAndSortingRepository<Device, Long> {

	List<Device> findByName(@Param("name") String name);

}
