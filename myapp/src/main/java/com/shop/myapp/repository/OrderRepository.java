package com.shop.myapp.repository;


import com.shop.myapp.entity.Order;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query(value = "select o from Order o " +
            "where o.member.email = :email " +
            "order by o.orderDate desc", nativeQuery = true)
    List<Order> findOrders(@Param("email") String email, Pageable pageable);

    @Query(value = "select count(o) from Order o " +
            "where o.member.email = :email", nativeQuery = true)
    Long countOrder(@Param("email") String email);

}
