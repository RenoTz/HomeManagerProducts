-- Table: produit

create table enseigne (
	id bigserial NOT NULL,
	code varchar(3),
	libelle varchar(255),
	CONSTRAINT enseigne_pkey PRIMARY KEY (id)
);

ALTER TABLE enseigne
  OWNER TO gedipas_catalogue;
COMMENT ON TABLE enseigne
  IS 'Table des enseignes';
COMMENT ON COLUMN enseigne.id IS 'Identifiant technique';
COMMENT ON COLUMN enseigne.code IS 'code de l''enseigne';
COMMENT ON COLUMN enseigne.libelle IS 'libellé de l''enseigne';

INSERT INTO enseigne (code,libelle) values ('CAR', 'CARREFOUR');
INSERT INTO enseigne (code,libelle) values ('INT', 'INTERMARCHE');
INSERT INTO enseigne (code,libelle) values ('CAS', 'CASINO');
INSERT INTO enseigne (code,libelle) values ('AUC','AUCHAN');