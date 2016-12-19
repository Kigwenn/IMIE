------------------------------------------------------------
--        Script Postgre 
------------------------------------------------------------



------------------------------------------------------------
-- Table: compte
------------------------------------------------------------
CREATE TABLE public.compte(
	id_compte SERIAL NOT NULL ,
	psedo     VARCHAR (25)  ,
	pw        VARCHAR (25)  ,
	CONSTRAINT prk_constraint_compte PRIMARY KEY (id_compte)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: solution
------------------------------------------------------------
CREATE TABLE public.solution(
	id_solution SERIAL NOT NULL ,
	sol_val1    INT   ,
	sol_val2    INT   ,
	sol_val3    INT   ,
	sol_val4    INT   ,
	sol_val5    INT   ,
	CONSTRAINT prk_constraint_solution PRIMARY KEY (id_solution)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: saisie
------------------------------------------------------------
CREATE TABLE public.saisie(
	id_saisie SERIAL NOT NULL ,
	sai_val1  INT   ,
	sai_val2  INT   ,
	sai_val3  INT   ,
	sai_val4  INT   ,
	sai_val5  INT   ,
	id_partie INT   ,
	CONSTRAINT prk_constraint_saisie PRIMARY KEY (id_saisie)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: partie
------------------------------------------------------------
CREATE TABLE public.partie(
	id_partie   SERIAL NOT NULL ,
	nb_essaie   INT   ,
	gagner      INT   ,
	id_compte   INT   ,
	id_solution INT   ,
	CONSTRAINT prk_constraint_partie PRIMARY KEY (id_partie)
)WITHOUT OIDS;



ALTER TABLE public.saisie ADD CONSTRAINT FK_saisie_id_partie FOREIGN KEY (id_partie) REFERENCES public.partie(id_partie);
ALTER TABLE public.partie ADD CONSTRAINT FK_partie_id_compte FOREIGN KEY (id_compte) REFERENCES public.compte(id_compte);
ALTER TABLE public.partie ADD CONSTRAINT FK_partie_id_solution FOREIGN KEY (id_solution) REFERENCES public.solution(id_solution);
