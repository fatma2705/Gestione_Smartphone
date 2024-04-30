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
	@Column(name="versione")
	private String versione;

	@ManyToMany(mappedBy = "apps", fetch = FetchType.LAZY)
	private Set<SmartPhone> smartPhones = new HashSet<>();

	public App() {

	}

	public App(Long id, String nome, LocalDate dataInstallazione, LocalDate dataUltimoAggiornamento,String versione) {
		this.id = id;
		this.nome = nome;
		this.dataInstallazione = dataInstallazione;
		this.dataUltimoAggiornamento = dataUltimoAggiornamento;
		this.versione = versione;
	}

	public App(long id) {
		this.id = id;
	}

	public App(Long id, LocalDate dataUltimoAggiornamento, String versione) {
		this.id = id;
		this.dataUltimoAggiornamento = dataUltimoAggiornamento;
		this.versione = versione;
		
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
	
	
	

	public String getVersione() {
		return versione;
	}

	public void setVersione(String versione) {
		this.versione = versione;
	}

	@Override
	public String toString() {
		return "App [id=" + id + ", nome=" + nome + ", dataInstallazione=" + dataInstallazione
				+ ", dataUltimoAggiornamento=" + dataUltimoAggiornamento + ", versione=" + versione + "]";
	}

	
}
