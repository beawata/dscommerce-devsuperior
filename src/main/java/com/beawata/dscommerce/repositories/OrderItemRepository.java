package com.beawata.dscommerce.repositories;

import com.beawata.dscommerce.entities.Order;
import com.beawata.dscommerce.entities.OrderItem;
import com.beawata.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {


}
