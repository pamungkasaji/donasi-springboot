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
    public List<Donatur> findAll() {
        return donaturRepository.findAll();
    }

    @Override
    public Donatur findById(Long aLong) {
        return donaturRepository.findById(aLong).orElse(null);
    }

    @Override
    public Donatur save(Donatur object) {
        return donaturRepository.save(object);
    }

    @Override
    public void delete(Donatur object) {
        donaturRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        donaturRepository.deleteById(aLong);
    }
}
