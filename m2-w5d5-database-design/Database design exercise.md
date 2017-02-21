BEGIN;

CREATE TABLE job_titles 
(
	job_title_id serial,
	job_name varchar(32),
	CONSTRAINT pk_job_titles_job_title_id PRIMARY KEY(job_title_id)
);


CREATE TABLE employees
(
	employee_number serial,
	job_title_id integer NOT NULL,
	first_name varchar(32) NOT NULL,
	last_name varchar(32) NOT NULL,
	gender varchar(16) NOT NULL,
	birthday date,
	hire_date date NOT NULL,
	department_number integer NOT NULL,	
	CONSTRAINT pk_employees_employee_number PRIMARY KEY(employee_number),
	CONSTRAINT fk_job_title_id FOREIGN KEY (job_title_id) REFERENCES job_titles(job_title_id)
);


CREATE TABLE departments 
(
	department_number serial,
	department_name varchar(32) NOT NULL,
	CONSTRAINT pk_departments_department_number PRIMARY KEY(department_number)
);


CREATE TABLE projects 
(
	project_number serial,
	project_name varchar(32) NOT NULL,
	CONSTRAINT pk_project_number PRIMARY KEY(project_number)
);

CREATE TABLE project_employee 
(
	project_number integer NOT NULL,
	employee_number integer NOT NULL,
	CONSTRAINT pk_project_department_project_number_department_number PRIMARY KEY (project_number, employee_number)
);


INSERT INTO job_titles (job_title_id, job_name) VALUES (1, 'CEO');
INSERT INTO job_titles (job_title_id, job_name) VALUES (2, 'Sales Director');
INSERT INTO job_titles (job_title_id, job_name) VALUES (3, 'Artistic Director');
INSERT INTO job_titles (job_title_id, job_name) VALUES (4, 'Draftsperson');
INSERT INTO job_titles (job_title_id, job_name) VALUES (5, 'Salesperson');
INSERT INTO job_titles (job_title_id, job_name) VALUES (6, 'Customer Service Representative');
	
	SELECT setval(pg_get_serial_sequence('job_titles', 'job_title_id'), 7);


INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday, hire_date, department_number) VALUES (1,1, 'Bob', 'Carpenter', 'male', '1965/1/23', '2006/1/1', 2);	
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday, hire_date, department_number) VALUES (2,2, 'Richard', 'Perkins', 'male', '1968/4/15', '2006/1/1', 1);	
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday, hire_date, department_number) VALUES (3,3, 'Annabelle', 'Strauss', 'female', '1973/5/12', '2007/5/10', 3);	
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday, hire_date, department_number) VALUES (4,4, 'Veronika', 'Antwerp', 'female', '1975/10/27', '2006/1/1', 3);	
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday, hire_date, department_number) VALUES (5,4, 'Robert', 'Devine', 'male', '1971/6/19', '2009/1/1', 3);	
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday, hire_date, department_number) VALUES (6,5, 'Ed', 'Cohen', 'male', '1980/3/17', '2012/3/4', 1);	
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday, hire_date, department_number) VALUES (7,6, 'Heather', 'James', 'female', '1982/3/9', '2012/1/15', 4);	
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday, hire_date, department_number) VALUES (8,6, 'Anthony', 'McCain', 'male', '1988/6/4', '2013/1/15', 4);		

	SELECT setval(pg_get_serial_sequence('employees', 'employee_number'), 9);


INSERT INTO departments (department_number, department_name) VALUES (1, 'Sales');
INSERT INTO departments (department_number, department_name) VALUES (2, 'Management');
INSERT INTO departments (department_number, department_name) VALUES (3, 'Artistic');
INSERT INTO departments (department_number, department_name) VALUES (4, 'Customer Service');
	
	SELECT setval(pg_get_serial_sequence('departments', 'department_number'), 4);


INSERT INTO projects (project_number, project_name) VALUES (1, 'Grand Shazam');
INSERT INTO projects (project_number, project_name) VALUES (2, 'The Outdoor Party');
INSERT INTO projects (project_number, project_name) VALUES (3, 'Boomerang Feast');
INSERT INTO projects (project_number, project_name) VALUES (4, 'Miles Away');

	SELECT setval(pg_get_serial_sequence('projects', 'project_number'), 5);
	

INSERT INTO project_employee (project_number, employee_number) VALUES (1,1);
INSERT INTO project_employee (project_number, employee_number) VALUES (2,4);
INSERT INTO project_employee (project_number, employee_number) VALUES (3,3);
INSERT INTO project_employee (project_number, employee_number) VALUES (4,6);


ALTER TABLE employees
ADD FOREIGN KEY(department_number)
REFERENCES departments(department_number); 


ALTER TABLE project_employee
ADD FOREIGN KEY(employee_number)
REFERENCES employees(employee_number); 

ALTER TABLE project_employee
ADD FOREIGN KEY(project_number)
REFERENCES projects(project_number); 


COMMIT;





-- # Database Design Exercise
--
-- ### Implement a database to hold the contents of simple Project Organizer.
--
-- The Project Organizer tracks what department and individual employees are working on a given project.
--
-- Each employee has the following attributes:
--
-- * employee number
-- * job title
-- * lastname
-- * firstname
-- * gender
-- * birthday
-- * hiredate
-- * works for a department
--
-- Each department has the following attributes:
--
-- * department number
-- * name
-- * has zero-to-many employees
--
-- Each project has the following attributes:
--
-- * project number
-- * name
-- * startdate
-- * has zero-to-many employees
--
-- **Requirements**
--
-- All tables are required to have a primary key.
--
-- Populate the tables with data for at least four projects, three departments, and eight employees.
--
-- Make sure each project has at least one employee assigned to it, and each department has at least two employees in it.
--
-- **Design Tips:**
--
-- Questions you should ask yourself.
--
-- * Is a natural key available for the primary key, or will you need a surrogate?
-- * What data type should be used for each column?
-- * What attribues are required? Which are optional?
-- * Are there additional constraints such as length, data format, or restricted values for any columns?
-- * What table columns will the user likely search?
-- * Is there an official list of valid job titles?
--
-- Don't forget to normalize.
