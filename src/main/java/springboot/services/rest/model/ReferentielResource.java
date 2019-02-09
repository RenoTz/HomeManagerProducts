package springboot.services.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReferentielResource {

	@JsonProperty(value = "id")
	private Long refId;

	@JsonProperty(value = "code")
	private String code;

	@JsonProperty(value = "libelle")
	private String libelle;

	public Long getRefId() {

		return this.refId;
	}

	public void setRefId(final Long refId) {

		this.refId = refId;
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
