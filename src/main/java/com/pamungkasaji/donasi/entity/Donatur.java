package com.pamungkasaji.donasi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
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
