create procedure ProcesarCria
	@criaID int,
	@criaFecha date
	as
	begin tran
		declare @fechaAux date
		declare @corral int
		set @fechaAux = (select cria_fechaL from crias where cria_id = @criaID)
		set @corral = (select corral_no from crias where cria_id = @criaID)
		if @criaFecha > (DATEADD(MONTH, 5, @fechaAux))
			begin
			update CRIAS set cria_fechaS = @criaFecha where cria_id = @criaID
			update MOVIMIENTOS set mov_fechaS = @criaFecha where (cria_id = @criaID and corral_no = @corral and mov_fechaS is null)
			end
		commit tran


	