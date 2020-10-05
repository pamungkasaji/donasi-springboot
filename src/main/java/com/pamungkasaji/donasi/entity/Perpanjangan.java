package com.pamungkasaji.donasi.entity;

import com.pamungkasaji.donasi.Status;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
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
