package com.miru.localboutique.service;

import com.miru.localboutique.model.Product;

public interface ProductService {
    Iterable<Product> getAllProducts();

    Product getProduct(long id);

    Product save(Product product);
}
