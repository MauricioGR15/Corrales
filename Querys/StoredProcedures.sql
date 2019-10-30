

create procedure InsertCrias 
	@id int,
	@salud char,
	@fechaL date,
	@corralNo int,
	@dietaID varchar
	as
	insert into CRIAS (cria_id, cria_salud,cria_fechaL,corral_no,dieta_id) values (@id, @salud, @fechaL, @corralNo,@dietaID);


create procedure InsertCorrales
	@no int, 
	@capacidad smallint,
	@tipo bit
	as
	insert into CORRALES values(@no, @capacidad, @tipo) 

create procedure InsertClasificaciones
	@peso smallint,
	@colorMusc varchar(20),
	@cantGrasa smallint,
	@grasCobertura tinyint,
	@criaId int
	as
	begin tran
		insert into CLASIFICACIONES (cria_id, clas_peso,clas_cantGrasa,clas_colorMusculo,clas_grasCobertura ) 
		values (@criaId, @peso,@cantGrasa,@colorMusc,@grasCobertura)

		if @grasCobertura = 2 
			begin
			insert into GRASA_COB2 values (@criaId, (select top 1 sensor_id from sensores order by sensor_id desc))
			end 
	commit tran


create procedure select_Cria 
	@idCria int
	as select cria_id, corral_no, cria_salud from CRIAS where cria_id = @idCria

create procedure select_CriaClasificada 
	@idCria int
	as select * from dbo.CriasClasificadas where cria_id = @idCria


create procedure update_CriasFechaS
	@idCria int,
	@fechaS date
	as 
	BEGIN TRAN
		update CRIAS set cria_fechaS = @fechaS where cria_id = @idCria 
		update MOVIMIENTOS set mov_fechaS = @fechaS where cria_id = @idCria
	COMMIT TRAN
		



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

create procedure select_CriaClas
	@idCria int
	as select cria_id from dbo.CriaClasificada where cria_id = @idCria




select corral_no, case when corral_tipo = 1 then 'Sanas' else 'Enfermas' end as corral_tipo  from CORRALES

select corral_tipo from CORRALES


insert into MOVIMIENTOS values (1,1,'20191028',null)
insert into SENSORES values (null,null)

exec insertSensores @pulso = 120,@localizacion = 'Culiacan'
exec insertMovimientos @idCria = 50, @corralNo = 2, @fechaE = '20191029'

exec select_CriaClasificada @idCria = 1	

exec select_Cria @idCria = 1

select * from CLASIFICACIONES
select * from CORRALES
select * from CRIAS
select * from MOVIMIENTOS
select * from SENSORES
select * from GRASA_COB2
select * from DIETAS

select top 1 sensor_id from sensores order by sensor_id desc

delete from CRIAS 
delete from MOVIMIENTOS
delete from CLASIFICACIONES
delete from CORRALES
delete from GRASA_COB2
delete from SENSORES



