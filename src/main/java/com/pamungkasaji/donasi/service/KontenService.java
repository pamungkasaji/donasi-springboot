package com.pamungkasaji.donasi.service;

import com.pamungkasaji.donasi.entity.Konten;

import java.util.List;

public interface KontenService {

    List<Konten> findAllKonten();

    Konten findKontenById(Long id) throws Exception;

    Konten saveKonten(Konten konten);

    void deleteKonten(Long id);
}
