-- Table: produit

create table enseigne (
	id bigserial NOT NULL,
	libelle varchar(255),
	CONSTRAINT enseigne_pkey PRIMARY KEY (id)
);

ALTER TABLE enseigne
  OWNER TO gedipas_catalogue;
COMMENT ON TABLE enseigne
  IS 'Table des enseignes';
COMMENT ON COLUMN enseigne.id IS 'Identifiant technique';
COMMENT ON COLUMN enseigne.libelle IS 'libellé de l''enseigne';

INSERT INTO enseigne (libelle) values ('AUCHAN');
INSERT INTO enseigne (libelle) values ('INTERMARCHE');
INSERT INTO enseigne (libelle) values ('CARREFOUR');
INSERT INTO enseigne (libelle) values ('CASINO');