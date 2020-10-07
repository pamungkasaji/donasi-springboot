package com.pamungkasaji.donasi;

import com.pamungkasaji.donasi.entity.Donatur;
import com.pamungkasaji.donasi.entity.Konten;
import com.pamungkasaji.donasi.entity.Perkembangan;
import com.pamungkasaji.donasi.entity.User;
import com.pamungkasaji.donasi.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInput implements CommandLineRunner {

    private final Logger LOG = LoggerFactory.getLogger(DonasiApplication.class);

    private final DonaturService donaturService;
    private final KontenService kontenService;
    private final PerkembanganService perkembanganService;
    private final PerpanjanganService perpanjanganService;
    private final UserService userService;

    public DataInput(DonaturService donaturService, KontenService kontenService, PerkembanganService perkembanganService,
                     PerpanjanganService perpanjanganService, UserService userService) {
        this.donaturService = donaturService;
        this.kontenService = kontenService;
        this.perkembanganService = perkembanganService;
        this.perpanjanganService = perpanjanganService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {

//        User user = userService.findUserById(1L);
//		LOG.info("User : "+user);

//        //Register User
//        User userAji= new User("usernameAji","passAji","Pamungkas Aji","Baturetno",
//                "123","456","asd.jpg");
//        userService.saveUser(userAji);
//
//        //Create Konten
//        Konten bantuSekolah = new Konten("Bantu Sekolah", "Bantu biaya sekolah anak",
//                "awd.jpg", 5000000L, 60, "12345", "BNI");
//        bantuSekolah.setUser(userAji);
//        kontenService.saveKonten(bantuSekolah);
//
//        //Create Donatur
//        Donatur donatur1 = new Donatur("Adam", 200000L, "abc.jpg", false, "443");
//        donatur1.setKonten(bantuSekolah);
//        donaturService.saveDonatur(donatur1);
//
//        //Create Perkembangan
//        Perkembangan perkembangan1 = Perkembangan.builder().judul("Bayar SPP").deskripsi("Bayar SPP Rp.400,000")
//                .penggunaanDana(400000L).build();
//        perkembangan1.setKonten(bantuSekolah);
//        perkembanganService.savePerkembangan(perkembangan1);
    }
}
