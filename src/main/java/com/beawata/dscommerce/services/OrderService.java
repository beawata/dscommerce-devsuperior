package com.beawata.dscommerce.services;

import com.beawata.dscommerce.dto.OrderDTO;
import com.beawata.dscommerce.entities.Order;
import com.beawata.dscommerce.repositories.OrderRepository;
import com.beawata.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso nao encontrado"));
        return new OrderDTO(order);
    }
}
