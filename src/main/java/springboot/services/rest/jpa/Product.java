package springboot.services.rest.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
public class Product {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "designation")
	private String designation;

	@Column(name = "prix")
	private Double prix;

	@Column(name = "type")
	private String type;

	public Long getId() {

		return this.id;
	}

	public void setId(Long id) {

		this.id = id;
	}

	public String getDesignation() {

		return this.designation;
	}

	public Double getPrix() {

		return this.prix;
	}

	public String getType() {

		return this.type;
	}

	public void setDesignation(String designation) {

		this.designation = designation;
	}

	public void setPrix(Double prix) {

		this.prix = prix;
	}

	public void setType(String type) {

		this.type = type;
	}

}
