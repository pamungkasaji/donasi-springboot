package com.pamungkasaji.donasi.repository;

import com.pamungkasaji.donasi.entity.Donatur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonaturRepository extends JpaRepository<Donatur, Long> {
}
