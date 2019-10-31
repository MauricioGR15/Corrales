
-- PROCEDIMIENTOS DE INSERCIONES

create procedure InsertCorrales
	@no int, 
	@capacidad smallint,
	@tipo bit
	as
	insert into CORRALES values(@no, @capacidad, @tipo) 

create procedure insertSensores
	@pulso tinyint,
	@localizacion varchar(25)
	as insert into SENSORES values (@pulso, @localizacion)

create procedure insertMovimientos
	@idCria int, 
	@corralNo int,
	@fechaE date
	as
	insert into Movimientos(cria_id, corral_no, mov_fechaE)  values (@idCria, @corralNo, @fechaE)

create procedure insertGraCobertura
	@idCria int, 
	@idSensor int
	as insert into GRASA_COB2 values (@idCria,@idSensor)

create procedure insertEnfermas
	@idCria int,
	@tratId varchar(10),
	@fechaIni date
	as insert into ENFERMAS (cria_id, trat_id, enf_fechaIni) values (@idCria, @tratId, @fechaIni)

create procedure insertTratamientos
	@tratId varchar(10),
	@fechaIni date,
	@fechaFin date
	as insert into TRATAMIENTOS values (@tratId, @fechaIni, @fechaFin)