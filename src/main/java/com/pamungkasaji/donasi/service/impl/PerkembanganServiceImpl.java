package com.pamungkasaji.donasi.service.impl;

import com.pamungkasaji.donasi.entity.Perkembangan;
import com.pamungkasaji.donasi.repository.PerkembanganRepository;
import com.pamungkasaji.donasi.service.PerkembanganService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerkembanganServiceImpl implements PerkembanganService {

    private final PerkembanganRepository perkembanganRepository;

    public PerkembanganServiceImpl(PerkembanganRepository perkembanganRepository) {
        this.perkembanganRepository = perkembanganRepository;
    }

    @Override
    public List<Perkembangan> findAllPerkembangan() {
        return perkembanganRepository.findAll();
    }

    @Override
    public Perkembangan findPerkembanganById(Long aLong) {
        return perkembanganRepository.findById(aLong).orElse(null);
    }

    @Override
    public Perkembangan savePerkembangan(Perkembangan object) {
        return perkembanganRepository.save(object);
    }

    @Override
    public void deletePerkembangan(Long aLong) {
        perkembanganRepository.deleteById(aLong);
    }
}
