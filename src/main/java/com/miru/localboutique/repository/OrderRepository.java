package com.miru.localboutique.repository;

import com.miru.localboutique.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
