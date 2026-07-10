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
-- REGEXP (regular expression = search for strings)
-- $ end with and ^ start of the string
-- You can always pipe through
-- [] the words inside the square brackets put letters before the second character
-- [gim]e == ge or ie or me will be searched and found it can be before or after
-- '[a-h]e'
-- OVERVIEW
-- WHERE last_name REGEXP 'field$|mac|rose'
-- ^ beginning
-- $ end
-- | logical or 
-- [abcd]
-- [-] range
WHERE last_name REGEXP '[a-h]e';

-- Exercises
-- 01 
SELECT *
FROM customers 
WHERE first_name REGEXP 'elka|ambur';
-- 02       
SELECT *
FROM customers 
WHERE last_name REGEXP 'EY$|ON$';

-- 03
SELECT * 
FROM customers
WHERE last_name REGEXP '^MY|SE';

-- 04
SELECT *
FROM customers
WHERE last_name REGEXP '[B]RU';



-- ============================================
-- 05 THE NULL OPERATOR
-- IS NULL (Where the is no information/record)
-- IS NOT NULL (Where the is information/record)

SELECT * 
FROM customers
WHERE phone IS NOT NULL;

-- Exercise
SELECT * 
FROM orders
WHERE shipped_date IS NULL;


-- ============================================
-- 06 THE ORDER BY CLAUSE
-- Sorting out data we use the ORDER BY
-- You can sort data by creating an alias as well

-- SELECT first_name, last_name, 10 AS points
-- FROM customers
-- ORDER BY order_id;

-- Exercise
SELECT *, quantity * unit_price AS total_price
FROM sql_store.order_items
WHERE order_id = 2
ORDER BY total_price DESC;

-- ============================================
-- 07 LIMIT
-- It allows you limit the information you want

SELECT *
FROM customers
ORDER BY points DESC
LIMIT 3;
-- Lets say you wanna choose which pages you wanna view
-- You use an offset and to which records (6, 3)
-- It will skip the first 6 records and pick 3 records
-- page 1 - 3
-- page 4 - 6
-- page 7 - 9
 
 
-- ============================================
-- 08 Inner Join
-- It is used to Join two columnns from different tables
-- Youn use the keyword JOIN and using the ON phrase
-- The first colummn will be the one you call out first on the select phrase
-- You need to quantify the column by calling the table name meaning orders.
-- You can create the aliases on repeated columns eg orders o (alias will be o)
SELECT order_id, o.customer_id, first_name, last_name
FROM orders o
JOIN customers c
ON o.customer_id = c.customer_id





