package springboot.services.rest.jpa.ref;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "type_product")
public class TypeProduct {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "code")
	private String code;

	@Column(name = "libelle")
	private String libelle;

	public Long getId() {

		return this.id;
	}

	public String getLibelle() {

		return this.libelle;
	}

	public void setId(final Long id) {

		this.id = id;
	}

	public void setLibelle(final String libelle) {

		this.libelle = libelle;
	}

	public String getCode() {

		return this.code;
	}

	public void setCode(final String code) {

		this.code = code;
	}

}
