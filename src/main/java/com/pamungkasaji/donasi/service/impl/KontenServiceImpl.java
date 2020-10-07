package com.pamungkasaji.donasi.service.impl;

import com.pamungkasaji.donasi.entity.Konten;
import com.pamungkasaji.donasi.repository.KontenRepository;
import com.pamungkasaji.donasi.service.KontenService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KontenServiceImpl implements KontenService {

    private final KontenRepository kontenRepository;

    public KontenServiceImpl(KontenRepository kontenRepository) {
        this.kontenRepository = kontenRepository;
    }

    @Override
    public List<Konten> findAllKonten() {
        return kontenRepository.findAll();
    }

    @Override
    public Konten findKontenById(Long aLong) {
        return kontenRepository.findById(aLong).orElse(null);
    }

    @Override
    public Konten saveKonten(Konten object) {
        return kontenRepository.save(object);
    }

    @Override
    public void deleteKonten(Long aLong) {
        kontenRepository.deleteById(aLong);
    }
}
