--let's find out who made payment 16666:
select * from payment where payment_id=16666

-- that gives us a customer_id, but not the name
--we can use the custome_id to get the name from the customer table
--join has to be after from and before where
select *, first_name, last_name from payment
join customer on payment.customer_id = customer.customer_id
where payment_id=16666

--we can see that the * pulls back everything from both tables
--we just want everything from payment and then the first and last name of the customer:
select payment.*, first_name, last_name from payment
join customer on payment.customer_id = customer.customer_id
where payment_id=16666

--when did they return the rental?
--where would that data come from the rental table
select payment.*, first_name, last_name, return_date from payment
join customer on payment.customer_id = customer.customer_id
join rental on payment.rental_id = rental.rental_id
where payment_id=16666

--what did they rent? join on inventory
select payment.*, first_name, last_name, return_date, film_id from payment
join customer on payment.customer_id = customer.customer_id
join rental on payment.rental_id = rental.rental_id
join inventory on rental.inventory_id = inventory.inventory_id
where payment_id=16666

--what if we wanted to know the name of the film?
select payment.*, first_name, last_name, return_date, title from payment
join customer on payment.customer_id = customer.customer_id
join rental on payment.rental_id = rental.rental_id
join inventory on rental.inventory_id = inventory.inventory_id
join film on inventory.film_id = film.film_id
where payment_id=16666

--what if we wanted to know who acted in that film? *** also can alias column names ex. payment as p, customer as c
select payment.*, customer.first_name, customer.last_name, return_date, title, actor.first_name, actor.last_name from payment
join customer on payment.customer_id = customer.customer_id
join rental on payment.rental_id = rental.rental_id
join inventory on rental.inventory_id = inventory.inventory_id
join film on inventory.film_id = film.film_id
join film_actor on film_actor.film_id = film.film_id
join actor on film_actor.actor_id = actor.actor_id
where payment_id=16666

--what if we wanted a list of all the films and their categories ordered by film title?
select f.title, g.name from film f
join film_category fc on fc.film_id = f.film_id
join category g on g.category_id = fc.category_id
order by f.title

--show all 'comedy' fims ordered by film title

select f.title from film f
join film_category fc on fc.film_id = f.film_id
join category c on fc.category_id = c.category_id
where c.name = 'Comedy'

select film.title from film
join film_category on film_category.film_id = film.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Comedy'

--Union
select first_name from customer
union
select first_name from actor

--let's display a list of all countries and their capitals. if they have some(there should be 239) Using JOIN, if merging row with Null, it won't keep the row.
select country.name, city.name from country
join city on country.capital = city.id

--fixing the null using a LEFT JOIN(joins everything from column on left
select country.name, city.name from country
left join city on country.capital = city.id
 