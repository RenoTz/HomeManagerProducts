package springboot.services.rest.jpa.ref;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enseigne")
public class Enseigne {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "libelle")
	private String libelle;

	public Long getId() {

		return this.id;
	}

	public String getLibelle() {

		return this.libelle;
	}

	public void setId(Long id) {

		this.id = id;
	}

	public void setLibelle(String libelle) {

		this.libelle = libelle;
	}

}
