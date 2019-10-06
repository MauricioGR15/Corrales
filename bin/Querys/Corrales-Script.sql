create database CORRALES

use CORRALES

create table CORRALES(
	corral_no int NOT NULL,
	corral_tipo varchar(20) NOT NULL,
	primary key (corral_no)
)

create table DIETAS(
	dieta_id varchar(10) NOT NULL,
	dieta_descr varchar(140) NOT NULL,
	dieta_tipo varchar(40) NOT NULL,
	dieta_cant int NOT NULL,
	primary key (dieta_id)
)

create table MEDICAMENTOS(
	med_clave varchar(13) NOT NULL,
	med_nombre varchar(50) NOT NULL,
	primary key (med_clave)
)

create table CRIAS(
	cria_id varchar(10) NOT NULL,
	cria_sensor bit NOT NULL,
	cria_salud tinyint NOT NULL,
	cria_fechaL date NOT NULL,
	cria_fechaS date,
	corral_no int NOT NULL,
	dieta_id varchar(10) NOT NULL,
	foreign key (corral_no) REFERENCES CORRALES (corral_no),
	foreign key (dieta_id) REFERENCES DIETAS (dieta_id),
	primary key (cria_id)
)

create table CLASIFICACIONES(
	clas_id varchar(10),
	cria_id varchar(10) ,
	clas_pesoKG smallint NOT NULL,
	clas_colorMusculo varchar(20) NOT NULL,
	clas_cantGrasa smallint NOT NULL,
	clas_grasaCobertura tinyint NOT NULL,
	primary key (clas_id,cria_id),
	foreign key (cria_id) REFERENCES CRIAS (cria_id)
)

create table TRATAMIENTOS(
	trat_id int,
	trat_renglon int NOT NULL identity,
	cria_id varchar(10) NOT NULL,
	med_clave varchar(13) NOT NULL,
	trat_fechaInicio date NOT NULL,
	trat_fechaFinal date NOT NULL,
	primary key (trat_id,trat_renglon),
	foreign key (cria_id) REFERENCES CRIAS (cria_id),
	foreign key (med_clave) REFERENCES MEDICAMENTOS (med_clave)
)



	ALTER LOGIN sa ENABLE ;  
GO  
ALTER LOGIN sa WITH PASSWORD = 'sa' ;  
GO  

use master
drop database Corrales

select * from MEDICAMENTOS