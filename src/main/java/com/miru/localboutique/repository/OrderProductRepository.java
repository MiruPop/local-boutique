package com.miru.localboutique.repository;

import com.miru.localboutique.model.OrderProduct;
import com.miru.localboutique.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
