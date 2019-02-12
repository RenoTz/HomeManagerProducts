package springboot.services.rest.jpa.ref;


import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public abstract class AbstractDonneeDeReference implements Serializable {

	private static final long serialVersionUID = 3197341295986240962L;

	public abstract Long getId();

	public abstract void setId(Long id);

	public abstract String getCode();

	public abstract void setCode(String code);

	public abstract String getLibelle();

	public abstract void setLibelle(String libelle);
	
	@Override
	public boolean equals(Object other) {
		
		if(other == null || !(other instanceof AbstractDonneeDeReference)) {
			return false;
		}
		final AbstractDonneeDeReference addr = (AbstractDonneeDeReference) other;
		final EqualsBuilder eb = new EqualsBuilder();
		eb.append(this.getCode(), addr.getCode())
		.append(this.getId(), addr.getId())
		.append(this.getLibelle(), addr.getLibelle());
		return eb.isEquals();
	}
	
	
	@Override
	public int hashCode() {
		final HashCodeBuilder hcb = new HashCodeBuilder();
		hcb.append(this.getCode())
		.append(this.getId())
		.append(this.getLibelle());
		return hcb.build();
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(this.getCode()).append(" - ").append(this.getLibelle());
		return sb.toString();
	}
	
}
