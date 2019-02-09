package springboot.services.rest.model;

import springboot.services.rest.jpa.ref.Enseigne;
import springboot.services.rest.jpa.ref.TypeProduct;

public class ProductResource {

	private Long id;
	private String designation;
	private Double prix;
	private TypeProduct type;
	private Enseigne enseigne;

	public Long getId() {

		return this.id;
	}

	public String getDesignation() {

		return this.designation;
	}

	public Double getPrix() {

		return this.prix;
	}

	public TypeProduct getType() {

		return this.type;
	}

	public void setId(final Long id) {

		this.id = id;
	}

	public void setDesignation(final String designation) {

		this.designation = designation;
	}

	public void setPrix(final Double prix) {

		this.prix = prix;
	}

	public void setType(final TypeProduct type) {

		this.type = type;
	}

	public Enseigne getEnseigne() {

		return this.enseigne;
	}

	public void setEnseigne(final Enseigne enseigne) {

		this.enseigne = enseigne;
	}

}
