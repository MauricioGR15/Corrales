create procedure MoverCriasCorrales
	@criaID int,
	@corralNuevo int,
	@fecha date
	as
	begin tran
		declare @corralAct int 
		set @corralAct = (select corral_no from crias where cria_id = @criaID)
		update CRIAS set corral_no = @corralNuevo where (cria_id = @criaID)
		update MOVIMIENTOS set mov_fechaS = @fecha where ((cria_id = @criaID and corral_no = @corralAct) and mov_fechaS is null)
		insert into MOVIMIENTOS (cria_id, corral_no, mov_fechaE) values (@criaID, @corralNuevo, @fecha)
	commit tran 


