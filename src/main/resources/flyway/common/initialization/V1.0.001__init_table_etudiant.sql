-- Table: etudiant

CREATE TABLE etudiant
(
  id bigserial NOT NULL,
  nom character varying(255),
  prenom character varying(255)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE etudiant
  OWNER TO postgres;

  
INSERT into etudiant (nom, prenom) values ('Trezieres', 'Vanessa');
INSERT into etudiant (nom, prenom) values ('Trezieres', 'Renaud');
  
