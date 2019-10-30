create view dbo.CriasClasificadas 
as
select c.cria_id, corral_no, convert(varchar,cria_fechaL,106) as cria_fechaL, c.cria_salud, cl.clas_grasCobertura
from crias c inner join clasificaciones cl on c.cria_id = cl.cria_id

select * from dbo.CriasClasificadas

create view dbo.CriaClasificada
as
select c.cria_id from CRIAS c inner join CLASIFICACIONES cl on c.cria_id = cl.cria_id
 

create view dbo.CriasEnfermas
as
select c.cria_id, corral_no, cria_salud, cria_fechaL, cl.clas_grasCobertura
from crias c inner join clasificaciones cl on c.cria_id = cl.cria_id
where cria_salud in ('E')

create view dbo.CriasNoClas
as
select c.cria_id from Crias c left join CLASIFICACIONES cl on c.cria_id = cl.cria_id where cl.cria_id is null


create view dbo.VistaCrias
as
select * from Crias

create view dbo.VistaCriasClasSinProcesar
as
select c.cria_id, cria_fechaL, clas_grasCobertura, cria_salud 
from CRIAS c inner join CLASIFICACIONES cl 
on c.cria_id = cl.cria_id
where cria_fechaS is null




select * from CriasClasificadas
select * from VistaCrias order by cria_fechaS


select dieta_id from dietas



