create view dbo.CriasClasificadas 
as
select c.cria_id, corral_no, convert(varchar,cria_fechaL,106) as cria_fechaL, c.cria_salud, cl.clas_grasCobertura
from crias c inner join clasificaciones cl on c.cria_id = cl.cria_id

select * from dbo.CriasClasificadas


create view dbo.CriasEnfermas
as
select c.cria_id, corral_no, cria_salud, cria_fechaL, cl.clas_grasCobertura
from crias c inner join clasificaciones cl on c.cria_id = cl.cria_id
where cria_salud in ('R','E')