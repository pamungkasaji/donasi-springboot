package com.pamungkasaji.donasi.service.impl;

import com.pamungkasaji.donasi.entity.Donatur;
import com.pamungkasaji.donasi.repository.DonaturRepository;
import com.pamungkasaji.donasi.service.DonaturService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonaturServiceImpl implements DonaturService {

    private final DonaturRepository donaturRepository;

    public DonaturServiceImpl(DonaturRepository donaturRepository) {
        this.donaturRepository = donaturRepository;
    }

    @Override
    public List<Donatur> findAllDonatur() {
        return donaturRepository.findAll();
    }

    @Override
    public Donatur findDonaturById(Long aLong) {
        return donaturRepository.findById(aLong).orElse(null);
    }

    @Override
    public Donatur saveDonatur(Donatur object) {
        return donaturRepository.save(object);
    }

    @Override
    public void deleteDonatur(Long aLong) {
        donaturRepository.deleteById(aLong);
    }
}
