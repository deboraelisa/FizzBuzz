--making California into a new country
insert into country(code, name, continent, region, surfacearea, population, localname, governmentform, code2)
values ('WUS', 'Western United States', 'North America', 'Western United States', 163696, 39250017, 'The Valley', 'Fascist Socialism', 'WU' );

--verified that new WUS country has been created
select * from country where continent = 'North America';

--moved all cities from district California into new WUS country
update city
set countrycode = 'WUS'
where district = 'California';

select countrycode from city
where district = 'California';

--error update violates foreign key constraint:
--update city
--set countrycode = 'WAS'
--where district = 'California';

update country
set capital = (select id from city where name = 'Sacramento' and countrycode = 'WUS')
where code = 'WUS';

select * from country
join city on country.capital = city.id
where country.code = 'WUS';

--reversing the process, making california into a state again
update city
set countrycode = 'USA'
where countrycode = 'WUS';

--make this as explicit as possible before using the delete key word
delete from country
where code = 'WUS';

--it is now gone from the database
select * from country
where code = 'WUS';


--transactions
begin;

delete from countrylanguage
where isofficial = true;

select * from countrylanguage
where isofficial = true;

rollback;

select * from countrylanguage
where isofficial = true;