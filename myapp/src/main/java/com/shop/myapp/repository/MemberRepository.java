package com.shop.myapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.myapp.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);
}