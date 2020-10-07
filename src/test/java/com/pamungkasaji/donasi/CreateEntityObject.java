package com.pamungkasaji.donasi;

import com.pamungkasaji.donasi.entity.Donatur;
import com.pamungkasaji.donasi.entity.Konten;
import com.pamungkasaji.donasi.entity.Perkembangan;
import com.pamungkasaji.donasi.entity.User;

import java.util.ArrayList;
import java.util.List;

public class CreateEntityObject {

    public static Donatur donatur(){
        return new Donatur("Hasan", 250000L, "vbcn.jpg", false, "2625");
    }

    public static List<Donatur> donaturList(){
       Donatur donatur1 = new Donatur("Arifin", 400000L, "efg.jpg", true, "2567");
       Donatur donatur2 = new Donatur("Adam", 200000L, "abc.jpg", false, "443");
       List<Donatur> donaturList = new ArrayList<>();
       donaturList.add(donatur1);
       donaturList.add(donatur2);
       return donaturList;
    }

    public static Konten konten(){
        return new Konten("Bantu Sekolah", "Bantu biaya sekolah anak",
                "awd.jpg", 5000000L, 60, "12345", "BNI");
    }

    public static List<Konten> kontenList(){
        Konten konten1 = new Konten("Bantu Yatim", "Bayar spp anak yatim",
                "cvbn.jpg", 6000000L, 90, "36357", "BCA");
        Konten konten2 = new Konten("Kuliah Untuk Anak Pesisir", "Bantu biaya kuliah Untuk anak pesisir",
                "fhng.jpg", 4000000L, 60, "34524", "Mandiri");
        List<Konten> kontenList = new ArrayList<>();
        kontenList.add(konten1);
        kontenList.add(konten2);
        return kontenList;
    }

    public static Perkembangan perkembangan(){
        return Perkembangan.builder().judul("Bayar SPP").deskripsi("Bayar SPP Rp.400,000")
                .penggunaanDana(400000L).build();
    }

    public static User user(){
        return new User("usernameAji","passAji","Pamungkas Aji","Baturetno",
                "123","456","asd.jpg");
    }

    public static List<User> userList(){
        User user1 = new User("arifin1","passArifin","Ahmad Yusuf","Pati",
                "3465","45674","gnrtr.jpg");
        User user2 = new User("aziz1","passAziz","Abdul Aziz","Salatiga",
                "34667","24274","fhnf.jpg");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        return userList;
    }
}
