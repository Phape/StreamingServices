package com.streamingservice.StreamingService;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "streamingServices", path = "noah")
public interface StreamingServiceRepository extends PagingAndSortingRepository<StreamingService, Long> {
    // Kann leer bleiben
}