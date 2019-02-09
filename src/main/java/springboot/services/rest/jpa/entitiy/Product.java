package springboot.services.rest.jpa.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import springboot.services.rest.jpa.ref.Enseigne;
import springboot.services.rest.jpa.ref.TypeProduct;

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

	@ManyToOne
	@JoinColumn(name = "type_product_id")
	@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
	private TypeProduct type;

	@ManyToOne
	@JoinColumn(name = "enseigne_id")
	@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
	private Enseigne enseigne;

	public Long getId() {

		return this.id;
	}

	public void setId(final Long id) {

		this.id = id;
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
