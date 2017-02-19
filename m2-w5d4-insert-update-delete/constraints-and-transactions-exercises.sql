-- Write queries to return the following: dvdstore database
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
insert into actor(first_name, last_name) values ( 'HAMPTON', 'AVENUE');
insert into actor(first_name, last_name) values ( 'LISA', 'BYWAY');

--tests
select * from actor
where first_name = 'LISA' and last_name = 'BYWAY';

select * from actor
where first_name = 'HAMPTON' and last_name = 'AVENUE';

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	


insert into film (title, description, release_year, language_id, length)
values ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);

--test
select * from film
where title = 'Euclidean PI'


-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

insert into film_actor(actor_id, film_id) values (201, 1001); 
insert into film_actor(actor_id, film_id) values (202, 1001); 

--test
select * from film 
join film_actor on film.film_id = film_actor.film_id
join actor on film_actor.actor_id = actor.actor_id
where film.title = 'Euclidean PI';


-- 4. Add Mathmagical to the category table.

insert into category(category_id, name) values(17, 'Mathmagical');

--test
select * from category;


-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
INSERT INTO film_category (film_id, category_id) VALUES (1001, 17);--"Euclidean PI"
INSERT INTO film_category (film_id, category_id) VALUES (274, 17);--"EGG IGBY"
INSERT INTO film_category (film_id, category_id) VALUES (494, 17);--"KARATE MOON"
INSERT INTO film_category (film_id, category_id) VALUES (714, 17);--"RANDOM GO"
INSERT INTO film_category (film_id, category_id) VALUES (996, 17);--"YOUNG LANGUAGE"

--test
select film.title, category.name as category from film
join film_category on film_category.film_id = film.film_id
join category on film_category.category_id = category.category_id 
where category.name = 'Mathmagical';


-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)

begin;

update film
set rating = 'G'
where film_id in
(select film.film_id from film
join film_category on film_category.film_id = film.film_id
join category on film_category.category_id = category.category_id 
where category.name = 'Mathmagical');

rollback;

--(select film_id from film_category where film_category.category_id = 17);

--test
select * from film
join film_category on film_category.film_id = film.film_id
join category on film_category.category_id = category.category_id 
where category.name = 'Mathmagical';

-- 7. Add a copy of "Euclidean PI" to all the stores.
begin;

insert into inventory(film_id, store_id) values((select film_id from film 
where title = 'Euclidean PI'),1);
insert into inventory(film_id, store_id) values((select film_id from film 
where title = 'Euclidean PI'),2);

commit;

--test
select * from inventory order by film_id desc


-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)

--No, it did not succeed. There is a FOREIGN KEY CONSTRAINT ERROR: update or delete on table "film" violates foreign key constraint "film_actor_film_id_fkey" on table "film_actor"
--Detail: Key (film_id)=(1001) is still referenced from table "film_actor".

begin;

delete from film
where title = 'Euclidean PI';

rollback;


-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)

--Not, it did not succeed. There is a FOREIGN KEY CONSTRAINT ERROR: update or delete on table "category" violates foreign key constraint "film_category_category_id_fkey" on table "film_category"
--Detail: Key (category_id)=(17) is still referenced from table "film_category".
begin;

delete from category
where name = 'Mathmagical';

rollback;


-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)
--Yes, it succeeded because it deleted the connection between the category and film_category tables. 
begin;

delete from film_category
where category_id in
(select film_category.category_id from film_category 
join category on film_category.category_id = category.category_id 
where category.name = 'Mathmagical');

rollback;

--tests
(select film_category.category_id from film_category 
join category on film_category.category_id = category.category_id 
where category.name = 'Mathmagical');

 select * from film where title = 'Euclidean PI';
 
-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)

--Delete Mathmagical- this worked!
begin;

delete from category
where name = 'Mathmagical';

rollback;

--test
select * from category
where name = 'Mathmagical';


--Delete "Euclidean PI" - This did not work, the movie is still referenced on table film_actor.  ERROR: update or delete on table "film" violates foreign key constraint "film_actor_film_id_fkey" on table "film_actor"
--Detail: Key (film_id)=(1001) is still referenced from table "film_actor".
begin;

delete from film
where title = 'Euclidean PI';

rollback;


-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

--Constraints of film id:
--CONSTRAINT pk_film_film_id PRIMARY KEY (film_id),
--CONSTRAINT ck_film_rating CHECK (rating IN ('G', 'PG', 'PG-13', 'R', 'NC-17'))
--);
 --We would need to delete the actor_id/film_id connection for both Hampton Avenue and Lisa Byway from the film_actor table in order to disconnect them from the film "Euclidean PI" before being able to remove the film itself from the film table.

