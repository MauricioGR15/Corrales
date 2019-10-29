create view dbo.CriasClasificadas 
as
select c.cria_id, corral_no, convert(varchar,cria_fechaL,106) as cria_fechaL, c.cria_salud, cl.clas_grasCobertura
from crias c inner join clasificaciones cl on c.cria_id = cl.cria_id

select * from dbo.CriasClasificadas