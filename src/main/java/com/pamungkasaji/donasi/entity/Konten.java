package com.pamungkasaji.donasi.entity;

import com.pamungkasaji.donasi.Status;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "konten")
public class Konten {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_user")
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "konten")
    private List<Donatur> donaturList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "konten")
    private List<Perkembangan> perkembanganList;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "konten")
    private Perpanjangan perpanjangan;

    public Konten(String judul, String deskripsi, String gambar, Long target, int lamaDonasi,
                  String nomorrekening, String bank) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
        this.target = target;
        this.lamaDonasi = lamaDonasi;
        this.nomorrekening = nomorrekening;
        this.bank = bank;
        this.terkumpul = 0L;
        this.status = Status.VERIFIKASI;
        this.donaturList = new ArrayList<>();
        this.perkembanganList = new ArrayList<>();
    }

    private String judul;

    @Lob
    private String deskripsi;

    private String gambar;

    private Long target;

    private Long terkumpul;

    private int lamaDonasi;

    private String nomorrekening;

    private String bank;

    private Status status;

    @CreationTimestamp
    private LocalDateTime createdAt = LocalDateTime.now();
}
