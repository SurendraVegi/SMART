package com.onet.solutions.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author : Otorus
 * @since : 1/10/18
 */
@Data
@Entity
@Table(name = "alamat",
        indexes = {
                @Index(columnList = "nama", name = "nama_alamat_idx"),
                @Index(columnList = "alamat", name = "alamat_alamat_idx")
        })
public class Address {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 150)
    @Column(nullable = false)
    private String nama;

    @Column(nullable = false)
    @NotNull
    @NotEmpty
    private String alamat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_karyawan")
    private Employee karyawan;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public Employee getKaryawan() {
		return karyawan;
	}

	public void setKaryawan(Employee karyawan) {
		this.karyawan = karyawan;
	}

}
