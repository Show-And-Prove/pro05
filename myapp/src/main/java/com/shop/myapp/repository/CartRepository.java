package com.shop.myapp.repository;

import com.shop.myapp.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {

    Cart findByMemberId(Long memberId);
}
