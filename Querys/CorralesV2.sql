--CREACIÓN DE TABLAS

create database CorralesV2
use CorralesV2

create table CORRALES(
	corral_no int unique,
	corral_tipo bit not null,

	primary key(corral_no)
	)

create table DIETAS(
	dieta_id varchar(10),
	dieta_cant int not null,
	dieta_tipo varchar(30) not null,

	primary key (dieta_id)
	)

create table CRIAS(
	cria_id int unique,
	cria_fechaL date not null,
	cria_fechaS date,
	cria_salud bit not null,
	corral_no int not null,
	dieta_id varchar(10) not null

	primary key (cria_id),
	foreign key (corral_no) references CORRALES(corral_no),
	foreign key (dieta_id) references DIETAS(dieta_id),

	constraint FK_CriasCorral foreign key (corral_no) references CORRALES(corral_no),
	constraint FK_CriasDietas foreign key (dieta_id) references DIETAS(dieta_id)
	)

create table ENFERMAS(
	cria_id int not null,
	enf_renglon int identity(1,5) not null unique,
	enf_fechaIni date not null,
	enf_fechaFin date,

	primary key (cria_id, enf_renglon),
	foreign key (cria_id) references CRIAS(cria_id)
	)


create table CLASIFICACIONES(
	cria_id int not null, 
	clas_peso smallint not null,
	clas_colorMusculo varchar(20) not null,
	clas_cantGrasa smallint not null,
	clas_grasCobertura tinyint not null,
	
	primary key(cria_id),
	constraint FK_CLAS foreign key (cria_id) references CRIAS(cria_id)
	)

create table SENSORES(
	sensor_id int identity(1,5) not null unique,
	sensor_localizacion varchar(25),

	primary key (sensor_id)
	)

create table GRASA_COB2(
	cria_id int not null,
	sensor_id int not null,
	sensor_tics int identity,
	sensor_signoVital tinyint,

	primary key (cria_id,sensor_id,sensor_tics),
	constraint FK_GC2_CRIA foreign key (cria_id) references CRIAS(cria_id),
	constraint FK_GC2SENSOR foreign key (sensor_id) references SENSORES(sensor_id)
	)

	

create table MOVIMIENTOS(
	cria_id int not null,
	corral_no int not null, 
	mov_renglon int identity(1,10) not null unique,
	mov_fechaE date not null,
	mov_fechaS date,

	primary key (cria_id, corral_no, mov_renglon),
	constraint FK_MOV_CRIA foreign key (cria_id) references CRIAS(cria_id),
	constraint FK_MOV_CORRAL foreign key (corral_no) references CORRALES(corral_no)
	)

create table SACRIFICADAS(
	cria_id int,
	sac_fecha date,
	
	primary key (cria_id),
	constraint FK_sacrificada foreign key (cria_id) references CRIAS(cria_id)
	)

create table PROCESADAS(
	cria_id int,
	pro_fecha date,

	primary key (cria_id),
	constraint FK_procesada foreign key (cria_id) references CRIAS(cria_id)
	)


use master
drop database CorralesV2



alter table CLASIFICACIONES add constraint CHK_Peso check (clas_peso < 700)
alter table CLASIFICACIONES add constraint CHK_CantGrasa check (clas_cantGrasa between 0 and 100)
alter table CORRALES add constraint CHK_Capacidad check (corral_capacidad between 0 and 1000)

alter table CRIAS add constraint CHK_FECHAS check (cria_fechaS > cria_fechaL)
insert into CRIAS values (15,'20201028','20191028','S',1,'DIETA01')

select * from DIETAS
select * from CLASIFICACIONES








