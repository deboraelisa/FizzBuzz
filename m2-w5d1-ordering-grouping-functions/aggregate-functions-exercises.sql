-- The following queries utilize the "world" database.
-- Write queries for the following problems. 
-- Notes:
--   GNP is expressed in units of one million US Dollars
--   The value immediately after the problem statement is the expected number 
--   of rows that should be returned by the query.

-- 1. The name and state plus population of all cities in states that border Ohio 
-- (i.e. cities located in Pennsylvania, West Virginia, Kentucky, Indiana, and 
-- Michigan).  
-- The name and state should be returned as a single column called 
-- name_and_state and should contain values such as ‘Detroit, Michigan’.  
-- The results should be ordered alphabetically by state name and then by city 
-- name. 
-- (19 rows)
--********
select CONCAT(name, ', ', district) as name_and_state, population from city
where district in ('Pennsylvania', 'West Virginia', 'Kentucky', 'Indiana',
'Michigan')
group by name, district, population
order by district, name


-- 2. The name, country code, and region of all countries in Africa.  The name and
-- country code should be returned as a single column named country_and_code 
-- and should contain values such as ‘Angola (AGO)’ 
-- (58 rows)
select CONCAT(name, ' (', code, ')') as country_and_code, region from country
where continent = 'Africa'


-- 3. The per capita GNP (i.e. GNP divided by population) of all countries in the 
-- world sorted from highest to lowest 
-- (232 rows)
select (GNP/population * 1000000) as per_capita_GNP from country
where population > 0
order by per_capita_GNP DESC


-- 4. The average life expectancy of countries in South America.
-- (average life expectancy in South America: 70.9461)
select avg(lifeexpectancy) as average_life_expectancy_in_South_America from country
where continent = 'South America'


-- 5. The sum of the population of all cities in California.
-- (total population of all cities in California: 16716706)
select sum(population)as total_population_of_cities_in_California from city
where district = 'California'

-- 6. The sum of the population of all cities in China.
-- (total population of all cities in China: 175953614)
select sum(population) as total_population_all_cities_in_China from city
where countrycode = 'CHN'

-- 7. The maximum population of all countries in the world.
-- (largest country population in world: 1277558000)
select max(population) as largest_country_population_in_world from country

--OR
select name, population as most_populous_country_in_the_world from country
order by population DESC
limit 1

-- 8. The maximum population of all cities in the world.
-- (largest city population in world: 10500000)
select max(population) as largest_city_population_in_the_world from city

--OR
select name, population as most_populous_city_in_the_world from city
order by population DESC 
limit 1 

-- 9. The maximum population of all cities in Australia.
-- (largest city population in Australia: 3276207)
select max(population) as largest_city_population_in_Australia from city
where countrycode = 'AUS'

select name, population as most_populous_city_in_Australia from city
where countrycode = 'AUS'
order by population DESC 
limit 1 

-- 10. The minimum population of all countries in the world.
-- (smallest_country_population in world: 50)
select min(population) as smallest_country_population_in_the_world from country
where population > 0

--OR
select name, population as smallest_country_population_in_the_world from country
where population > 0
order by population ASC
limit 1 

-- 11. The average population of cities in the United States.
-- (avgerage city population in USA: 286955.3795)
select avg(population) as Average_city_population_in_the_USA from city
where countrycode = 'USA'

-- 12. The average population of cities in China.
-- (average city population in China: 484720.6997 approx.)
select avg(population) as Average_city_population_in_China from city
where countrycode = 'CHN'

-- 13. The surface area of each continent ordered from highest to lowest.
-- (largest continental surface area: 31881000, "Asia")
select sum(surfacearea) as largest_continental_surface_area, continent from country
where surfacearea is not null
group by continent
order by sum(surfacearea) DESC

-- 14. The highest population density (surface area divided by population) of all 
-- countries in the world. 
-- (highest population density in world: 38.6801)
select max(surfacearea/population) as highest_population_density_in_world from country
where population > 0


-- 15. The population density and life expectancy of the top ten countries with the 
-- highest life expectancies in descending order. 
-- (highest life expectancies in world: 83.5, 0.006, "Andorra")
select lifeexpectancy, (surfacearea/population) as population_density, name from country
where population > 0 and lifeexpectancy > 0
order by lifeexpectancy DESC
limit 10


-- 16. The difference between the previous and current GNP of all the countries in 
-- the world ordered by the absolute value of the difference. Display both 
-- difference and absolute difference.
-- (smallest difference: 1.00, 1.00, "Ecuador")
select  (GNP - GNPOLD) as GNP_difference, ABS(GNPOLD - GNP) as absolute_GNP_difference, name from country
order by absolute_GNP_difference ASC


-- 17. The average population of cities in each country (hint: use city.countrycode)
-- ordered from highest to lowest.
-- (highest avg population: 4017733.0000, "SGP")
select avg(population) as highest_average_population, countrycode from city
group by countrycode
order by avg(population) DESC


-- 18. The count of cities in each state in the USA, ordered by state name.
-- (45 rows)
select count(*) as number_of_cities, district from city
where countrycode = 'USA'
group by district
order by district


-- 19. The count of countries on each continent, ordered from highest to lowest.
-- (highest count: 58, "Africa")
select count(*) as number_of_countries, continent from country
group by continent
order by number_of_countries DESC
	
-- 20. The count of cities in each country ordered from highest to lowest.
-- (largest number of  cities ib a country: 363, "CHN")
select count(*), countrycode from city
group by countrycode
order by count DESC
	
-- 21. The population of the largest city in each country ordered from highest to 
-- lowest.
-- (largest city population in world: 10500000, "IND")
select max(population) as population_of_largest_city, countrycode from city
group by countrycode
order by max(population) desc


-- 22. The average, minimum, and maximum non-null life expectancy of each continent 
-- ordered from lowest to highest average life expectancy. 
-- (lowest average life expectancy: 52.5719, 37.2, 76.8, "Africa")
select avg(lifeexpectancy) as Average_life_expectancy, min(lifeexpectancy) as Minimum_life_expectancy, max(lifeexpectancy) as Maximum_life_expectancy, continent from country
where lifeexpectancy is not null
group by continent
order by avg(lifeexpectancy)

