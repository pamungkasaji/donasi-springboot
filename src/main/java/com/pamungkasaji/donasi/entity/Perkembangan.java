package com.pamungkasaji.donasi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "perkembangan")
public class Perkembangan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_konten")
    private Konten konten;

    private String judul;

    private Long penggunaanDana;

    @Lob
    private String deskripsi;

    private String gambar;

    @CreationTimestamp
    private LocalDateTime createdAt = LocalDateTime.now();
}
