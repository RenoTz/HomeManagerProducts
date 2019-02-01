package springboot.services.rest.model;

public class ProductResource {

	private Long id;
	private String designation;
	private Double prix;
	private TypeProductEnum type;

	public Long getId() {

		return this.id;
	}

	public String getDesignation() {

		return this.designation;
	}

	public Double getPrix() {

		return this.prix;
	}

	public TypeProductEnum getType() {

		return this.type;
	}

	public void setId(Long id) {

		this.id = id;
	}

	public void setDesignation(String designation) {

		this.designation = designation;
	}

	public void setPrix(Double prix) {

		this.prix = prix;
	}

	public void setType(TypeProductEnum type) {

		this.type = type;
	}

}
