package com.pamungkasaji.donasi.service.impl;

import com.pamungkasaji.donasi.CreateEntityObject;
import com.pamungkasaji.donasi.entity.Konten;
import com.pamungkasaji.donasi.repository.KontenRepository;
import com.pamungkasaji.donasi.service.KontenService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class KontenServiceImplTest {

    @Mock
    KontenRepository kontenRepository;

    @InjectMocks
    KontenServiceImpl kontenService;

    @Test
    void findAllKonten() {
        List<Konten> kontenList = new ArrayList<>(Arrays.asList(
                CreateEntityObject.konten(),
                CreateEntityObject.konten()
        ));
        when(kontenRepository.findAll()).thenReturn(kontenList);  //stub
        List<Konten> kontenListTest = kontenService.findAllKonten();
        assertEquals(kontenList.size(), kontenListTest.size());
    }

    @Test
    void findKontenById() {
    }

    @Test
    void saveKonten() {
    }

    @Test
    void deleteKonten() {
    }
}