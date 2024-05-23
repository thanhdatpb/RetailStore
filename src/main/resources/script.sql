CREATE TABLE users
(
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(500) NOT NULL,
    enabled BOOLEAN       NOT NULL
);

CREATE TABLE authorities
(
    id      SERIAL PRIMARY KEY,
    username varchar(50) NOT NULL,
    authority varchar(50) NOT NULL,
    CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username) ON DELETE CASCADE
);


java.sql.SQLException: Access denied for user 'postgres'@'localhost' (using password: YES)
    at com.postgresql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:129)
    at com.postgresql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:97)
    ...