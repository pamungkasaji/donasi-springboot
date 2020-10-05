package com.pamungkasaji.donasi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pamungkasaji.donasi.Status;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Konten> kontenList;

    public User(String username, String password, String namaLengkap, String alamat, String noKtp,
                String noHp, String fotoKtp) {
        this.username = username;
        this.password = password;
        this.namaLengkap = namaLengkap;
        this.alamat = alamat;
        this.noKtp = noKtp;
        this.noHp = noHp;
        this.fotoKtp = fotoKtp;
        this.status = Status.VERIFIKASI;
        this.kontenList = new ArrayList<>();
    }

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    @JsonIgnore
    private String password;

    private String namaLengkap;

    private String alamat;

    private String noKtp;

    private String noHp;

    private String fotoKtp;

    //@Enumerated(EnumType.ORDINAL) //Default
    private Status status;

    @CreationTimestamp
    private LocalDateTime createdAt = LocalDateTime.now();
}
