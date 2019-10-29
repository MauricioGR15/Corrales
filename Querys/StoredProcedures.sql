

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
	insert into CLASIFICACIONES (cria_id, clas_peso,clas_cantGrasa,clas_colorMusculo,clas_grasCobertura ) 
	values (@criaId, @peso,@cantGrasa,@colorMusc,@grasCobertura)


create procedure Select_noCorral as select corral_no from CORRALES

create procedure select_Cria 
	@idCria int
	as select cria_id, corral_no, cria_salud from CRIAS where cria_id = @idCria

create procedure select_CriaClasificada 
	@idCria int
	as select * from dbo.CriasClasificadas where cria_id = @idCria


create procedure update_CriasFechaS
	@idCria int,
	@fechaS date
	as update CRIAS set cria_fechaS = @fechaS where cria_id = @idCria 

exec update_CriasFechaS @idCria =

exec select_CriaClasificada @idCria = 1	

exec select_Cria @idCria = 1

select * from CLASIFICACIONES
select * from CORRALES
select * from CRIAS



