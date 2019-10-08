--CREACI�N DE TABLAS

create database CorralesV2
use CorralesV2

create table CORRALES(
	corral_no int unique,
	corral_capacidad smallint not null,
	corral_tipo bit not null,

	primary key(corral_no)
	)


create table TRATAMIENTOS(
	trat_id varchar(10) not null unique,
	trat_fechaIni date not null,
	trat_fechaFin date not null,

	primary key (trat_id)
	)

create table CRIAS(
	cria_id int unique,
	cria_fechaL date not null,
	cria_fechaS date,
	cria_salud char(1) not null,
	corral_no int not null,

	primary key (cria_id),
	foreign key (corral_no) references CORRALES(corral_no)
	)

create table ENFERMAS(
	cria_id int not null,
	trat_id varchar(10) not null,
	enf_renglon int identity(1,10) not null unique,
	enf_fechaIni date not null,

	primary key (cria_id,trat_id, enf_renglon),
	foreign key (cria_id) references CRIAS(cria_id),
	foreign key (trat_id) references TRATAMIENTOS(trat_id)
	)

create table DIETAS(
	dieta_id varchar(10),
	dieta_cant int not null,
	dieta_tipo varchar(30) not null,
	cria_id int,

	primary key (dieta_id, cria_id),
	constraint FK_Dietas foreign key (cria_id) references CRIAS(cria_id)
	)

create table CLASIFICACIONES(
	clas_peso smallint not null,
	clas_colorMusculo varchar(20) not null,
	clas_cantGrasa smallint not null,
	clas_grasCobertura tinyint not null,
	cria_id int not null, 

	primary key(cria_id),
	constraint FK_CLAS foreign key (cria_id) references CRIAS(cria_id)
	)

create table SENSORES(
	sensor_id varchar(10) not null unique,
	sensor_pulso tinyint not null,
	sensor_localizacion varchar(25) not null,

	primary key (sensor_id)
	)

create table GRASA_COB2(
	cria_id int not null,
	sensor_id varchar(10) not null,

	primary key (cria_id,sensor_id),
	constraint FK_GC2_CRIA foreign key (cria_id) references CRIAS(cria_id),
	constraint FK_GC2SENSOR foreign key (sensor_id) references SENSORES(sensor_id)
	)

create table MOVIMIENTOS(
	mov_renglon int identity(1,10) not null unique,
	cria_id int not null,
	corral_no int not null, 
	mov_fechaE date not null,
	mov_fechaS date,

	primary key (cria_id, corral_no, mov_renglon),
	constraint FK_MOV_CRIA foreign key (cria_id) references CRIAS(cria_id),
	constraint FK_MOV_CORRAL foreign key (corral_no) references CORRALES(corral_no)
	)


use master
drop database CorralesV2



alter table CLASIFICACIONES add constraint CHK_Peso check (clas_peso < 1500)
alter table CLASIFICACIONES add constraint CHK_CantGrasa check (clas_cantGrasa < 1500)
alter table CORRALES add constraint CHK_Capacidad check (corral_capacidad < 5000)








