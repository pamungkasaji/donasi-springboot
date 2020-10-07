package com.pamungkasaji.donasi.service;

import com.pamungkasaji.donasi.entity.Donatur;
import com.pamungkasaji.donasi.entity.Konten;

import java.util.List;

public interface DonaturService {

    List<Donatur> findAllDonatur();

    Donatur findDonaturById(Long id) throws Exception;

    Donatur saveDonatur(Donatur donatur);

    void deleteDonatur(Long id);
}
