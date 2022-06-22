package com.hojun.ex3.repository;

import com.hojun.ex3.entity.Guestbook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface GuestbookRepository extends JpaRepository<Guestbook, Long> , QuerydslPredicateExecutor<Guestbook> {

}
