package com.pamungkasaji.donasi.entity;

import com.pamungkasaji.donasi.Status;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "donatur")
public class Donatur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_konten")
    private Konten konten;

    public Donatur(String nama, Long jumlah, String bukti, boolean anonim, String noHp) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.bukti = bukti;
        this.anonim = anonim;
        this.noHp = noHp;
        this.diterima = false;
    }

    private String nama;

    private Long jumlah;

    private String bukti;

    private boolean anonim;

    private boolean diterima;

    private String noHp;

    @CreationTimestamp
    private LocalDateTime createdAt = LocalDateTime.now();
}
