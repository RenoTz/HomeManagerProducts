package springboot.services.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReferentielResource {

	@JsonProperty(value = "id")
	private Long id;

	@JsonProperty(value = "code")
	private String code;

	@JsonProperty(value = "libelle")
	private String libelle;

	public Long getId() {

		return this.id;
	}

	public void setId(final Long id) {

		this.id = id;
	}

	public String getLibelle() {

		return this.libelle;
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
