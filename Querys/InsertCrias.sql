create procedure insertCria 
	@idCria int,
	@fechaL date,
	@salud char(1),
	@noCorral int,
	@dieta varchar(10)
	as
	begin tran
		insert into crias (cria_id, cria_fechaL,cria_salud, corral_no, dieta_id) 
		values (@idCria, @fechaL, @salud, @noCorral, @dieta)
		insert into MOVIMIENTOS (cria_id, corral_no, mov_fechaE) values (@idCria, @noCorral, @fechaL)
	commit tran
	
