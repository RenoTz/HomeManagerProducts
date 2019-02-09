package springboot.services.rest.model;

public class ProductResource {

	private Long id;
	private String designation;
	private Double prix;
	private ReferentielResource type;
	private ReferentielResource enseigne;

	public Long getId() {

		return this.id;
	}

	public String getDesignation() {

		return this.designation;
	}

	public Double getPrix() {

		return this.prix;
	}

	public ReferentielResource getType() {

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

	public void setType(final ReferentielResource type) {

		this.type = type;
	}

	public ReferentielResource getEnseigne() {

		return this.enseigne;
	}

	public void setEnseigne(final ReferentielResource enseigne) {

		this.enseigne = enseigne;
	}

}
