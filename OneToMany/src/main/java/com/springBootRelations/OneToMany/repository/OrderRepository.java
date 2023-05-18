package com.springBootRelations.OneToMany.repository;

import com.springBootRelations.OneToMany.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
