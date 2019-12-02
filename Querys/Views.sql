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
where cria_salud = 0

create view dbo.CriasNoClas
as
select c.cria_id from Crias c left join CLASIFICACIONES cl on c.cria_id = cl.cria_id where cl.cria_id is null


alter view view_crias
as
select cria_id, cria_fechaL,
case 
	when cria_salud = 0 then 'Enferma'
	else 'Saludable'
end as cria_salud,
corral_no from CRIAS where cria_fechaS is null

select * from view_crias

alter view view_CriasClasSinProcesar
as
select c.cria_id, cria_fechaL, clas_grasCobertura,

case 
	when cria_salud = 0 then 'Enferma'
	else 'Saludable'
end as cria_salud

from crias c inner join CLASIFICACIONES cl
on c.cria_id = cl.cria_id 
where cria_fechaS is null

create view view_dietasNormales 
as
select dieta_id,dieta_tipo from DIETAS where dieta_id like ('DIETA%')

create view view_dietasEspeciales
as
select dieta_id,dieta_tipo from DIETAS where dieta_id like ('ESPECIAL%')

create view view_SacriProcesadas
as
select cria_id from PROCESADAS
union all
select cria_id from SACRIFICADAS

create view view_listaParaSacrificio
as
select t.cria_id, enf_fechaIni,

case 
	when getdate() < enf_fechaIni then 1
	else 0
end as Sacrifiquenla

from ENFERMAS e inner join (select distinct cria_id from ENFERMAS except select cria_id from view_SacriProcesadas) t
on e.cria_id = t.cria_id

create view view_id_salud_noProcesadas as
select c.cria_id, cria_salud from crias c left join view_SacriProcesadas v
on c.cria_id = v.cria_id where v.cria_id is null

create view view_EnfermasActualmente as
select cria_id from ENFERMAS where enf_fechaFin is null
except 
select cria_id from view_SacriProcesadas

create view view_diasEnfermas as
select c.cria_id, corral_no, cria_salud, dias from crias c 
inner join (select e.cria_id,DATEDIFF(DAY,enf_fechaIni,CONVERT(DATE,GETDATE())) dias from ENFERMAS e
inner join view_EnfermasActualmente v on e.cria_id=v.cria_id where enf_fechaFin is null) t
on c.cria_id = t.cria_id

 create view view_prepareData as
 select c.cria_id, cria_salud from crias c left join view_SacriProcesadas v
 on c.cria_id = v.cria_id where v.cria_id is null

create view view_criasActivas as
select cria_id from crias 
except 
select cria_id from view_SacriProcesadas

create view select_infoGrasaC2 as
select c.cria_id, s.sensor_id, sensor_localizacion, sensor_signoVital, cria_salud 
from crias c inner join GRASA_COB2 gc on c.cria_id =gc.cria_id
inner join SENSORES s on gc.sensor_id= s.sensor_id inner join view_GC2_activas v
on c.cria_id = v.cria_id


