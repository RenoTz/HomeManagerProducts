package springboot.services.rest.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import springboot.services.rest.model.TypeProductEnum;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "designation")
	private String designation;

	@Column(name = "prix")
	private Double prix;

	@Enumerated(EnumType.STRING)
	@Column(name = "type")
	private TypeProductEnum type;

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

	public TypeProductEnum getType() {

		return this.type;
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
