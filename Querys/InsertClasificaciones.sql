create procedure InsertClasificaciones
	@peso smallint,
	@colorMusc varchar(20),
	@cantGrasa smallint,
	@grasCobertura tinyint,
	@criaId int
	as
	begin tran
		begin try
			insert into CLASIFICACIONES (cria_id, clas_peso,clas_cantGrasa,clas_colorMusculo,clas_grasCobertura ) 
			values (@criaId, @peso,@cantGrasa,@colorMusc,@grasCobertura)

			if @grasCobertura = 2 
				begin
				declare @idSensor int
				set @idSensor = (select top 1 sensor_id from sensores order by sensor_id desc)
				exec insertGraCobertura @criaId, @idSensor
				end 
			commit tran
		end try
		begin catch
			rollback tran
		end catch 
