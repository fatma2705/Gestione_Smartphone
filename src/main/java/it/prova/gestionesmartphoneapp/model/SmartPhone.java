package it.prova.gestionesmartphoneapp.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "smartphone")

public class SmartPhone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "marca")
	private String marca;
	@Column(name = "modello")
	private String modello;
	@Column(name = "prezzo")
	private Float prezzo;
	@Column(name = "versioneos")
	private String versioneOs;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "smartphone_app", joinColumns = @JoinColumn(name = "id_smartphone"), inverseJoinColumns = @JoinColumn(name = "id_app"))
	private Set<App> apps = new HashSet<>();

	public SmartPhone(Long id, String marca, String modello, Float prezzo, String versioneOs) {
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
		this.versioneOs = versioneOs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public Float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}

	public String getVersioneOs() {
		return versioneOs;
	}

	public void setVersioneOs(String versioneOs) {
		this.versioneOs = versioneOs;
	}

	public Set<App> getApps() {
		return apps;
	}

	public void setApps(Set<App> apps) {
		this.apps = apps;
	}

	@Override
	public String toString() {
		return "SmartPhone [id=" + id + ", marca=" + marca + ", modello=" + modello + ", prezzo=" + prezzo
				+ ", versioneOs=" + versioneOs + ", apps=" + apps + "]";
	}

}
