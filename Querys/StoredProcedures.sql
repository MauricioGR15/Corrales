
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



