# SQL Concepts

SQL (Structured Query Language) is a domain-specific language used in programming and designed for managing data held in a relational database management system (RDBMS).

## 1. Data Definition Language (DDL)

DDL is used for defining or modifying the structure of database objects.

### Examples:
- `CREATE TABLE`: Creates a new table.
- `ALTER TABLE`: Modifies an existing table's structure.
- `DROP TABLE`: Deletes a table.
- `CREATE INDEX`: Creates an index on a table.
- `DROP INDEX`: Deletes an index.

## 2. Data Manipulation Language (DML)

DML is used for managing data within database objects.

### Examples:
- `INSERT INTO`: Adds new records into a table.
- `SELECT`: Retrieves data from one or more tables.
- `UPDATE`: Modifies existing records in a table.
- `DELETE FROM`: Removes records from a table.

## 3. Data Query Language (DQL)

DQL is used to fetch information from the database.

### Example:
- `SELECT`: Retrieves data from one or more tables based on specified criteria.

## 4. Data Control Language (DCL)

DCL is used for controlling access to data within the database.

### Examples:
- `GRANT`: Provides specific privileges to users or roles.
- `REVOKE`: Revokes previously granted privileges.

## 5. Transaction Control Language (TCL)

TCL is used for managing transactions within the database.

### Examples:
- `COMMIT`: Saves changes made during the current transaction.
- `ROLLBACK`: Undoes changes made during the current transaction.
- `SAVEPOINT`: Sets a point within the current transaction to which you can later roll back.

## 6. Constraints

Constraints are rules enforced on data columns to ensure the integrity of the data.

### Examples:
- `PRIMARY KEY`: Uniquely identifies each record in a table.
- `FOREIGN KEY`: Enforces referential integrity between tables.
- `UNIQUE`: Ensures that all values in a column are unique.
- `NOT NULL`: Ensures that a column cannot contain NULL values.
- `CHECK`: Verifies that all values in a column satisfy a specific condition.

## 7. Joins

Joins are used to combine rows from multiple tables based on a related column between them.

### Types of Joins:
- `INNER JOIN`: Returns only the rows that have matching values in both tables.
- `LEFT JOIN`: Returns all rows from the left table and the matched rows from the right table.
- `RIGHT JOIN`: Returns all rows from the right table and the matched rows from the left table.
- `FULL JOIN`: Returns all rows when there is a match in either table.

## 8. Aggregate Functions

Aggregate functions perform a calculation on a set of values and return a single value.

### Examples:
- `SUM()`: Calculates the sum of values.
- `AVG()`: Calculates the average of values.
- `COUNT()`: Counts the number of rows.
- `MIN()`: Finds the minimum value.
- `MAX()`: Finds the maximum value.

## 9. Subqueries

Subqueries are nested queries that provide data to the enclosing query.

### Example:
- `SELECT * FROM table1 WHERE column1 IN (SELECT column1 FROM table2)`

## 10. Views

Views are virtual tables that display the results of a SELECT query.

### Example:
- `CREATE VIEW view_name AS SELECT column1, column2 FROM table WHERE condition`

## 11. Stored Procedures

Stored procedures are sets of SQL statements stored in the database and can be called by name.

### Example:
- `CREATE PROCEDURE procedure_name AS ...`

## 12. Triggers

Triggers are special types of stored procedures that automatically execute when certain events occur in the database.

### Example:
- `CREATE TRIGGER trigger_name BEFORE INSERT ON table_name FOR EACH ROW BEGIN ... END`

## 13. Transactions

Transactions are sequences of SQL statements that are executed as a single unit of work.

### Example:
- `BEGIN TRANSACTION; ... COMMIT;`

## 14. Data Types

Data types define the type of data that can be stored in a column.

### Common Data Types:
- `INTEGER`: Stores whole numbers.
- `VARCHAR`: Variable-length character string.
- `DATE`: Stores date values.
- `BOOLEAN`: Stores true or false values.
- `FLOAT`: Stores floating-point numbers.

## 15. Database Normalization

Database normalization is the process of organizing the columns and tables of a relational database to reduce redundancy and improve data integrity.

### Normal Forms:
- First Normal Form (1NF)
- Second Normal Form (2NF)
- Third Normal Form (3NF)
- Boyce-Codd Normal Form (BCNF)
- Fourth Normal Form (4NF)
- Fifth Normal Form (5NF)

## Conclusion

Understanding these SQL concepts is essential for effectively working with relational databases and writing efficient SQL queries.



# SQL Notes: MySQL vs. Oracle DB vs. PostgreSQL

| MySQL               | Oracle DB         | PostgreSQL        | Description                                                       |
|---------------------|-------------------|-------------------|-------------------------------------------------------------------|
| `CREATE DATABASE`  | `CREATE DATABASE` | `CREATE DATABASE` | Creates a new database.                                           |
| `USE database_name` | `CONNECT`         | `\c database_name`| Connects to a specific database.                                  |
| `SHOW DATABASES`   | `SELECT * FROM all_users` | `\l`       | Lists all databases.                                              |
| `DROP DATABASE`    | `DROP DATABASE`   | `DROP DATABASE`   | Deletes a database.                                               |
| `CREATE TABLE`     | `CREATE TABLE`    | `CREATE TABLE`    | Creates a new table.                                              |
| `SHOW TABLES`      | `SELECT table_name FROM user_tables` | `\dt` | Lists all tables in the current schema.                           |
| `DESCRIBE table_name` | `DESCRIBE table_name` | `\d table_name` | Describes the structure of a table.                               |
| `DROP TABLE`       | `DROP TABLE`      | `DROP TABLE`      | Deletes a table.                                                  |
| `ALTER TABLE`      | `ALTER TABLE`     | `ALTER TABLE`     | Modifies the structure of a table.                                |
| `INSERT INTO`      | `INSERT INTO`     | `INSERT INTO`     | Inserts new rows into a table.                                    |
| `SELECT`           | `SELECT`          | `SELECT`          | Retrieves data from one or more tables.                           |
| `UPDATE`           | `UPDATE`          | `UPDATE`          | Modifies existing data in a table.                                |
| `DELETE FROM`      | `DELETE FROM`     | `DELETE FROM`     | Deletes rows from a table.                                        |
| `GROUP BY`         | `GROUP BY`        | `GROUP BY`        | Groups rows that have the same values into summary rows.          |
| `ORDER BY`         | `ORDER BY`        | `ORDER BY`        | Sorts the result set in ascending or descending order.            |
| `JOIN`             | `JOIN`            | `JOIN`            | Retrieves data from multiple tables based on a related column.     |
| `UNION`            | `UNION`           | `UNION`           | Combines the results of two or more SELECT statements.            |
| `CREATE INDEX`     | `CREATE INDEX`    | `CREATE INDEX`    | Creates an index on a table.                                      |
| `DROP INDEX`       | `DROP INDEX`      | `DROP INDEX`      | Deletes an index.                                                 |

*Note: This table provides a basic comparison of SQL commands and concepts in MySQL, Oracle DB, and PostgreSQL. Depending on the specific use case and version, there may be differences or additional features in each database system.*
