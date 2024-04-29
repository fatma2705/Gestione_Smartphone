package it.prova.gestionesmartphoneapp.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "app")

public class App {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "data_installazione")
	private LocalDate dataInstallazione;
	@Column(name = "data_ultimo_aggiornamento")
	private LocalDate dataUltimoAggiornamento;

	@ManyToMany(mappedBy = "smartphones", fetch = FetchType.LAZY)
	private Set<SmartPhone> smartPhones = new HashSet<>();

	public App() {

	}

	public App(Long id, String nome, LocalDate dataInstallazione, LocalDate dataUltimoAggiornamento) {
		this.id = id;
		this.nome = nome;
		this.dataInstallazione = dataInstallazione;
		this.dataUltimoAggiornamento = dataUltimoAggiornamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataInstallazione() {
		return dataInstallazione;
	}

	public void setDataInstallazione(LocalDate dataInstallazione) {
		this.dataInstallazione = dataInstallazione;
	}

	public LocalDate getDataUltimoAggiornamento() {
		return dataUltimoAggiornamento;
	}

	public void setDataUltimoAggiornamento(LocalDate dataUltimoAggiornamento) {
		this.dataUltimoAggiornamento = dataUltimoAggiornamento;
	}

	public Set<SmartPhone> getSmartPhones() {
		return smartPhones;
	}

	public void setSmartPhones(Set<SmartPhone> smartPhones) {
		this.smartPhones = smartPhones;
	}

	@Override
	public String toString() {
		return "App [id=" + id + ", nome=" + nome + ", dataInstallazione=" + dataInstallazione
				+ ", dataUltimoAggiornamento=" + dataUltimoAggiornamento + "]";
	}

}
