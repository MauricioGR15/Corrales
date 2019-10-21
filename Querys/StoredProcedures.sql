

create procedure InsertCrias 
	@id int,
	@salud tinyint,
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
	insert into CLASIFICACIONES values (@criaId, @peso,@colorMusc,@cantGrasa,@grasCobertura)


create procedure Select_noCorral as select corral_no from CORRALES
	

