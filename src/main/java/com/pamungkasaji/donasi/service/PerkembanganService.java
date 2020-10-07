package com.pamungkasaji.donasi.service;

import com.pamungkasaji.donasi.entity.Konten;
import com.pamungkasaji.donasi.entity.Perkembangan;

import java.util.List;

public interface PerkembanganService {

    List<Perkembangan> findAllPerkembangan();

    Perkembangan findPerkembanganById(Long id) throws Exception;

    Perkembangan savePerkembangan(Perkembangan perkembangan);

    void deletePerkembangan(Long id);
}
