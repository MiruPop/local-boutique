package com.miru.localboutique.service;

import com.miru.localboutique.model.Product;
import com.miru.localboutique.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.NoSuchElementException;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new NoSuchElementException("Produit non trouvé"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
