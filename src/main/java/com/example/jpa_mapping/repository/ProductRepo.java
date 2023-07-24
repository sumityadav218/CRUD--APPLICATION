package com.example.jpa_mapping.repository;

import com.example.jpa_mapping.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity,Integer> {

    ProductEntity findByName(String name ) ;

}
