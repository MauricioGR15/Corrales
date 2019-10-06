

create procedure InsertCrias 
	@id int,
	@salud tinyint,
	@fechaS date,
	@corralNo int

	as

	insert into CRIAS (cria_id, cria_salud,cria_fechaL,corral_no) values (@id, @salud, @fechaS, @corralNo);

create procedure InsertCorrales
	@no int, 
	@capacidad smallint,
	@tipo bit
	as

	insert into CORRALES values(@no, @capacidad, @tipo) 

create procedure InsertClasificaciones
	@idClas varchar(10),
	@peso smallint,
	@colorMusc varchar(20),
	@cantGrasa smallint,
	@grasCobertura tinyint,
	@criaId int
	as
	insert into CLASIFICACIONES values (@idClas,@peso,@colorMusc,@cantGrasa,@grasCobertura,@criaId)


	

