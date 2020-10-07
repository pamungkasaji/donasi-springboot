package com.pamungkasaji.donasi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "perpanjangan")
public class Perpanjangan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="id_konten")
    private Konten konten;

    private Status status;

    private int jumlahHari;

    @Lob
    private String alasan;

    @CreationTimestamp
    private LocalDateTime createdAt = LocalDateTime.now();
}
