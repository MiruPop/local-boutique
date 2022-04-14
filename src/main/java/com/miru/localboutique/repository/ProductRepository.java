package com.miru.localboutique.repository;

import com.miru.localboutique.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
