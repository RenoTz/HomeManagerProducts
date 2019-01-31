-- Table: produit

create table product (
	id bigserial NOT NULL,
	designation varchar(255),
	prix numeric(4,2),
	type varchar(25),
	CONSTRAINT product_pkey PRIMARY KEY (id)
);

ALTER TABLE product
  OWNER TO gedipas_catalogue;
COMMENT ON TABLE product
  IS 'Table des produits';
COMMENT ON COLUMN product.id IS 'Identifiant technique';
COMMENT ON COLUMN product.designation IS 'Désignation du produit';
COMMENT ON COLUMN product.prix IS 'Prix du produit';
COMMENT ON COLUMN product.type IS 'Type du produit';