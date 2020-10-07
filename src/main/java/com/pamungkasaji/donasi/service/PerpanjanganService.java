package com.pamungkasaji.donasi.service;

import com.pamungkasaji.donasi.entity.Konten;
import com.pamungkasaji.donasi.entity.Perpanjangan;

import java.util.List;

public interface PerpanjanganService {

    List<Perpanjangan> findAllPerpanjangan();

    Perpanjangan findPerpanjanganById(Long id) throws Exception;

    Perpanjangan savePerpanjangan(Perpanjangan perpanjangan);

    void deletePerpanjangan(Long id);
}
