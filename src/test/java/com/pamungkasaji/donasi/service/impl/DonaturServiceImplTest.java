package com.pamungkasaji.donasi.service.impl;

import com.pamungkasaji.donasi.CreateEntityObject;
import com.pamungkasaji.donasi.entity.Donatur;
import com.pamungkasaji.donasi.repository.DonaturRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DonaturServiceImplTest {

    @Mock
    DonaturRepository donaturRepository;

    @InjectMocks
    DonaturServiceImpl donaturService;

    @Test
    void findAllDonatur() {
        List<Donatur> donaturList = CreateEntityObject.donaturList();
        when(donaturRepository.findAll()).thenReturn(donaturList);  //stub
        List<Donatur> donaturListTest = donaturService.findAllDonatur();
        assertEquals(donaturList.size(), donaturListTest.size());
    }

    @Test
    void findDonaturById() {
        Donatur donatur = CreateEntityObject.donatur();
        when(donaturRepository.findById(anyLong())).thenReturn(Optional.of(donatur));
        Donatur donaturTest = donaturService.findDonaturById(1L);
        assertEquals(donatur, donaturTest);
    }

    @Test
    void saveDonatur() {
        Donatur donatur = CreateEntityObject.donatur();
        when(donaturRepository.save(any())).thenReturn(donatur);
        Donatur donaturTest = donaturService.saveDonatur(donatur);
        assertNotNull(donaturTest);
        verify(donaturRepository).save(any());
    }

    @Test
    void deleteDonatur() {
        donaturService.deleteDonatur(1L);
        verify(donaturRepository).deleteById(anyLong());
    }
}