package com.vipinwagh.conferencedemo.repositories;

import com.vipinwagh.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long>{
}
