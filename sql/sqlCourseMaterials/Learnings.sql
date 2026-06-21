-- SQL BY MOSH

-- ============================================
-- 01 TOPIC: SELECT

-- Glossary: 
-- SELECT = asks to choose what you are selecting
-- FROM = where you want the data aka table etc
-- ORDER BY = you order the list by whatever you selected
-- AS = creates a new row of data as per operators/changes per data
-- DISTINCT = removes duplication on tables items

-- HOUSE RULES: 
-- Strings = '' eg 'John'
-- Integers as they are
-- Operands always follow the precedence (BODMAS)

USE sql_store;

SELECT 
	last_name, 
	first_name, 
	points, 
	(points * 10) + 100 AS 'discount_factor'
FROM customers;

SELECT state FROM customers;

SELECT DISTINCT state FROM customers;

-- Exercise 1: Select names + create new price
SELECT 
	name, 
	unit_price, 
	unit_price * 1.1 AS 'new_price'
FROM products;

-- ============================================
-- 02 TOPIC: THE WHERE, AND, OR AND NOT

-- WHERE = used to filter data from where you want the information
-- Works well with logic operators: = > >= < <= != 
-- Logical operators precedence: NOT (1st) AND (2nd) OR (3rd)

SELECT * FROM customers
WHERE birth_date > '1990-01-01' AND 
	  points > 3000;

SELECT * FROM customers
WHERE birth_date > '1990-01-01' OR 
	  points > 1000;

SELECT * FROM customers
WHERE birth_date <= '1990-01-01' OR
	  (points <= 2000 AND state = 'VA');

-- Exercise 2: Get the orders placed this year
SELECT * FROM orders
WHERE order_date >= '2019-01-01';

-- Exercise 3: Get orders items where price is > 30
SELECT * 
FROM order_items
WHERE order_id = 6 AND unit_price * quantity > 30;


-- ============================================
-- 03 TOPIC: IN OPERATOR
-- Used to compare an attribute to a list of values
-- IN = helps make it easy to combine multiple OR/AND/NOT conditions
-- instead of multiple OR statements

SELECT * 
FROM customers
WHERE state NOT IN ('VA', 'GA', 'FL');

-- Exercise 4: Return products with quantity stock 49, 38, 72
SELECT * 
FROM products
WHERE quantity_in_stock IN (49, 38, 72);


-- ============================================
-- 04 TOPIC: BETWEEN AND LIKE OPERATOR

-- BETWEEN = Used to compare an attribute with a range of values
--           e.g Instead of using points >= 1000 AND points <= 3000

SELECT *
FROM customers
WHERE points BETWEEN 1000 AND 3000;

-- Exercise 4a: Return customers born between 1/1/1990 and 1/1/2000
SELECT * 
FROM customers
WHERE birth_date BETWEEN '1990-01-01' AND '2000-01-01';

-- LIKE = lets you find names, etc
-- % = searches any number of characters
-- underscore (_) = matches single character within an attribute 
--                  e.g 'b____y' = b + 4 chars + ends with y
-- '%b' = ends with b | 'b%' = starts with b | '%b%' = contains b

SELECT * 
FROM customers 
WHERE last_name LIKE 'b____y';

-- Exercise 5a: Customers whose address contains TRAIL or AVENUE
SELECT * 
FROM customers
WHERE address LIKE '%TRAIL%' OR 
	  address LIKE '%AVENUE%';

-- Exercise 5b: Customers whose phone numbers end with 9
SELECT * 
FROM customers
WHERE phone LIKE '%9';

-- Exercise 5c: Get all customers
SELECT * FROM customers;

-- State range query (BETWEEN syntax)
SELECT * FROM customers
WHERE state BETWEEN 'CA' AND 'LA';

SELECT * 
FROM customers
-- WHERE last_name LIKE '%field'
WHERE last_name REGEXP '^field|mac|rose';




