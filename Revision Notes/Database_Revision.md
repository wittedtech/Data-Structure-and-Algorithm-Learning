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
