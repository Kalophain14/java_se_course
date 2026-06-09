-- 01 TOPIC: SELECT

-- Glossary: 
-- SELECT = asks to choose what you are selecting
-- FROM = where you want the data aka table etc
-- ORDER BY = you order the list by whatever you selected
-- AS = creates a new row of data as per operators/changes per data
-- DISTINCT = removes dulpication on tables items

-- HOUSE RULES: 
-- Strings = '' eg 'John'
-- integars as they are
-- operands always follow the precedence(BODMAS)

SELECT 
last_name, 
first_name, 
points, 
(points * 10) + 100 AS 'discount factor'
FROM customers;
SELECT state From customers;
SELECT DISTINCT state FROM customers;

-- Excerise 1: select names + create new price
SELECT name, 
unit_price, unit_price * 1.1 AS 'new price'
FROM products;



-- 02 TOPIC: THE WHERE, AND, OR and NOT

-- WHERE = it is used to filter data of where you want the information
-- Works well with logic operators: = > >= < <= != 
-- Logical operators prescedence OR(2nd) AND(1st) NOT(3rd) 

SELECT * FROM Customers
WHERE birth_date > '1990-01-01' AND 
points > 3000;

SELECT * FROM Customers
WHERE birth_date > '1990-01-01' OR 
points > 1000;

SELECT * FROM Customers
WHERE birth_date <= '1990-01-01' OR
(points <= 2000 AND state = 'VA');

-- Excerise 2: Get the orders placed this year
SELECT * FROM orders
WHERE order_date >= '2019-01-01';

-- Excerise 3: Get orders items where price is > 30
SELECT * 
FROM order_items
WHERE order_id = 6 AND unit_price * quantity > 30;



-- 03 TOPIC: IN OPERATOR
-- Used to compare an attribute to the list of values
-- IN = helps make it easy to combine multiple operators 
-- conditions instea of multiple OR,AND,NOT

SELECT * 
FROM customers
WHERE state NOT IN ('VA', 'GA', 'FL');

-- Excerise 4: Return products 
--                   with quauntity stock to 49, 38, 72
SELECT * 
FROM products
WHERE quantity_in_stock IN (49, 38, 72);


-- 04 TOPIC: BETWEEN AND LIKE OPERATOR
-- BETWEEN = It is used to compare an attribute with a range of values
--           e.g Instead of using the points >= 1000 AND points <= 3000
SELECT *
FROM customers
WHERE points BETWEEN 1000 AND 3000;

-- Excerise 4: Return customers born 1/1/1990 and 1/1/2000
SELECT * 
FROM customers
WHERE birth_date BETWEEN '1990-01-01' 
AND '2000-01-01';

-- LIKE = it lets you find names, etc
-- % =. it lets you searches any num of characters
-- underscore (_) = it matches and searches for the characters within an attribute 
--                  character 'b____y' b + 4 char + ends wth y
-- '%b' = ends with b or 'b%' = starts with b
-- '%b%' = easy way for start and ends with


SELECT * 
FROM customers 
-- WHERE last_name LIKE '%b'
WHERE last_name LIKE 'b____y';

-- Excerise 5: Customers whose 
-- 01            address contain TRAI & AVENUE
-- 02            phone numbers end with 9

SELECT * 
FROM customers
WHERE address LIKE '%TRAIL%' OR 
	  address LIKE '%AVENUE%';

SELECT * 
FROM customers
WHERE phone LIKE '%9'




 







