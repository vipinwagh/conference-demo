package com.vipinwagh.conferencedemo.repositories;

import com.vipinwagh.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
