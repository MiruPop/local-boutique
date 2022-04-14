package com.miru.localboutique.service;

import com.miru.localboutique.model.OrderProduct;
import com.miru.localboutique.repository.OrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class OrderProductServiceImpl implements OrderProductService {

    @Autowired
    OrderProductRepository orderProductRepository;

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return this.orderProductRepository.save(orderProduct);
    }
}
