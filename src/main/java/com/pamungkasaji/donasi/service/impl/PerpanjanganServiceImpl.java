package com.pamungkasaji.donasi.service.impl;

import com.pamungkasaji.donasi.entity.Perpanjangan;
import com.pamungkasaji.donasi.repository.PerpanjanganRepository;
import com.pamungkasaji.donasi.service.PerpanjanganService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerpanjanganServiceImpl implements PerpanjanganService {

    private final PerpanjanganRepository perpanjanganRepository;

    public PerpanjanganServiceImpl(PerpanjanganRepository perpanjanganRepository) {
        this.perpanjanganRepository = perpanjanganRepository;
    }

    @Override
    public List<Perpanjangan> findAllPerpanjangan() {
        return perpanjanganRepository.findAll();
    }

    @Override
    public Perpanjangan findPerpanjanganById(Long aLong) {
        return perpanjanganRepository.findById(aLong).orElse(null);
    }

    @Override
    public Perpanjangan savePerpanjangan(Perpanjangan object) {
        return perpanjanganRepository.save(object);
    }

    @Override
    public void deletePerpanjangan(Long aLong) {
        perpanjanganRepository.deleteById(aLong);
    }
}
