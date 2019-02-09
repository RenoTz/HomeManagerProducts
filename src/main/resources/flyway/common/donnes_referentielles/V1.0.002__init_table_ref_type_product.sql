-- Table: produit

create table type_product (
	id bigserial NOT NULL,
	libelle varchar(255),
	CONSTRAINT type_product_pkey PRIMARY KEY (id)
);

ALTER TABLE type_product
  OWNER TO gedipas_catalogue;
COMMENT ON TABLE type_product
  IS 'Table des types de produits';
COMMENT ON COLUMN enseigne.id IS 'Identifiant technique';
COMMENT ON COLUMN enseigne.libelle IS 'libellé du type de produit';

INSERT INTO type_product (libelle) values ('ALIMENT');
INSERT INTO type_product (libelle) values ('HYGIENE');
INSERT INTO type_product (libelle) values ('MENAGE');