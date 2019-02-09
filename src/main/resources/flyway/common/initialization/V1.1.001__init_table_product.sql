-- Table: produit

create table product (
	id bigserial NOT NULL,
	designation varchar(255),
	prix numeric(4,2),
	type_product_id bigint,
	enseigne_id bigint, 
	CONSTRAINT product_pkey PRIMARY KEY (id),
	CONSTRAINT fk_product_type_product FOREIGN KEY (type_product_id)
    REFERENCES type_product (id) MATCH SIMPLE
    ON UPDATE NO ACTION ON DELETE NO ACTION,
	CONSTRAINT fk_product_enseigne FOREIGN KEY (enseigne_id)
    REFERENCES enseigne (id) MATCH SIMPLE
    ON UPDATE NO ACTION ON DELETE NO ACTION
);

ALTER TABLE product
  OWNER TO gedipas_catalogue;
COMMENT ON TABLE product
  IS 'Table des produits';
COMMENT ON COLUMN product.id IS 'Identifiant technique';
COMMENT ON COLUMN product.designation IS 'Désignation du produit';
COMMENT ON COLUMN product.prix IS 'Prix du produit';
COMMENT ON COLUMN product.type_product_id IS 'Identifiant du type du produit';
COMMENT ON COLUMN product.enseigne_id IS 'Identifiant de l''enseigne';

CREATE INDEX type_product_id_idx
  ON product
  USING btree
  (type_product_id);
  
CREATE INDEX enseigne_id_idx
  ON product
  USING btree
  (enseigne_id);